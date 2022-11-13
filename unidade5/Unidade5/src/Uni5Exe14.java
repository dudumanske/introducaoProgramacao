import java.util.Scanner;

public class Uni5Exe14 {
    /*
     * Um comerciante deseja fazer um levantamento do lucro das 20 mercadorias que
     * comercializa. Para cada mercadoria ele tem o nome, o preço de compra (PC) e o
     * preço de venda (PV). Descreva um algoritmo que:
     * 
     * escreva quantas mercadorias proporcionam: (lucro < 10%), (10% <= lucro <=
     * 20%) e (lucro > 20%), onde o percentual de lucro é calculado da seguinte
     * forma: % = (PV - PC) / PC * 100;
     * determine e escreva o valor total de compra e de venda de todas as
     * mercadorias, assim como o lucro total.
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int lucroBaixo = 0, lucroMedio = 0, lucroAlto =0;
        double pvTotal = 0, pcTotal = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Nome da " + i +"a mercadoria:");
            String nome = tec.next();
            System.out.println("Informe o preço de compra da " + i + "a mercadoria:");
            Double pc = tec.nextDouble();
            System.out.println("Informe o preço de venda da " + i + "a mercadoria:");
            Double pv = tec.nextDouble();
            double lucro = (pv - pc) / pc * 100;
            if (lucro < 10) {
                lucroBaixo++;
            } else if (lucro <= 10 && lucro <= 20) {
                lucroMedio++;
            } else {
                lucroAlto++;
            }
            pvTotal += pv;
            pcTotal += pc;
        }
        tec.close();
        System.out.println(lucroBaixo + " mercadoria(s) tem lucro < 10%");
        System.out.println(lucroMedio + " mercadoria(s) tem lucro <= 10% e <= 20%");
        System.out.println(lucroAlto + " mercadoria(s) tem lucro > 20%");
        System.out.println("O valor total de compra foi de R$ " + pcTotal + " e o valor total de venda foi de R$ " + pvTotal);
        double lucroTotal = ((pvTotal - pcTotal) / pcTotal * 100) / 20;
        System.out.println("O lucro total foi de R$ " + lucroTotal);
    }
}

import java.util.Scanner;

public class Uni5Exe19 {
    /*Uma loja de departamentos oferece para seus clientes um determinado desconto de acordo com o valor da compra efetuada. O desconto é de 
    20% caso o valor da compra seja maior que R$ 500,00 e de 15% caso seja menor ou igual. Descreva um algoritmo que leia o valor da compra e 
    escreva o total a pagar a cada compra. Informe também o valor total recebido pela loja ao final do dia. A leitura deve ser finalizada com 
    a leitura 0 para o valor da compra.*/
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double valorCompra = 1, totalCompra = 0;
        while (valorCompra != 0) {
            System.out.println("Informe o valor da compra:");
            valorCompra = tec.nextDouble();
            if (valorCompra != 0) {
                if (valorCompra <= 500) {
                    valorCompra = valorCompra * 0.85;
                    totalCompra += valorCompra;
                    System.out.println("O valor da compra ficará por: R$ " + valorCompra);
                } else if (valorCompra > 500) {
                    valorCompra = valorCompra * 0.80;
                    totalCompra += valorCompra;
                    System.out.println("O valor da compra ficará por: R$ " + valorCompra);
                }
            }
        }
        tec.close();
        System.out.println("O valor total recebdo pela loja foi de: R$ " + totalCompra);
    }
}

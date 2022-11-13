import java.util.Scanner;

public class Uni4Exe07 {
    /*O custo do selo de uma carta com até 50 gramas é de R$ 0,45. As cartas com peso superior pagam um adicional de R$ 0,45 por cada 20 
    gramas, ou fração, em que excedem aquele peso. Escreva um algoritmo que dado o peso da carta, em gramas, determine o custo do selo. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o peso da carta(em gramas): ");
        double pesoCarta = tec.nextDouble();
        tec.close();
        double valorPagar = 0;
        if (pesoCarta <= 50) {
            valorPagar = 0.45;
            System.out.println("O selo custará: R$ " + valorPagar);
        } else {
            double pesoExcedido = pesoCarta - 50;
            int qntAdicional = (int) pesoExcedido / 20 + 1;
            valorPagar = 0.45 * qntAdicional;
            System.out.println("O selo custará: R$ " + valorPagar);
        }
    }
}

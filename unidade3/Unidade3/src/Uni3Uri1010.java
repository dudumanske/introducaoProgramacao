import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1010 {
    /*Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o 
    número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        //int codPeca1 = tec.nextInt();
        int numPeca1 = tec.nextInt();
        double valorPeca1 = tec.nextDouble();
        //int codPeca2 = tec.nextInt();
        int numPeca2 = tec.nextInt();
        double valorPeca2 = tec.nextDouble();
        tec.close();
        double total = numPeca1 * valorPeca1 + numPeca2 * valorPeca2;
        System.out.println("VALOR A PAGAR: R$ " + df.format(total));
    }
}

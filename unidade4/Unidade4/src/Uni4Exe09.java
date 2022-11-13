import java.util.Scanner;

public class Uni4Exe09 {
    /*Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int valor1 = tec.nextInt();
        int valor2 = tec.nextInt();
        tec.close();
        double resposta = valor1 % valor2;
        if (resposta == 0) {
            System.out.println("Os números são múltiplos");
        } else {
            System.out.println("Os números não são múltiplos");
        }
    }
}

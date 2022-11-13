import java.util.Scanner;

public class Uni3Exe10 {
    /*Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.
    Fórmula:

    hipotenusa^2=cateto1^2+cateto^2 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe quanto vale o cateto 1 o triângulo retângulo: ");
        int cateto1 = teclado.nextInt();
        System.out.println("Informe quanto vale o cateto 2 o triângulo retângulo: ");
        int cateto2 = teclado.nextInt();
        teclado.close();

        double hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
        
        System.out.println("O comprimento da hipotenusa é de: " + hipotenusa);
    }
}

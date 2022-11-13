import java.util.Scanner;

public class Uni3Exe11 {
    /*Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:

    °F = (9/5) °C + 32 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a temperatura em C°: ");
        double tempC = teclado.nextDouble();
        teclado.close();
        
        double tempF = 1.8 * tempC + 32;

        System.out.println("A temperatura de C°" + tempC + " converteu para F°" + tempF);
    }
}

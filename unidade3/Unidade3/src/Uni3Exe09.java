import java.util.Scanner;

public class Uni3Exe09 {
    /*Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:

    volume:=:\Pi::raio^2::altura */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double pi = 3.14;

        System.out.println("Informe o raio da lata de óleo: ");
        double raio = teclado.nextDouble();
        System.out.println("Informe a altura da lata de óleo: ");
        double altura = teclado.nextDouble();
        teclado.close();

        double volume = pi * (raio * raio) * altura;

        System.out.println("O volume da lata de óleo é: " + volume);
    }
}

import java.util.Scanner;

public class Uni3Exe06 {
    /*Um restaurante cobra R$ 25,00 por cada quilo de refeição. Escreva um programa que leia o peso do prato 
    montado pelo cliente (em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas. */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o peso do prato(em quilos): ");
        double pesoPrato = teclado.nextDouble();
        teclado.close();

        double valorPrato = (pesoPrato - 0.750) * 25;

        System.out.println("O valor que o cliente deve pagar será de R$ " + valorPrato);
    }
}

import java.util.Scanner;

public class Uni5Exe02 {
    /*Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 100. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                par = par + i;
            } else {
                impar = impar + i;
            }
        }
        tec.close();
        System.out.println("A soma dos números pares é: " + par);
        System.out.println("A soma dos números ímpares é: " + impar);
    }
}

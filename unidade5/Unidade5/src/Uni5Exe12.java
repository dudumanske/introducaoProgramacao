import java.util.Scanner;

public class Uni5Exe12 {
    /*Escreva um programa que leia um número inteiro positivo n e em seguida imprima n linhas do chamado Triangulo de Floyd: */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int n = tec.nextInt();
        int contador = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(contador + " ");
                contador++;
            }
            System.out.println("");
        }
        tec.close();
    }
}

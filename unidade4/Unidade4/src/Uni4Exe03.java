import java.util.Scanner;

public class Uni4Exe03 {
    /*Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int valor1 = tec.nextInt();
        int valor2 = tec.nextInt();
        tec.close();
        if (valor1 > valor2) {
            System.out.println("O valor 1 é maior que o valor 2");
        } else {
            System.out.println("O valor 2 é maior que o valor 1");
        }
    }
}

import java.util.Scanner;

public class Uni4Exe02 {
    /*Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int valor = tec.nextInt();
        tec.close();
        valor = valor % 2;
        if (valor == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é ímpar");
        }
    }
}

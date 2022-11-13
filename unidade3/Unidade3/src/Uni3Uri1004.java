import java.util.Scanner;

public class Uni3Uri1004 {
    /*Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. 
    A seguir mostre a variável PROD com mensagem correspondente.   */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int valor1 = tec.nextInt();
        int valor2 = tec.nextInt();
        tec.close();
        int prod = valor1 * valor2;
        System.out.println("PROD = " + prod);
    }
}

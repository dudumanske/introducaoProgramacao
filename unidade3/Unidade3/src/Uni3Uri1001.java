import java.util.Scanner;

public class Uni3Uri1001 {
    /*Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X. 
    Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo especificado e não esqueça 
    de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error". */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        int A = teclado.nextInt();
        int B = teclado.nextInt(); 
        teclado.close();
        int X = A + B;
        System.out.println("X = " + X);
    }
}

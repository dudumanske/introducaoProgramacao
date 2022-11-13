import java.util.Scanner;

public class Uni5Exe05 {
    /*Descreva um algoritmo que escreva os n primeiros termos da seguinte sequência de números:
    O valor n deve ser lido e deve ser maior do que 2. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int termo = 8, termoAnterior = 8;
        int n = tec.nextInt();
        if (n > 2){
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    System.out.println(termo);
                } else if (i % 2 == 0) {
                    System.out.println(termoAnterior);
                }

                if (i % 2 == 0) {
                    termoAnterior = termo;
                    termo = termo * 2; 
                } else if (i % 2 != 0) {
                    termoAnterior += 2;
                }
            }
        }
        tec.close();
    }
}

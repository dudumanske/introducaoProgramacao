import java.util.Scanner;

public class Uni3Uri1007 {
    /*Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a 
    fórmula: DIFERENCA = (A * B - C * D). */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int A = tec.nextInt();
        int B = tec.nextInt();
        int C = tec.nextInt();
        int D = tec.nextInt();
        tec.close();
        int diferenca = A * B - C * D;
        System.out.println("DIFERENCA = " + diferenca);
    }
}

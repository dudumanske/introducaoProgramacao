import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1005 {
    /*Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno, 
    sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, 
    sempre com uma casa decimal. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");
        double A = tec.nextDouble();
        double B = tec.nextDouble();
        tec.close();
        double media = ((A * 0.35) + (B * 0.75)) / 1.1;
        System.out.println("MEDIA = " + df.format(media));
    }
}

import java.util.Scanner;

public class Uni5Exe07 {
    /*Descreva um algoritmo que leia um número inteiro n e, dados n números reais informe o maior e o menor número. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe quantos números você digitará: ");
        int qtdNumero = tec.nextInt();
        double numMaior = 0.0, numMenor = 100000;
        for (int i = 1; i <= qtdNumero; i++) {
            double numero = tec.nextDouble();
            if (numero > numMaior) {
                numMaior = numero;
            } else if (numero < numMenor) {
                numMenor = numero;
            }
        }
        tec.close();
        System.out.println("O maior número foi: " + numMaior + " e o menor número foi " + numMenor);
    }
}

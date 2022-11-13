import java.util.Scanner;

public class Uni5Exe08 {
    /*
     * Descreva um algoritmo que leia um número inteiro n e, dados n números
     * inteiros, descreva um algoritmo que:
     * 
     * escreva o menor valor negativo;
     * escreva a média dos números positivos.*/
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int n = tec.nextInt();
        double mediaPositivo = 0;
        int menorNegativo = -1, contador = 0;
        for (int i = 1; i <= n; i++) {
            int numero = tec.nextInt();
            if (numero > 0) {
                contador++;
                mediaPositivo = mediaPositivo + numero;
            } else if (numero < 0) {
                if (numero < menorNegativo) {
                    menorNegativo = numero;
                }
            }
        }
        mediaPositivo = mediaPositivo / contador;
        tec.close();
        System.out.println("Menor valor negativo foi " + menorNegativo + " e a média dos números positivos foi " + mediaPositivo);
    }
}

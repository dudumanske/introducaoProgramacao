import java.util.Scanner;

public class Uni5Exe31 {
    /*Dado um número inteiro positivo, determine a sua decomposição em fatores primos. A saída do programa deve ser semelhante ao exemplo 
    abaixo: */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o número:");
        int numero = tec.nextInt();
        int decomposicao = 0;
        while (numero != 1) {
            System.out.print("Número: " + numero);
            if (numero % 2 == 0) {
                numero = numero / 2;
                decomposicao = 2;
            } else if (numero % 3 == 0) {
                numero = numero / 3;
                decomposicao = 3;
            } else if (numero % 5 == 0) {
                numero = numero / 5;
                decomposicao = 5;
            } else if (numero % 7 == 0) {
                numero = numero / 7;
                decomposicao = 7;
            } else if (numero % 11 == 0){
                numero = numero / 11;
                decomposicao = 11;
            } 
            System.out.println(" Decomposição: " + decomposicao);   
        }
        tec.close();
        System.out.println("Número: " + numero);
    }
}

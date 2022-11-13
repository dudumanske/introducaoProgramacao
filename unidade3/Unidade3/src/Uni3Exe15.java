import java.util.Scanner;

public class Uni3Exe15 {
    /*Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma:

    X centena(s)  Y dezena(s) K unidade(s)  
    Exemplo, se for submetido o número 384, o programa deverá exibir:

    3 centena(s)  8 dezena(s) 4 unidade(s)   */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);               

        System.out.println("Informe o número inteiro(até 3 dígitos): ");
        int numero = teclado.nextInt();
        teclado.close();

        int centena = numero / 100;
        int dezena = (numero - (centena * 100)) / 10;
        int unidade = numero - (centena * 100) - (dezena * 10);

        System.out.println(centena + " centena(s) " + dezena + " dezena(s) " + unidade + " unidade(s)");
    }
}

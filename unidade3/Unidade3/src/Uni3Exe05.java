import java.util.Scanner;

public class Uni3Exe05 {
    /*Uma granja possui um controle automatizado de cada frango da sua produção. No pé direito do frango há 
    um anel com um chip de identificação; no pé esquerdo são dois anéis para indicar o tipo de alimento que 
    ele deve consumir. Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, faça um 
    programa para calcular o gasto total da granja para marcar todos os seus frangos. */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de frangos na granja: ");
        int quantidadeFrango = teclado.nextInt();
        teclado.close();

        double gastoTotal = ((2 * 3.5) + 4) * quantidadeFrango;

        System.out.println("O gasto total na granja será de R$ " + gastoTotal);
    }
}

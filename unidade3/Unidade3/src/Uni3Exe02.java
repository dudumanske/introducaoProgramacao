import java.util.Scanner;

public class Uni3Exe02 {
    /*Uma loja de calçados está concedendo 12% de desconto nos produtos. Escreva um programa para calcular e 
    exibir o valor de desconto a ser dado num par de sapatos e quanto deve custar o produto com o desconto. 
    O preço do par de sapatos deve ser informado pelo usuário. Como resultado, o programa deverá exibir as 
    seguintes mensagens:

    O valor do desconto é de R$ xxx
    O preço do par de sapatos com desconto é R$ xxx */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double desconto = 0.12;

        System.out.println("Informe o preço do par de sapatos: ");
        double valorSapatos = teclado.nextDouble();
        teclado.close();

        double valorSapatosDesc = valorSapatos * desconto;
        double valorDesconto = valorSapatos - valorSapatosDesc;

        System.out.println("O valor do desconto é de R$ " + valorSapatosDesc);
        System.out.println("O preço do par de sapatos com desconto é R$ " + valorDesconto);
    }
}

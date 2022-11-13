import java.util.Scanner;

public class Uni3Exe03 {
    /*Um motorista deseja abastecer seu tanque de combustível. Escreva um programa para ler o preço do litro 
    da gasolina e o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque. */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o preço do litro da gasolina: ");
        double gasolinaPreco = teclado.nextDouble();
        System.out.println("Informe a quantidade de litros usada no abastecimento: ");
        double gasolinaQuantidade = teclado.nextDouble();

        teclado.close();

        double gasolinaPagamento = gasolinaPreco * gasolinaQuantidade;

        System.out.println("O valor do pagamento deve ser de R$ " + gasolinaPagamento);
    }
}

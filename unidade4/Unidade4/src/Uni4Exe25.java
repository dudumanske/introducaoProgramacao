import java.util.Scanner;

public class Uni4Exe25 {
    /*
     * Faça um algoritmo que escreva o menu abaixo, leia uma opção do usuário e
     * execute a operação correspondente. O algoritmo deve exibir uma mensagem
     * de erro se a opção for inválida. O menu tem as seguintes opções:
     * Escolha uma opção:
     * 1 - Soma de dois números.
     * 2 - Diferença entre dois números.
     * 3 - Produto entre dois números.
     * 4 - Divisão entre dois números (o denominador não pode ser zero).
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Escolha uma opção:\n1 - Soma de dois números.\n2 - Diferença entre dois números.\n3 - Produto entre dois números.\n4 - Divisão entre dois números (o denominador não pode ser zero).");
        int opcao = tec.nextInt();
        System.out.println("Informe os 2 números:");
        double valor1 = tec.nextDouble();
        double valor2 = tec.nextDouble();
        tec.close();
        double resultado = 0;
        switch (opcao) {
            case 1:
                resultado = valor1 + valor2;
                break;
            case 2:
                resultado = valor1 - valor2;
                break;
            case 3:
                resultado = valor1 * valor2;
                break;
            case 4:
                resultado = valor1 / valor2;
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        System.out.println("Resultado: " + resultado);
    }
}

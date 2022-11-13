import java.util.Scanner;

public class Uni4Exe26 {
    /*
     * Dado um caractere indicando uma opção, escreva um algoritmo para:
     * 
     * se opção = ‘T’: calcular a área de um triângulo de base b e altura h
     * se opção = ‘Q’: calcular a área de um quadrado de lado l
     * se opção = ‘R’: calcular a área de um retângulo de base b e altura h
     * se opção = ‘C’: calcular a área de um círculo de raio r
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("T: calcular a área de um triângulo de base b e altura h");
        System.out.println("Q: calcular a área de um quadrado de lado l");
        System.out.println("R: calcular a área de um retângulo de base b e altura h");
        System.out.println("C: calcular a área de um círculo de raio r");
        System.out.println("Digite a opção:");
        char opcao = tec.next().charAt(0);
        opcao = Character.toUpperCase(opcao);
        switch (opcao) {
            case 'T':
                System.out.println("Informe a base e a altura do triãngulo: ");
                double baseT = tec.nextDouble();
                double alturaT = tec.nextDouble();
                System.out.println("Área do triãngulo: " + baseT * alturaT / 2);
                break;
            case 'Q':
                System.out.println("Informe o lado do quadrado: ");
                double lado = tec.nextDouble();
                System.out.println("Área do quadrado: " + Math.pow(lado, 2));
                break;
            case 'R':
                System.out.println("Informe a base e a altura do retângulo: ");
                double baseR = tec.nextDouble();
                double alturaR = tec.nextDouble();
                System.out.println("Área do retângulo: " + baseR * alturaR);
                break;
            case 'C':
                System.out.println("Informe o raio do círculo: ");
                double raio = tec.nextDouble();
                System.out.println("Área do círculo: " + Math.PI * Math.pow(raio, 2));
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        tec.close();
    }
}

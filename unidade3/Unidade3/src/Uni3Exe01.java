import java.util.Scanner;

public class Uni3Exe01{
    /*Uma imobiliária vende apenas terrenos retangulares. Faça um programa para ler as dimensões de um terreno
    e depois exibir a área do terreno. */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o comprimento do terreno: ");
        Double comprimento = teclado.nextDouble();
        System.out.println("Digite a largura do terreno: ");
        Double largura = teclado.nextDouble();
        teclado.close();
        Double area = comprimento * largura;
        
        System.out.println("A área do terreno é: " + area);
    }
}
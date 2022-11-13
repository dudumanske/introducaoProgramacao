import java.util.Scanner;

public class Uni3Exe13 {
    /*Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Faça um programa para ler o comprimento e altura de uma 
    parede (em metros), e depois escrever o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos. */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o comprimento da parede(em metros): ");
        double comprimento = teclado.nextDouble();
        System.out.println("Informe a altura da parede(em metros): ");
        double altura = teclado.nextDouble();
        teclado.close();

        double areaParede = comprimento * altura;
        double valorGasto = (areaParede * 9) * 12.5;

        System.out.println("O valor a ser pago pela compra do azulejos é de R$ " + valorGasto);
    }
}

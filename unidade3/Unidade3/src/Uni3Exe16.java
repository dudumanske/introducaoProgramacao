import java.util.Scanner;

public class Uni3Exe16 {
    /*Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais. Considerando que alguém está 
    pagando uma compra, faça um programa que determine e escreva o número mínimo de notas que o caixa 
    deve fornecer como troco. Escreva também o número de cada tipo de nota a ser fornecido como troco. 
    Suponha que o sistema monetário não utilize centavos.*/
    public static void main(String[] args) {
        Scanner  teclado = new Scanner(System.in);

        System.out.println("Valor da compra: ");
        int valorCompra = teclado.nextInt();
        System.out.println("Dinheiro dado pelo comprador: ");
        int dinheiroComprador = teclado.nextInt();
        teclado.close();

        int troco = dinheiroComprador - valorCompra;

        int centena = troco / 100;
        int dezena = (troco - (centena * 100)) / 10;
        int unidade = troco - (centena * 100) - (dezena * 10);

        System.out.println("Troco a receber: \nNota de 100: " + centena + " nota(s)\n" + 
        "Nota de 10: " + dezena + " nota(s)\n" + 
        "Nota de 1: " + unidade + " nota(s)");
    }
}

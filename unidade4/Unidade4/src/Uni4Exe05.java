import java.util.Scanner;

public class Uni4Exe05 {
    /*Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável lógica com a resposta e responda “Sim”, caso a resposta 
    seja true, ou “Não”, caso seja false. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("A cor é azul ?");
        boolean resposta = tec.hasNext();
        tec.close();
        if (resposta == true) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}

import java.util.Scanner;

public class Uni5Exe24 {
    /*Os regulamentos de uma competição de pesca impõem um limite no peso total de pesca de um dia. Descreva um algoritmo que leia o limite 
    diário (em quilogramas) e então leia o peso (em gramas) de cada peixe e escreva o peso total da pesca obtido até aquele ponto. Quando o 
    limite diário for excedido escreva uma mensagem e encerre a execução do algoritmo. Para prosseguir com a entrada de dados de pesos de 
    cada peixe o algoritmo deve apresentar a seguinte mensagem: “deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?”. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o limite diário em Kg:");
        double limite = tec.nextDouble();
        limite = limite * 1000;
        double peixe = 0, totalPesca = 0;
        char opcao = 'd';
        while (totalPesca < limite) {
            System.out.println("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
            opcao = tec.next().charAt(0);
            opcao = Character.toUpperCase(opcao);
            if (opcao != 'N') {
                System.out.println("Informe o peso do peixe em gramas:");
                peixe = tec.nextDouble();
                totalPesca += peixe;
                System.out.println("Peso total da pesca em gramas: " + totalPesca);
            }          
        }
        if (limite < totalPesca) {
            System.out.println("Limite diário foi excedido");
        }
        tec.close();
    }
}

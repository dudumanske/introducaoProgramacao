import java.util.Scanner;

public class Uni6Exe02 {
    /*Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. Imprima quais valores desses informados 
    são maiores que a média dos valores. Faça um método para ler os valores, outro para calcular a média e outro para informar os valores maiores que 
    a média. */

    private Uni6Exe02(){
        Scanner tec = new Scanner(System.in);
        double vetor[] = new double[12];
        double media = 0;
        lerValores(tec, vetor);
        media = calcularMedia(vetor);
        escreverValores(vetor, media);
        tec.close();
    }

    private void escreverValores(double vetor[], double media){
        System.out.println("Média dos valores: " + media);
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.println("Valor: " + vetor[i] + " posição vetor[" + i + "]");
            }
        }
    }

    private double calcularMedia(double vetor[]){
        double media = 0;
        for (int i = 0; i < vetor.length; i++) {
            media += vetor[i];
        }
        media = media / 12;
        return media;
    }

    private void lerValores(Scanner tec, double vetor[]){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o elemento " + (i + 1) + " posicao vetor[" + i + "]");
            vetor[i] = tec.nextDouble();
        }
    }

    public static void main(String[] args) {
        new Uni6Exe02();
    }
}

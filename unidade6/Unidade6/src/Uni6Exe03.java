import java.util.Scanner;

public class Uni6Exe03 {
    /*Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. Em seguida, modifique o vetor de modo 
    que os valores das posições ímpares sejam aumentados em 5% e os das posições pares sejam aumentados em 2%. Imprima o vetor resultante. Faça 
    um método para ler os valores, outro para ajustar os valores dentro do vetor e outro para escrever os valores atualizados do vetor. */

    private Uni6Exe03(){
        Scanner tec = new Scanner(System.in);
        double vetor[] = new double[12];
        lerValores(tec, vetor);
        modificarValor(vetor);
        escreverValores(vetor);

        tec.close();
    } 

    private void escreverValores(double vetor[]){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Valor: " + vetor[i] + " posição vetor[" + i + "]");   
        }
    }

    private void modificarValor(double vetor[]){
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 != 0) {
                vetor[i] *= 1.05;
            } else {
                vetor[i] *= 1.02; 
            }
        }
    }

    private void lerValores(Scanner tec, double vetor[]){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o elemento " + (i + 1) + " posição vetor[" + i + "]");
            vetor[i] = tec.nextDouble();
        }
    }

    public static void main(String[] args) {
        new Uni6Exe03();
    }
}

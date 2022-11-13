import java.util.Scanner;

public class Uni6Exe04 {
    /*Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. Crie um terceiro vetor em que cada 
    elemento é a soma dos valores contidos nas posições respectivas dos vetores originais. Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] 
    vetor3 = [2,7,9]. Exiba, ao final, os três vetores na tela. Faça três métodos: um método para ler valores dos vetores, outro para somar 
    e outro para escrever os vetores. */
    private Uni6Exe04(){
        Scanner tec = new Scanner(System.in);
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetorSoma[] = new int[10];
        lerValores(tec, vetor1, vetor2);
        somarVetor(vetor1, vetor2, vetorSoma);
        escreverVetores(vetor1, vetor2, vetorSoma);
        tec.close();
    }

    private void lerValores(Scanner tec, int vetor1[], int vetor2[]){
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Informe o elemento " + (i + 1) + " posição vetor[" + i + "]");
            vetor1[i] = tec.nextInt();
        }
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Informe o elemento " + (i + 1) + " posição vetor[" + i + "]");
            vetor2[i] = tec.nextInt();
        }
    }

    private void somarVetor(int vetor1[], int vetor2[], int vetorSoma[]){
        for (int i = 0; i < 10; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }
    }

    private void escreverVetores(int vetor1[], int vetor2[], int vetorSoma[]){
        System.out.print("Vetor 1 = [");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] + ",");
        }
        System.out.println("]");
        System.out.print("Vetor 2 = [");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + ",");
        }
        System.out.println("]");
        System.out.print("Vetor soma = [");
        for (int i = 0; i < vetorSoma.length; i++) {
            System.out.print(vetorSoma[i] + ",");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        new Uni6Exe04();
    }
}

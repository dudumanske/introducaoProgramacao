import java.util.Scanner;

public class Uni6Exe01 {
    /*Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor de 10 posições do tipo inteiro. Escreva na ordem inversa em que 
    foram lidos. Faça um método para ler e outro para escrever. */
   
    //Construtor
    private Uni6Exe01(){
        Scanner teclado = new Scanner(System.in);
        int vetor[] = new int[10];

        lerValores(teclado, vetor);
        escreverInverso(vetor);

        teclado.close();
    } 
    //método ler valores
    private void lerValores(Scanner tec, int vet[]){
        //vet.length - indica o tamanho do vetor
        for (int i = 0; i < vet.length; i++){
            System.out.println("Informe o elemento " + (i + 1) + " posicao vetor[" + i + "]");
            vet[i] = tec.nextInt();
        }
    }  

    private void escreverInverso(int vet[]){
        // inicia da posição 9 do vetor 
        for(int i = vet.length -1; i >= 0; i--){
            System.out.println("Elemento da posicao[" + i + "]:" + vet[i]);
        }
    }

    public static void main(String[] args) {
        //instância do construtor
        new  Uni6Exe01();
   } 
}
import java.util.Scanner;

public class Uni6Exe07 {
    /*Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, crie um vetor do tipo inteiro. Em seguida, 
    solicite ao usuário para digitar um número inteiro várias vezes, até preencher o vetor. Esse número deverá ser armazenado no vetor caso 
    ainda não exista, e se o valor já existir deve ser pedido um novo valor. Isto é, se o usuário informar o número 2 e já existir o número 2 
    em alguma posição do vetor, o número não deve ser adicionado. Após ter adicionado todos os números dentro do vetor, o mesmo deve ser 
    ordenado. */

    private Uni6Exe07(){
        Scanner tec = new Scanner(System.in);
        int N = 100;
        do {
            System.out.println("Informe o valor N:");
            N = tec.nextInt();
        } while (N > 20);
        int vetor[] = new int[N];
        lerValores(tec, vetor);
        ordenarValores(vetor);
        imprimirValores(vetor);
        tec.close();
    }

    private void ordenarValores(int vetor[]){
        for (int i = 0; i < vetor.length - 1;) {
            if (vetor[i] > vetor[i + 1]) {
                int bolha = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = bolha;
                i = 0;
            } else {
                i++;
            }
        }
    }

    private void lerValores(Scanner tec, int vetor[]){
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o elemento " + (i + 1) + " posição vetor[" + i + "]");
            vetor[i] = tec.nextInt();
            for (int j = 0; j < i; j++) {
                if (vetor[i] == vetor[j]) {
                    System.out.println("Elemento ja existe, informe outro:");
                    vetor[i] = tec.nextInt();
                }
            }
        }
    }

    private void imprimirValores(int vetor[]){
        System.out.print("Vetor ordenado:");
        for (int i = 0; i < vetor.length; i++) {            
            System.out.print("[" + vetor[i] + "]");
        }
    }
    
    public static void main(String[] args) {
        new Uni6Exe07();
    }
}

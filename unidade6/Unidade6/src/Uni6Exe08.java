import java.util.Scanner;

public class Uni6Exe08 {
    /*Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, crie um vetor do tipo real. Faça o usuário 
    informar valores para as posições deste vetor e coloque-as nas posições na sequência informada pelo usuário. Imprima uma tabela contendo 
    cada valor diferente e o número de vezes que o valor aparece no vetor */

    private Uni6Exe08(){
        Scanner tec = new Scanner(System.in);
        int N;
        do {
            System.out.println("Informe o valor N:");
            N = tec.nextInt();
        } while (N > 20);
        double vetor[] = new double[N];
        int contador[] = new int[N];
        lerValores(tec, vetor, contador);
        imprimirValores(vetor, contador);
        tec.close();
    }

    private void lerValores(Scanner tec, double vetor[], int cont[]){
        for (int i = 0; i < vetor.length; i++) {
            cont[i] = 1;
            System.out.println("Informe o elemento " + (i + 1) + " posição vetor[" + i + "]");
            vetor[i] = tec.nextDouble();
            for (int j = 0; j < i; j++) {
                if (vetor[i] == vetor[j]) {
                    cont[j]++; 
                    cont[i]--;            
                }
            }
        }
    }

    private void imprimirValores(double vetor[], int cont[]){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " | ");
        }
        System.out.println();
        System.out.println("Valor           Frequência");
        for (int i = 0; i < vetor.length; i++) {
            if (cont[i] > 0) {
                System.out.println(vetor[i] + "               " + cont[i]);
            }
        }
    }

    public static void main(String[] args) {
        new Uni6Exe08();
    }
}

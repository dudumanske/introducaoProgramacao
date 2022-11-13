import java.util.Scanner;

public class Uni6Exe06 {
    /*Faça um programa que leia um valor N inteiro. Com base neste valor, crie um vetor do tipo real. Em seguida, solicite ao usuário 
    informar essa quantidade N de valores reais para popular o vetor. Após ter preenchido o vetor, solicite que o usuário informe um 
    outro valor real. Informe para o usuário se este valor informado se encontra cadastrado no vetor. Faça um método para ler o vetor 
    e outro, que retorne verdadeiro ou falso, para encontrar o valor. */

    private Uni6Exe06(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o valor N:");
        int N = tec.nextInt();
        double vetor[] = new double[N];
        lerValores(tec, N, vetor);
        System.out.println("Informe um valor de tipo real: ");
        double valorReal = tec.nextDouble();
        boolean cadastrado = false;
        encontrarValor(vetor, N, valorReal, cadastrado);
        tec.close();
    }

    private void encontrarValor(double vetor[], int N, double valorReal, boolean cadastrado){
        for (int i = 0; i < N; i++) {
            if (vetor[i] == valorReal) {
                cadastrado = true;
            } else {
                cadastrado = false;
            }
        }
        System.out.println(cadastrado);
    }

    private void lerValores(Scanner tec, int N, double vetor[]){
        for (int i = 0; i < N; i++) {
            System.out.println("Informe o elemento " + (i + 1) + " posição vetor[" + i + "]");
            vetor[i] = tec.nextDouble();
        }
    }

    public static void main(String[] args) {
        new Uni6Exe06();
    }
}

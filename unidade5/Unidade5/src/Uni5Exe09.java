import java.util.Scanner;

public class Uni5Exe09 {
    /*Uma turma tem n alunos. Dado n, o nome e idade de cada aluno descreva um
    algoritmo que:
    escreva os nomes dos alunos que tem 18 anos;
    escreva a quantidade de alunos que tem idade acima de 20 anos.*/
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int n = tec.nextInt();
        int contador = 0;
        for (int i = 1; i <= n; i++) {
            String nome = tec.next();
            int idade = tec.nextInt();
            if (idade > 20) {
                contador++;
            } else if (idade == 18) {
                System.out.println(nome);
            }
        }
        System.out.println("A quantidade de alunos com idade acima de 20 anos é de: " + contador);
        tec.close();
    }
}

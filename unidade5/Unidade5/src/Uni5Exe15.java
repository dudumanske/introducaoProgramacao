import java.util.Scanner;

public class Uni5Exe15 {
    /*Dada uma turma de alunos, contendo seu nome e nota de duas provas descreva um algoritmo para informar a média de cada aluno. 
    Considere que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String nome = "";
        while (!nome.equals("fim")) {
            System.out.println("Informe o nome do aluno:");
            nome = tec.next();
            if (!nome.equals("fim")) {
                System.out.println("Informe a nota 1 do aluno:");
                Double nota1 = tec.nextDouble();
                System.out.println("Informe a nota 2 do aluno:");
                Double nota2 = tec.nextDouble();
                double media = (nota1 + nota2) / 2;
                System.out.println("Aluno: " + nome + " Média: " + media);
            }
        }
        tec.close();
    }
}

import java.util.Scanner;
/*Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, descreva um algoritmo que calcule 
a média de aproveitamento e o conceito do aluno, usando a fórmula: 
O algoritmo deve escrever a média de aproveitamento, o conceito correspondente e a mensagem "aprovado" caso o 
conceito seja A, B ou C, e "reprovado" caso o conceito seja D ou E.*/

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe as 3 notas do aluno e a média dos exercícios: ");
        double nota1 = tec.nextDouble();
        double nota2 = tec.nextDouble();
        double nota3 = tec.nextDouble();
        double exercicio = tec.nextDouble();
        tec.close();
        double media = (nota1 + nota2 * 2 + nota3 * 3 + exercicio) / 7;
        if (media >= 9.0) {
            System.out.println("Média: " + media + "\nConceito: A\nSituação: aprovado" );
        } else if(media >= 7.5 && media < 9.0) {
            System.out.println("Média: " + media + "\nConceito: B\nSituação: aprovado" );
        } else if(media >= 6.0 && media < 7.5) {
            System.out.println("Média: " + media + "\nConceito: C\nSituação: aprovado" );
        } else if(media >= 4.0 && media < 6.0) {
            System.out.println("Média: " + media + "\nConceito: D\nSituação: reprovado" );
        } else {
            System.out.println("Média: " + media + "\nConceito: E\nSituação: reprovado" );
        }   
    }
}

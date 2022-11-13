public class Uni3Exe04 {
    /*Faça um programa para ler três notas de um aluno em uma disciplina e imprimira sua média ponderada 
    (as notas tem pesos respectivos de 5, 3 e 2). */
    public static void main(String[] args) {
        double nota1 = 5.0;
        double nota2 = 3.0;
        double nota3 = 2.0;

        double mediaAluno = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média ponderada do aluno é " + mediaAluno);
    }
}

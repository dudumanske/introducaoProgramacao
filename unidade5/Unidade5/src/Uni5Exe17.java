import java.util.Scanner;

public class Uni5Exe17 {
    /*Descreva um algoritmo que leia o número de inscrição e a altura de um atleta em uma competição e informe:

o número de inscrição e a altura do atleta mais alto;
o número de inscrição e a altura do atleta mais baixo;
a altura média do grupo de atletas.
A leitura deve ser finalizada ao digitar 0 para o número de inscrição. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int inscricao = 1, inscricaoAlto = 0, inscricaoBaixo = 0, contador = 0;
        double alturaMaior = 0, alturaMenor = 0, alturaMedia = 0;
        while (inscricao != 0) {
            System.out.println("Informe o número de inscrição do atleta: ");
            inscricao = tec.nextInt();
            if (inscricao != 0) {
                System.out.println("Informe a altura do atleta:");
                double altura = tec.nextDouble();
                contador++;
                alturaMedia += altura;
                if (altura > alturaMaior) {
                    alturaMaior = altura;
                    inscricaoAlto = inscricao;
                } else if (altura < alturaMenor){
                    alturaMenor = altura;
                    inscricaoBaixo = inscricao;
                } else if (alturaMenor == 0) {
                    alturaMenor = altura;
                    inscricaoBaixo = inscricao;
                }
            }
        }
        tec.close();
        alturaMedia = alturaMedia / contador;
        System.out.println("Atleta mais alto\nNúmero de inscrição: " + inscricaoAlto + " Altura: " + alturaMaior);
        System.out.println("Atleta mais baixo\nNúmero de inscrição: " + inscricaoBaixo + " Altura: " + alturaMenor);
        System.out.println("A altura média do grupo: " + alturaMedia);
    }
}

import java.util.Scanner;

public class Uni5Exe16 {
    /*Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da altura e do sexo (sexo = 'M' ou sexo = 'm' para masculino 
    e sexo = 'F' e sexo = 'f' para feminino) de cada pessoa informe a média da altura das mulheres e a média de altura do grupo. A leitura 
    deve ser finalizada ao digitar 0 para a altura. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double altura = 1, alturaM = 0, alturaF = 0;
        int contadorM = 0, contadorF = 0;
        while (altura != 0) {
            System.out.println("Altura:");
            altura = tec.nextDouble();
            if (altura != 0) {
                System.out.println("Sexo: ");
                char sexo = tec.next().charAt(0);
                if (sexo == 'M' || sexo == 'm') {
                    contadorM++;
                    alturaM += altura;
                } else if (sexo == 'F' || sexo == 'f') {
                    contadorF++;
                    alturaF += altura;
                }
            }
        }
        tec.close();
        double mediaF = alturaF / contadorF;
        double mediaGrupo = (alturaF + alturaM) / (contadorF + contadorM);
        System.out.println("A média da altura das mulheres foi de " + mediaF + " e a média da altura do grupo foi de " + mediaGrupo);
    }
}

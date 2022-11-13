import java.util.Scanner;

public class Uni5Exe25 {
    /*
     * Em uma disputa de pingue-pongue os pontos são anotados como D, ponto para o
     * jogador do lado direito, e E, ponto para o jogador do lado esquerdo da mesa.
     * Descreva um algoritmo que leia o código do ponto de cada jogada e determine o
     * vencedor. A partida encerra quando:
     * 
     * um dos jogadores chegar a 21 pontos e a diferença de pontos entre os
     * jogadores for maior ou igual a dois;
     * o jogador com mais de 21 pontos conseguir uma diferença de dois pontos sobre
     * o adversário, caso a primeira condição não seja atendida.
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        char ponto = 'o';
        int contador = 1, pontoD = 0, pontoE = 0, vencedor = 0;
        while (vencedor == 0) {
            System.out.println("Quem marcou o " + contador + "o ponto ?");
            ponto = tec.next().charAt(0);
            ponto = Character.toUpperCase(ponto);
            contador++;
            if (ponto == 'D') {
                pontoD++;
            } else if (ponto == 'E') {
                pontoE++;
            }
            if (pontoD >= 21 && (pontoD - pontoE) >= 2) {
                vencedor = 1;
                System.out.println("O vencedor foi o lado direito");
            } else if (pontoE >= 21 && (pontoE - pontoD) >= 2) {
                vencedor = 1;
                System.out.println("O vencedor foi o lado esquerdo");
            }
        }
        tec.close();
    }
}

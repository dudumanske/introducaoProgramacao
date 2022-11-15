import java.util.Scanner;

public class JogoDaVelha {
    private JogoDaVelha(){
        Scanner tec = new Scanner(System.in);
        char mapa[][] = new char[3][3];
        char opcao = ' ';
        do {
            jogarPartida(tec, mapa);
            System.out.println("Deseja jogar novamente (s/n)?");
            opcao = tec.next().charAt(0);
            opcao = Character.toLowerCase(opcao);
        } while (opcao != 'n');
        tec.close();
    }

    private void desenha(int jogada, char mapa[][]){
        System.out.println("------------- .. jogada: " + jogada);
        System.out.println("| " + mapa[0][0] + " | " + mapa[0][1] + " | " + mapa[0][2] + " |");
        System.out.println("-------------");
        System.out.println("| " + mapa[1][0] + " | " + mapa[1][1] + " | " + mapa[1][2] + " |"); 
        System.out.println("-------------");
        System.out.println("| " + mapa[2][0] + " | " + mapa[2][1] + " | " + mapa[2][2] + " |");
        System.out.println("----------------------------");
    }

    private void limpaMapa(char mapa[][]){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mapa[i][j] = ' ';
            }
        }
    }

    private int sortear(int inicio, int fim){
        return (int) ((Math.random() * (fim - inicio + 1)) + inicio);
    }

    private void jogarPartida(Scanner tec, char mapa[][]){
        limpaMapa(mapa);
        int jogada = 0, l, c;
        desenha(0, mapa);
        int sorte = sortear(1, 2);
        boolean lugar, ganhador;
        do {
            if (sorte == 1) {          
                do {
                    System.out.println("Jogador ..");
                    System.out.println("  linha:");
                    l = tec.nextInt();
                    System.out.println("  coluna:");
                    c = tec.nextInt();
                    lugar = jogar(l, c, 'X', mapa);
                } while (lugar != true);
                jogada++;
                desenha(jogada, mapa);
                ganhador = ganhou('X', mapa);
                if (ganhador == false && jogada != 9) {
                    do {
                        l = sortear(0, 2);
                        c = sortear(0, 2);
                        lugar = jogar(l, c, 'O', mapa);
                    } while (lugar != true);
                    System.out.println("PC[" + l + "," + c + "]");
                    jogada++;
                    desenha(jogada, mapa);
                    ganhador = ganhou('O', mapa);
                } else {
                    ganhador = true;
                    jogada++;
                }            
            } else {
                do {
                    l = sortear(0, 2);
                    c = sortear(0, 2);
                    lugar = jogar(l, c, 'O', mapa);
                } while (lugar != true);
                System.out.println("PC[" + l + "," + c + "]");
                jogada++;
                desenha(jogada, mapa);
                ganhador = ganhou('O', mapa);
                if (ganhador == false && jogada != 9) {
                    do {
                        System.out.println("Jogador ..");
                        System.out.println("  linha:");
                        l = tec.nextInt();
                        System.out.println("  coluna:");
                        c = tec.nextInt();
                        lugar = jogar(l, c, 'X', mapa);
                    } while (lugar != true);
                    jogada++;
                    desenha(jogada, mapa);
                    ganhador = ganhou('X', mapa);
                } else {
                    ganhador = true;
                    jogada++;
                }         
            }    
        } while (ganhador != true);
        if (jogada == 10 && ganhador == true) {
            System.out.println("... EMPATOU!");
        }
    }

    private boolean jogar(int l, int c, char jogador, char mapa[][]){
        if (mapa[l][c] == ' ') {
            mapa[l][c] = jogador;
            return true;
        } else if (jogador == 'X' && mapa[l][c] != ' '){
            System.out.println("Lugar ocupado");
        }
        return false;
    }

    private boolean ganhou(char jogador, char mapa[][]){
        if ((mapa[0][0] == jogador && mapa[0][1] == jogador && mapa[0][2] == jogador) || (mapa[1][0] == jogador && mapa[1][1] == jogador && mapa[1][2] == jogador) || (mapa[2][0] == jogador && mapa[2][1] == jogador && mapa[2][2] == jogador) || (mapa[0][0] == jogador && mapa[1][0] == jogador && mapa[2][0] == jogador) || (mapa[0][1] == jogador && mapa[1][1] == jogador && mapa[2][1] == jogador) || (mapa[0][2] == jogador && mapa[1][2] == jogador && mapa[2][2] == jogador) || (mapa[0][0] == jogador && mapa[1][1] == jogador && mapa[2][2] == jogador) || (mapa[2][2] == jogador && mapa[1][1] == jogador && mapa[0][0] == jogador)) {
            if (jogador == 'X') {
                System.out.println("... Jogador GANHOU!");
            } else {
                System.out.println("... PC GANHOU!");
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        new JogoDaVelha();
    }
}

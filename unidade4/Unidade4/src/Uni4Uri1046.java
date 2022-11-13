import java.util.Scanner;

public class Uni4Uri1046 {
    /*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em 
    outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int horaI = tec.nextInt();
        int horaF = tec.nextInt();
        tec.close();
        int duracao = 0;
        if (horaI > horaF) {
            duracao = (24 - horaI) + horaF;
        } else if (horaI < horaF) {
            duracao = horaF - horaI;
        } else if (horaF == horaI){
            duracao = 24;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");   
    }
}

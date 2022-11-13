import java.util.Scanner;

public class Uni3Uri1019 {
    /*Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato 
    horas:minutos:segundos. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int tempo = tec.nextInt();
        tec.close();
        int horas = tempo / 3600;
        int minutos = (tempo - horas * 3600) / 60;
        int segundos = tempo - (horas * 3600 + minutos * 60);
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}

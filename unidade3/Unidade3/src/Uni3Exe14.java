import java.util.Scanner;

public class Uni3Exe14 {
    /*Descreva um programa que a partir da distância percorrida e o do tempo gasto por um motorista durante uma viagem de final de semana, 
    calcule a velocidade média e a quantidade de combustível gasto na viagem, sabendo que o automóvel faz 12 km por litro. */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a distância percorrida(em Km): ");
        double distancia = teclado.nextDouble();
        System.out.println("Informe o tempo gasto durante a viagem(em minutos): ");
        double tempo = teclado.nextDouble();
        teclado.close();

        double velocMedia = distancia / (tempo / 60);
        double combGasto = distancia / 12;

        System.out.println("A velocidade média durante a viagem foi de " + velocMedia + "Km/h e a quantidade de combutível gasto foi de " + 
        combGasto + " litros");
    }
}

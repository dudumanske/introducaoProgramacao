import java.util.Scanner;

public class Uni5Exe20 {
    /*Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada a sua massa inicial em Kg, descreva um algoritmo 
    que determine o tempo necessário para que essa massa se torne menor que 0,5 gramas. Escreva a massa inicial, a massa final e o tempo. */
    public static void main(String[] args) {
        Scanner  tec = new Scanner(System.in);
        System.out.println("Informe a massa do material em Kg:");
        double massa = tec.nextDouble();
        massa *= 1000;
        double massaInicial = massa;
        int contador = 0;
        while (massa > 0.5) {
            massa = massa / 2;
            contador += 50;
        }
        tec.close();
        System.out.println("Massa inicial: " + massaInicial);
        System.out.println("Massa final: " + massa);
        System.out.println("Tempo: " + contador + " segundos");
    }
}

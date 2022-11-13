import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1002 {
    /*A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:

    - Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π. */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");
        double raio = teclado.nextDouble();
        teclado.close();
        double area = 3.14159 * (raio * raio);
        System.out.println("A=" + df.format(area));
    }
}

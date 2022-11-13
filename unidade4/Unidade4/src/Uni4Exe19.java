import java.util.Scanner;

public class Uni4Exe19 {
    /*
     * Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual
     * quadrante ele está localizado
     * 0, se os dois valores forem zero
     * 1, se os dois valores forem positivos
     * 2, se x for positivo e y, negativo
     * 3, se os dois valores forem negativos
     * 4, se x for negativo e y, positivo
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o x:"); 
        int x = tec.nextInt();
        System.out.println("Informe o y:"); 
        int y = tec.nextInt();
        tec.close();
        if (x == 0 && y == 0) {
            System.out.println("Quadrante 0");     
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrante 1");     
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante 2"); 
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3"); 
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante 4"); 
        }
    }
}

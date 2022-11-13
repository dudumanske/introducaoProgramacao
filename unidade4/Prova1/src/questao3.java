import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        char tipos = tec.next().charAt(0);
        tec.close();
        tipos = Character.toUpperCase(tipos);
        if (tipos == 'V') {
            System.out.println("Verde");
        } else if (tipos == 'A') {
            System.out.println("Azul");
        } else if (tipos == 'B') {
            System.out.println("Branca");
        } else {
            System.out.println("Tipo incorreto");
        }
    }
}

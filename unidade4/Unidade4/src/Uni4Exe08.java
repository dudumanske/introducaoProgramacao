import java.util.Scanner;

public class Uni4Exe08 {
    /*Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe a letra:");
        String letra = tec.nextLine();
        tec.close();
        if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u") {
            System.out.println("A letra é uma vogal");
        } else {
            System.out.println("A letra não é uma vogal");
        }
    }
}

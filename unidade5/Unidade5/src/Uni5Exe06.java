import java.util.Scanner;

public class Uni5Exe06 {
    /*Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.*/
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double altura = 0.0;
        double alturaMedia = 0.0;
        for (int i = 1; i <= 20; i++) {
            altura = tec.nextDouble();
            alturaMedia += altura;
        }
        tec.close();
        altura = alturaMedia / 20;
        System.out.println("A altura média das 20 pessoas é: " + altura);
    }
}

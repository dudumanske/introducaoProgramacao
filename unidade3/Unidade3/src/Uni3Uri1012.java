import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1012 {
    /*Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
    a) a área do triângulo retângulo que tem A por base e C por altura.
    b) a área do círculo de raio C. (pi = 3.14159)
    c) a área do trapézio que tem A e B por bases e C por altura.
    d) a área do quadrado que tem lado B.
    e) a área do retângulo que tem lados A e B. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        double A = tec.nextDouble();
        double B = tec.nextDouble();
        double C = tec.nextDouble();
        tec.close();
        double triangulo = (A * C) / 2;
        double circulo = 3.14159 * (C * C);
        double trapezio = ((A + B) * C) / 2;
        double quadrado = B * B;
        double retangulo = A * B;
        System.out.println("TRIANGULO = " + df.format(triangulo));       
        System.out.println("CIRCULO = " + df.format(circulo));       
        System.out.println("TRAPEZIO = " + df.format(trapezio));       
        System.out.println("QUADRADO = " + df.format(quadrado));       
        System.out.println("RETANGULO = " + df.format(retangulo));       
    }
}

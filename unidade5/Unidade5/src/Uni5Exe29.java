import java.util.Scanner;

public class Uni5Exe29 {
    /*Um caixa automático possui cédulas de 1, 2, 5, 10 e 20. Faça um programa que leia um valor e informe a quantidade mínima de cédulas que 
    ele precisará combinar para entregar o valor solicitado. Por exemplo: se o valor for 6, então ele fornecerá uma cédula de 5 e outra de 1. 
    Se o número for 47, então ele fornecerá duas cédulas de 20, uma de 5 e outras de 2.*/
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int valor = tec.nextInt();
        tec.close();
        int n20 = valor / 20;
        int n10 = (valor - n20 * 20) / 10;
        int n5 = (valor - n20 * 20 + n10 * 10) / 5;
        int n2 = (valor - n20 * 20 + n10 * 10 + n5 * 5) / 2;
        int n1 = (valor - n20 * 20 + n10 * 10 + n5 * 5 + n2 * 2) / 1;
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");
    }
}

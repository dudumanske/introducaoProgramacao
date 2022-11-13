import java.util.Scanner;

public class Uni3Uri1018 {
    /*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas 
    consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int valor = tec.nextInt();
        tec.close();
        int n100 = valor / 100;
        int n50 = (valor - n100 * 100) / 50;
        int n20 = (valor - (n100 * 100 + n50 * 50)) / 20;
        int n10 = (valor - (n100 * 100 + n50 * 50 + n20 * 20)) / 10;
        int n5 = (valor - (n100 * 100 + n50 * 50 + n20 * 20 + n10 * 10)) / 5;
        int n2 = (valor - (n100 * 100 + n50 * 50 + n20 * 20 + n10 * 10 + n5 * 5)) / 2;
        int n1 = (valor - (n100 * 100 + n50 * 50 + n20 * 20 + n10 * 10 + n5 * 5 + n2 * 2)) / 1;
        System.out.println(valor); 
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");
    }
}

import java.util.Scanner;

public class Uni3Uri1021 {
    /*Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número 
    de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis 
    são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double valor = tec.nextDouble();
        int valorInt = (int) valor;
        tec.close();
        int n100 = (int) (valorInt / 100);
        int n50 = (int) ((valorInt - n100 * 100) / 50);
        int n20 = (int) ((valorInt - (n100 * 100 + n50 * 50)) / 20);
        int n10 = (int) ((valorInt - (n100 * 100 + n50 * 50 + n20 * 20)) / 10);
        int n5 = (int) ((valorInt - (n100 * 100 + n50 * 50 + n20 * 20 + n10 * 10)) / 5);
        int n2 = (int) ((valorInt - (n100 * 100 + n50 * 50 + n20 * 20 + n10 * 10 + n5 * 5)) / 2);
        int n1 = (int) ((valorInt - (n100 * 100 + n50 * 50 + n20 * 20 + n10 * 10 + n5 * 5 + n2 * 2)) / 1);
        double valorDecimal = (valor - valorInt) * 100;
        int m50 = (int) (valorDecimal / 50);
        int m25 = (int) ((valorDecimal - m50 * 50) / 25);
        int m10 = (int) ((valorDecimal - (m50 * 50 + m25 * 25)) / 10);
        int m5 = (int) ((valorDecimal - (m50 * 50 + m25 * 25 + m10 * 10)) / 5);
        int m1 = (int) ((valorDecimal - (m50 * 50 + m25 * 25 + m10 * 10 + m5 * 5)) / 1);
        System.out.println("NOTAS:");  
        System.out.println(n100 + " nota(s) de R$ 100.00");
        System.out.println(n50 + " nota(s) de R$ 50.00");
        System.out.println(n20 + " nota(s) de R$ 20.00");
        System.out.println(n10 + " nota(s) de R$ 10.00");
        System.out.println(n5 + " nota(s) de R$ 5.00");
        System.out.println(n2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(n1 + " moeda(s) de R$ 1.00");
        System.out.println(m50 + " moeda(s) de R$ 0.50");
        System.out.println(m25 + " moeda(s) de R$ 0.25");
        System.out.println(m10 + " moeda(s) de R$ 0.10");
        System.out.println(m5 + " moeda(s) de R$ 0.05");
        System.out.println(m1 + " moeda(s) de R$ 0.01");
    }
}

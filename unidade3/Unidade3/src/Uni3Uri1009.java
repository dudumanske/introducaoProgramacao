import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1009 {
    /*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
    Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas 
    decimais. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double salario = tec.nextDouble();
        double totalVendas = tec.nextDouble();
        tec.close();
        double liquido = salario + (totalVendas * 0.15);
        System.out.println("TOTAL = " + df.format(liquido));
    }
}

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1008 {
    /*Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o 
    salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int numFunc = tec.nextInt();
        int numHoras = tec.nextInt();
        double valorHora = tec.nextDouble();
        tec.close();
        double salario = valorHora * numHoras;
        System.out.println("NUMBER = " + numFunc + "\nSALARY = U$ " + df.format(salario));
    }
}

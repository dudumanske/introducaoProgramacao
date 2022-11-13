import java.util.Scanner;

public class Uni4Exe15 {
    /*Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu salário. A empresa irá conceder 5% de 
    reajuste para o funcionário que for admitido há menos de 12 meses. Para funcionário admitido entre 13 e 48 meses, irá conceder 7% 
    de reajuste. O seu algoritmo deve solicitar ao usuário que digite a quantidade de meses que o funcionário foi admitido. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o sálario do funcionário:");
        double salario = tec.nextDouble();
        System.out.println("Há quantos meses o funcionário foi admitido:");
        double meses = tec.nextDouble();
        tec.close();
        if (meses < 13) {
            salario = salario * 1.05;
        } else if (meses >= 13 && meses <= 48) {
            salario = salario * 1.07;
        }
        System.out.println("O reajuste salarial ficou no valor de: R$ " + salario);
    }
}

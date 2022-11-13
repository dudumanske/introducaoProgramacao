import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe22 {
    /*Um funcionário recebe aumento anual. Em 1995 foi contratado por 2000 reais. Em 1996 recebeu aumento de 1.5%. A partir de 1997, os 
    aumentos sempre correspondem ao dobro do ano anterior. Faça programa que determine o salário atual do funcionário. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int ano = 1995;
        double salario = 2000, aumento = 0.015;;
        while (ano != 2022) {
            ano++;  
            salario = salario * (1 + aumento);
            aumento = 2 * aumento;
            System.out.println(df.format(salario));             
        }
        tec.close();
    }
}

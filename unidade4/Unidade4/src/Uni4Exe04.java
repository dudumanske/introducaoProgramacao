import java.util.Scanner;

public class Uni4Exe04 {
    /*Dado um número de ponto flutuante maior do que 0, informe se foram digitadas ou não casas decimais no número. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double valor = tec.nextDouble();
        tec.close();
        valor = valor - (int) valor;
        if (valor > 0) {
            System.out.println("Foram digitadas casas decimais no número");
        } else {
            System.out.println("Não foram digitadas casas decimais no número");
        }
    }
}

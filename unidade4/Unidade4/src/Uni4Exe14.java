import java.util.Scanner;

public class Uni4Exe14 {
    /*Leia uma data e determine se ela é válida. Ou seja, verifique se o mês está entre 1 e 12, e se o dia existe naquele mês. Note que 
    fevereiro tem 29 dias em anos bissextos, e 28 dias em anos não bissextos. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o dia:");
        int dia = tec.nextInt();
        System.out.println("Informe o mês:");
        int mes = tec.nextInt();
        System.out.println("Informe o ano:");
        int ano = tec.nextInt();
        tec.close();
        if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && ano >= 1) {
            if (mes == 1 || mes == 3 || mes == 4 || mes == 5 || mes == 6 || mes == 7 || mes == 8 || mes == 9 || mes == 10 || mes == 11 || mes == 12) {
                System.out.println("Data válida");
            } else {
                if (mes == 2 && dia <=28) {
                    System.out.println("Data válida");
                } else {
                    if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)) {
                        System.out.println("Data válida");
                    } else {
                        System.out.println("Data inválida");
                    }
                }
            }
        } else {
            System.out.println("Data inválida");
        }
    }
}

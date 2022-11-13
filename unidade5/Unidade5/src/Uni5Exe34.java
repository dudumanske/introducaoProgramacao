import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int opcao = 0, contas = 0;
        double valorPagar = 0;
        do {
            System.out.println("(1) encerrar a conta de um hóspede\n(2) verificar número de contas encerradas\n(3) sair.");
            opcao = tec.nextInt();
            if (opcao == 1) {
                System.out.println("Informe o nome do hóspede:");
                String nome = tec.next();
                System.out.println("Informe quantos dias ele ficou hospedado:");
                int dias = tec.nextInt();
                if (dias < 15) {
                    valorPagar = dias * 50 + dias * 7.5;
                } else if (dias == 15) {
                    valorPagar = dias * 50 + dias * 6.5;
                } else {
                    valorPagar = dias * 50 + dias * 5;
                }
                contas++;
                System.out.println("O valor a ser pago será de R$ " + valorPagar);
            } else if (opcao == 2) {
                System.out.println("Número de contas fechadas: " + contas);
            }
        } while (opcao != 3);
        tec.close();
    }
}

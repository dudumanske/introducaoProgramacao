import java.text.DecimalFormat;
import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Digite o valor da compra: ");
        double valorCompra = tec.nextDouble();
        System.out.println("1 - Débito\n2 - PIX\n3 - Crediário");
        System.out.println("Digite a forma de pagamento:");
        int opcao = tec.nextInt();
        switch (opcao) {
            case 1:
                valorCompra = valorCompra * 1.03;
                System.out.println("O valor da compra ficou em: R$ " + df.format(valorCompra));
                break;
            case 2:
                valorCompra = valorCompra * 0.95;
                System.out.println("O valor da compra ficou em: R$ " + df.format(valorCompra));
                break;
            case 3:
                System.out.println("Informe em quantas parcelas deseja pagar: ");
                int parcelas = tec.nextInt();
                System.out.println("Informe a data de vencimento: ");
                int diaVencimento = tec.nextInt();
                valorCompra = valorCompra / parcelas;
                System.out.println("A compra ficou em " + parcelas + " parcelas e cada parcela ficou no valor de R$ " + df.format(valorCompra));
                System.out.println("Informe o dia do pagamento da fatura: ");
                int diaPagamento = tec.nextInt();
                if (diaPagamento <= diaVencimento) {
                    valorCompra = valorCompra * 0.85;
                    System.out.println("A fatura foi paga antes do vencimento, desconto de 15% aplicado.\nValor da fatura: " + df.format(valorCompra) + ".\nO pagamento está em dia");
                } else if (diaPagamento <= diaVencimento + 10) {
                    System.out.println("A fatura foi paga até dez dias após o vencimento, desconto não aplicado.\nValor da fatura: " + df.format(valorCompra));
                } else if (diaPagamento > diaVencimento + 10) {
                    valorCompra = valorCompra * (1 + ((diaPagamento - (diaVencimento + 10)) * 0.02));
                    System.out.println("A fatura foi paga depois de dez dias após o vencimento da fatura, foi aplicada uma multa de 2% para cada dia de atraso. Valor da fatura: " + df.format(valorCompra));
                }
            default:
                break;
        }
        tec.close();
    }
}

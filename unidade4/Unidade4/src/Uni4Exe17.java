import java.util.Scanner;

public class Uni4Exe17 {
    /*Para realizar o cálculo do Imposto de Renda a ser pago, é solicitado a renda anual e o número de 
    dependentes do contribuinte. A renda líquida é calculada sobre a renda anual com um desconto de 2% para 
    cada dependente do contribuinte. O contribuinte com uma renda líquida de até R$ 2.000,00 não paga imposto.
    Para aqueles que possuem renda líquida entre R$ 2.000,00 e R$ 5.000,00 o imposto é de 5% sobre o valor da 
    renda líquida; para rendas líquidas de R$ 5.000,00 até R$ 10.000,00 é de 10%. Rendas superiores a 
    R$ 10.000,00 pagam 15% de imposto. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Renda anual: ");
        double rendaAnual = tec.nextDouble();
        System.out.println("Número de dependentes:");
        int dependentes = tec.nextInt();
        tec.close();
        double rendaLiquida = 0;
        if (rendaAnual > 2000 && rendaAnual <= 5000) {
            rendaLiquida = rendaAnual * (0.95 + (dependentes * 0.02));
        } else if (rendaAnual > 5000 && rendaAnual <= 10000){
            rendaLiquida = rendaAnual * (0.90 + (dependentes * 0.02));
        } else if (rendaAnual > 10000) {
            rendaLiquida = rendaAnual * (0.85 + (dependentes * 0.02));
        }
        System.out.println("Renda líquida: R$ " + rendaLiquida);
    }
}

import java.util.Scanner;

public class Uni3Exe08 {
    /*Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em 
    dólares para o atendente. Considerando que o atendente tem a cotação do dólar, descreva um programa para 
    calcular quantos reais o atendente deve devolver para a pessoa. */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double dolar = 5.17;
        System.out.println("Informe a quantidade de dólar a ser trocado: ");
        double dolarTrocado = teclado.nextDouble();
        
        double realDevolvido = dolarTrocado / dolar;
        teclado.close();
        System.out.println("Foi convertido US$ " + dolarTrocado + " para R$ " + realDevolvido);
    }
}

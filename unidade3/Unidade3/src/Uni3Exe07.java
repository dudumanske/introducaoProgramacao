import java.util.Scanner;

public class Uni3Exe07 {
    /*Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e 
    garrafa de 2 litros. Se um comerciante compra uma determinada quantidade de cada formato, faça um 
    programa para calcular quantos litros de refrigerante ele comprou. */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe quantas latas de 350 ml foram compradas: ");
        int quant350 = teclado.nextInt();
        System.out.println("Informe quantas garrafas de 600 ml foram compradas: ");
        int quant600 = teclado.nextInt();
        System.out.println("Informe quantas garrafas de 2 litos foram compradas: ");
        int quant2000 = teclado.nextInt();

        teclado.close();

        double quantComprada = (quant350 * 0.350) + (quant600 * 0.600) + (quant2000 * 2.0);

        System.out.println("Foram comprados " + quantComprada + " litros de refrigerante");
    }
}


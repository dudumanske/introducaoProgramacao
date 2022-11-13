import java.util.Scanner;

public class Uni5Exe26 {
    /*
     * Astolfo resolveu fazer uma viagem para conhecer o nosso país
     * Ele pretende visitar várias cidades, dividindo assim a viagem em vários
     * trechos. Entretanto Astolfo se nega
     * a passar por estradas cujo custo do pedágio exceda um determinado valor. Faça
     * um programa que leia inicialmente o valor do pedágio ao qual Astolfo se nega
     * a pagar. A seguir leia várias duplas de valores representando respectivamente
     * o custo do pedágio e a distância (em Km) do trecho. Calcular e escrever:
     * 
     * quantos trechos da viagem possuem um valor de pedágio acima do qual Astolfo
     * nega­se a pagar;
     * quantos trechos foram informados;
     * quantos trechos acima de 150Km de distância possuem um valor de pedágio que 
     * Astolfo concorda em pagar.
     * OBS: O programa será encerrado ao ser fornecido um valor de pedágio negativo.
     * Neste caso a leitura da distância não deve ser executada. Os resultados devem
     * ser impressos no final do programa.
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double pedagio = 1;
        int contador = 0, pedagioNegado = 0, pedagioAceito = 0;
        while (pedagio > 0) {
            System.out.println("Informe o valor do pedágio ao qual Astolfo se nega a pagar:");
            pedagio = tec.nextDouble();
            if (pedagio > 0) {
                System.out.println("Informe o custo do pedágio:");
                double custoPedagio = tec.nextDouble();
                System.out.println("Informe a distância do trecho em Km:");
                double distancia = tec.nextDouble();
                contador++;
                if (custoPedagio > pedagio) {
                    pedagioNegado++;
                }
                if (distancia > 150 && custoPedagio < pedagio) {
                    pedagioAceito++;
                }
            }
        }
        tec.close();
        System.out.println("Trechos com valor acima do qual Astolfo nega-se a pagar: " + pedagioNegado);
        System.out.println("Quantidade de trechos informados: " + contador);
        System.out.println("Trechos acima de 150km com valor aceito por Astolfo: " + pedagioAceito);
    }
}

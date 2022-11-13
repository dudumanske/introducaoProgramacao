import java.util.Scanner;

public class Uni5Exe23 {
    /*Uma grande loja de departamentos paga aos vendedores um salário com base nas vendas efetuadas durante o mês, que é igual a 30% de 
    comissão sobre o preço de cada produto vendido. Cada vendedor, em um determinado mês, vende n produtos, onde, para cada produto tem-se 
    o preço unitário e a quantidade vendida. O departamento de pessoal deseja obter um relatório com: nome, total de vendas (em R$) e salário 
    de cada vendedor. Descreva um algoritmo que gere o relatório desejado. Para prosseguir com a entrada de dados o algoritmo deve apresentar 
    a seguinte mensagem: “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?”. O número de produtos (n) de cada vendedor deve 
    ser informado. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        char opcao = 'k';
        while (opcao != 'N') {
            System.out.println("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO) ?");
            opcao = tec.next().charAt(0);
            opcao = Character.toUpperCase(opcao);
            if (opcao != 'N') {
                System.out.println("Informe o nome do vendedor:");
                String nome = tec.next();
                System.out.println("Informe o total de vendas: R$ ");
                double totalVendas = tec.nextDouble();
                System.out.println("Informe o salário do vendedor: R$");
                double salario = tec.nextDouble();
                salario += totalVendas * 0.70;
                System.out.println(nome);
                System.out.println(salario);
            }
        }
        tec.close();
    }
}

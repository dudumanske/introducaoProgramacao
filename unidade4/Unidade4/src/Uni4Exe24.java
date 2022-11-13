import java.util.Scanner;

public class Uni4Exe24 {
    /*
     * Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem
     * a partir de um menu de opções:
     * 
     * se opção = 1, escreva os 3 valores em ordem crescente
     * se opção = 2, escreva os 3 valores em ordem decrescente
     * se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite 3 valores: ");
        double valor1 = tec.nextDouble();
        double valor2 = tec.nextDouble();
        double valor3 = tec.nextDouble();
        System.out.println("1 - Valores em ordem crescente\n2 - Valores em ordem decrescente\n3 - Valores em que o maior fique no meio");
        System.out.println("Digite a opção: ");
        int opcao = tec.nextInt();
        tec.close();
        double menor = 0;
        double medio = 0;
        double maior = 0;
        if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3) {
            maior = valor1;
            medio = valor2;
            menor = valor3;
        } else if (valor1 > valor2 && valor1 > valor3 && valor3 > valor2) {
            maior = valor1;
            medio = valor3;
            menor = valor2;
        } else if (valor2 > valor1 && valor2 > valor3 && valor1 > valor3) {
            maior = valor2;
            medio = valor1;
            menor = valor3;
        } else if (valor2 > valor3 && valor2 > valor1 && valor3 > valor1) {
            maior = valor2;
            medio = valor3;
            menor = valor1;
        } else if (valor3 > valor2 && valor3 > valor1 && valor2 > valor1) {
            maior = valor3;
            medio = valor2;
            menor = valor1;
        } else if (valor3 > valor2 && valor3 > valor2 && valor1 > valor2) {
            maior = valor3;
            medio = valor1;
            menor = valor2;
        }
        switch (opcao) {
            case 1:
                System.out.println(menor + " " + medio + " " + maior);
                break;
            case 2:
                System.out.println(maior + " " + medio + " " + menor);
                break;
            case 3:
                System.out.println(menor + " " + maior + " " + medio);
                break;
            default:
                break;
        }
    }
}

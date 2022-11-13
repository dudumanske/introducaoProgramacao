import java.util.Scanner;

public class Uni3Exe12 {
    /*Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o número de dependentes. 
    A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário 
    família) e são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. 
    Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário. */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário: ");
        String nomeFunc = teclado.nextLine();
        System.out.println("Informe o número de horas trabalhadas pelo funcionário: ");
        int horasTrab = teclado.nextInt();
        System.out.println("Informe o número de dependentes familiares do funcionário: ");
        int dependentes = teclado.nextInt();
        teclado.close();

        double salarioBruto = (horasTrab * 10.0) + (dependentes * 60.0);
        double salarioLiquido = salarioBruto * 0.865;

        System.out.println("Funcionário: " + nomeFunc + "\nSalário bruto: R$ " + salarioBruto + "\nSalário líquido: R$ " + salarioLiquido);
    } 
}

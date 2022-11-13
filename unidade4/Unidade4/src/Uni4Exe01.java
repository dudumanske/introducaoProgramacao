import java.util.Scanner;

public class Uni4Exe01{
    /*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, 
    cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, 
    o valor por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas 
    (considere que o mês possua 4 semanas exatas). */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantas horas o funcionário trabalhou no mês: ");
        double horasMes = tec.nextInt();
        System.out.println("Qual o valor por hora trabalhada: ");
        double horasValor = tec.nextDouble();
        tec.close();
        double salarioTotal = horasMes * horasValor;
        if (horasMes > 160) {
            double salarioExtra = (horasMes - 160) * (horasValor / 2);
            salarioTotal = salarioTotal + salarioExtra; 
        }  
        System.out.println("O salário total é: R$ " + salarioTotal);          
    }
}
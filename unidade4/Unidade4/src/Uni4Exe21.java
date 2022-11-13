import java.util.Scanner;

public class Uni4Exe21 {
    /*O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma pessoa está no 
    peso ideal. O IMC é determinado pela divisão da massa do indivíduo pelo quadrado de sua altura, onde a 
    massa está em quilogramas e a altura está em metros, de acordo com a fórmula:

    IMC={Massa} / {Altura^2} */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe seu peso(em kg):");
        double massa = tec.nextDouble();
        System.out.println("Informe sua altura(em metros):");
        double altura = tec.nextDouble();
        tec.close();
        double imc = massa / Math.pow(altura, 2);
        if (imc < 18.5) {
            System.out.println("IMC: " + imc + "\nClassificação: Magreza");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("IMC: " + imc + "\nClassificação: Saudável");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("IMC: " + imc + "\nClassificação: Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("IMC: " + imc + "\nClassificação: Obesidade Grau I");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("IMC: " + imc + "\nClassificação: Obesidade Grau II (severa)");
        } else if (imc >= 40) {
            System.out.println("IMC: " + imc + "\nClassificação: Obesidade Grau III (mórbida)");
        }
    }
}

import java.util.Scanner;

public class Uni4Exe12 {
    /*Dados 3 valores lado1, lado2, lado3, que representam os comprimentos dos lados de um triângulo, descreva um algoritmo que verifique 
    se os mesmos podem ser os comprimentos dos lados de um triângulo. Em caso afirmativo, verifique e informe se é "triângulo equilátero", 
    "triângulo isósceles" ou "triângulo escaleno". Em caso negativo, informe que os mesmos não formam um triângulo. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double lado1 = tec.nextDouble();
        double lado2 = tec.nextDouble();
        double lado3 = tec.nextDouble();
        tec.close();
        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("O triângulo é equilátero");
            } else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("O triângulo é isóceles");
            } else {
                System.out.println("O triângulo é escaleno");
            }
        } else {
            System.out.println("Não forma um triângulo");
        }
    }
}

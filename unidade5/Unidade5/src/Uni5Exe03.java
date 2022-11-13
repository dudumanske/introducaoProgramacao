public class Uni5Exe03 {
    /*Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos: */
    public static void main(String[] args) {
        double resultado = 0;
        for (int i = 1; i <= 100; i++) {
            resultado += 1.0 / i;
        }
        System.out.println(resultado);
    }
}

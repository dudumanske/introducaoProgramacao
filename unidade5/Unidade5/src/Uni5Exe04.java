public class Uni5Exe04 {
    /*Descreva um algoritmo para calcular o valor de S dado por:
    Considere os 20 primeiros termos da série. */
    public static void main(String[] args) {
        double resultado = 0, a = 3.0, b = 2.0;
        for (int i = 1; i <= 20; i++) {
            resultado += a / b;
            a += 2.0;
            b += 2.0 * i + 2.0;
        }
        System.out.println(resultado);
    }
}

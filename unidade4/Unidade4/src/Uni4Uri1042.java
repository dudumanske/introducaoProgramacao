import java.util.Scanner;

public class Uni4Uri1042 {
    /*Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os 
    valores na sequência como foram lidos. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int valor1 = tec.nextInt();
        int valor2 = tec.nextInt();
        int valor3 = tec.nextInt();
        int menor = 0;
        int medio = 0;
        int maior = 0;
        tec.close();
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
        System.out.println(menor);
        System.out.println(medio);
        System.out.println(maior + "\n");
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);
    }
}

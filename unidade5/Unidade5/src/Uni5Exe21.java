public class Uni5Exe21 {
    /*Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros e cresce 3 centímetros por ano. Construa um algoritmo 
    que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico. */
    public static void main(String[] args) {
        double chico = 1.5, ze = 1.1;
        int ano = 0;
        while (ze < chico) {
            ano++;
            chico += 0.02;
            ze += 0.03;
        }
        System.out.println("Anos: " + ano);
    }
}

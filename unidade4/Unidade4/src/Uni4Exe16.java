import java.util.Scanner;

public class Uni4Exe16 {
    /*Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que a idade entre homens e 
    mulheres sempre serão diferentes). Calcule e escreva a soma das idades do homem mais velho com a mulher 
    mais nova, e o produto das idades do homem mais novo com a mulher mais velha. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe a idade de 2 homens:");
        int idadeH1 = tec.nextInt();  
        int idadeH2 = tec.nextInt();  
        System.out.println("Informe a idade de 2 mulheres:");
        int idadeM1 = tec.nextInt();
        int idadeM2 = tec.nextInt();
        tec.close();
        int soma = 0;
        int produto = 0;
        if (idadeH1 > idadeH2 && idadeM1 < idadeM2) {
            soma = idadeH1 + idadeM1;
            produto = idadeH2 * idadeM2;
        } else if (idadeH1 < idadeH2 && idadeM1 < idadeM2){
            soma = idadeH2 + idadeM1;
            produto = idadeH1 * idadeM2;
        } else if (idadeH1 < idadeH2 && idadeM1 > idadeM2){
            soma = idadeH2 + idadeM2;
            produto = idadeH1 * idadeM1;
        } else if (idadeH1 > idadeH2 && idadeM1 > idadeM2){
            soma = idadeH1 + idadeM2;
            produto = idadeH2 * idadeM1;
        }
        System.out.println("Soma das idades: " + soma + "\nProduto das idades: " + produto);
    }
}

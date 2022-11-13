import java.util.Scanner;

public class Uni4Exe11 {
    /*Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, 
    APENAS IRMÃOS. Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos demais, e apenas irmãos se 
    todas as idades forem diferentes. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int ano1 = tec.nextInt();
        int ano2 = tec.nextInt();
        int ano3 = tec.nextInt();
        tec.close();
        if (ano1 == ano2 && ano2 == ano3) {
            System.out.println("Eles são trigêmeos");
        } else if (ano1 == ano2 && ano2 != ano3){
            System.out.println("Gêmeos e o 3o é irmão");
        } else if(ano1 == ano3 && ano3 != ano2){
            System.out.println("Gêmeos e o 2o é irmão");
        } else if(ano2 == ano3 && ano2 != ano1){
            System.out.println("Gêmeos e o 1o é irmão");
        } else{
            System.out.println("Todos são irmões");
        }
    }
}

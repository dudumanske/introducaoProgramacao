import java.util.Scanner;

public class Uni5Exe32 {
    /*Escreva um programa que imprime um calendário para um determinado mês. O calendário deve conter cada dia do mês e o dia da semana 
    correspondente. A entrada consiste de um inteiro especificando em que dia da semana cai o primeiro dia do mês 
    (1=Domingo, 2=Segunda,...,7=Sábado) e um inteiro especificando o número de dias que o mês possui.

    Exemplo: p = 3 n = 31 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Em qual dia da semana começa o mês ?");
        int dia = scan.nextInt();
        System.out.println("Quantos dias tem o mês?");
        int dias = scan.nextInt();
        System.out.println("D  S  T  Q  Q  S  S");
        System.out.println("-------------");
        for(int i = 1; i < dia; i++){
            System.out.print("  ");
        }
        for(int i = 1; i <= dias; i++){
            System.out.print(i + " ");
            if(dia == 7){
                dia = 1;
                System.out.println();
            }else{
                dia++;
            }
        }
    }
}

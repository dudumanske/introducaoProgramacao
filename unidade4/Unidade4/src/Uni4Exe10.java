import java.util.Scanner;

public class Uni4Exe10 {
    /*Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um algoritmo para ler as idades dos filhos e exibir quem é o 
    caçula da família; suponha que não haja empates. */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Idade do Marquinhos:");
        int idade1 = tec.nextInt();
        System.out.println("Idade do Zezinho:");
        int idade2 = tec.nextInt();
        System.out.println("Idade do Luluzinha:");
        int idade3 = tec.nextInt();
        tec.close();
        if (idade1 < idade2 && idade1 < idade3) {
            System.out.println("Marquinhos é o caçula");
        } else if (idade2 < idade1 && idade2 < idade3){
            System.out.println("Zezinho é o caçula");
        } else {
            System.out.println("Luluzinha é a caçula");
        }
    }
}

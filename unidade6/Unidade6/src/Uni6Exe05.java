import java.util.Scanner;

public class Uni6Exe05 {

    private Uni6Exe05(){
        Scanner tec = new Scanner(System.in);
        int vetorM[] = new int[5];
        int vetorF[] = new int[5];
        int indice = 0;
        lerRespostas(vetorM, vetorF, tec);
        cacularIndice(vetorM, vetorF, indice);
        apresentarAfinidade(vetorM, vetorF, indice);
        tec.close();
    }

    private void lerRespostas(int vetorM[], int vetorF[], Scanner tec){
        System.out.println("1 - Sim\n2 - Não\n3 - Indiferente");
        System.out.println("Gosta de música sertaneja?");
        vetorM[0] = tec.nextInt();
        System.out.println("Gosta de futebol?");
        vetorM[1] = tec.nextInt();
        System.out.println("Gosta de seriados?");
        vetorM[2] = tec.nextInt();
        System.out.println("Gosta de redes sociais?");
        vetorM[3] = tec.nextInt();
        System.out.println("Gosta da Oktoberfest?");
        vetorM[4] = tec.nextInt();
        System.out.println("Gosta de música sertaneja?");
        vetorF[0] = tec.nextInt();
        System.out.println("Gosta de futebol?");
        vetorF[1] = tec.nextInt();
        System.out.println("Gosta de seriados?");
        vetorF[2] = tec.nextInt();
        System.out.println("Gosta de redes sociais?");
        vetorF[3] = tec.nextInt();
        System.out.println("Gosta da Oktoberfest?");
        vetorF[4] = tec.nextInt();
    }

    private int cacularIndice(int vetorM[], int vetorF[], int indice){
        for (int i = 0; i < 5; i++) {
            if (vetorF[i] == vetorM[i]) {
                indice += 3;
            } else if ((vetorF[i] == 3 && vetorM[i] != 3) || (vetorM[i] == 3 && vetorF[i] != 3)) {
                indice++;
            } else if ((vetorF[i] == 1 && vetorM[i] == 2) || (vetorM[i] == 1 && vetorF[i] == 2)){
                indice -= 2;
            } 
        }
        return indice;
    }

    private void apresentarAfinidade(int vetorM[], int vetorF[], int indice){
        if (indice <= -10) {
            System.out.println("Vocês de odeiam!");
        } else if (indice > -10 && indice < 0) {
            System.out.println("Melhor não perder tempo");
        } else if (indice >= 0 && indice < 5) {
            System.out.println("Vale um encontro");
        } else if (indice >= 5 && indice < 10) {
            System.out.println("Talvez não dê certo :(");
        } else if (indice >= 10 && indice < 15) {
            System.out.println("Vocês têm muita coisa em comum");
        } else {
            System.out.println("Casem!");
        }
    }

    public static void main(String[] args) {
        new Uni6Exe05();
    }
}

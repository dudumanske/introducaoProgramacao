import java.util.Scanner;

public class Uni6Exe09 {

    private Uni6Exe09(){
        Scanner tec = new Scanner(System.in);
        int c = 30, homem = 0;
        int sexo[] = new int[c];
        int nota[] = new int[c];
        int idade[] = new int[c];
        lerValores(tec, idade, nota, sexo, c);
        double mediaCinema = 0, mediaHomens = 0;
        int mulherJovem = 100, mulherIdosa = 0, notaJovem = 0;
        mediaCinema = mediaCinema(nota, sexo, c, homem, mediaCinema, mediaHomens);
        mediaHomens = mediaHomens(nota, sexo, c, homem, mediaCinema, mediaHomens);
        notaJovem = notaJovem(idade, nota, sexo, c, mulherJovem, notaJovem);
        mulherIdosa = mulherIdosa(idade, nota, sexo, c, mulherJovem, notaJovem, mediaCinema, mulherIdosa);
        imprimirPesquisa(mediaCinema, mediaHomens, notaJovem, mulherIdosa);
        tec.close();
    }

    private double mediaCinema(int nota[], int sexo[], int c, int homem, double mediaCinema, double mediaHomens){
        for (int i = 0; i < c; i++) {
            mediaCinema += nota[i];            
        }
        mediaCinema = mediaCinema / c; 
        return mediaCinema;   
    }  

    private double mediaHomens(int nota[], int sexo[], int c, int homem, double mediaCinema, double mediaHomens){
        for (int i = 0; i < c; i++) {
            if (sexo[i] == 2) {
                homem++;
                mediaHomens += nota[i];
            }
        }
        mediaHomens = mediaHomens / homem;
        return mediaHomens;
    }
    
    private int notaJovem(int idade[], int nota[], int sexo[], int c, int mulherJovem, int notaJovem){
        for (int i = 0; i < c; i++) {
            if(sexo[i] == 1 && idade[i] < mulherJovem){
                mulherJovem = idade[i];
                notaJovem = nota[i];
            }
        }
        return notaJovem;
    }

    private int mulherIdosa(int idade[], int nota[], int sexo[], int c, int mulherJovem, int notaJovem, double mediaCinema, int mulherIdosa){
        for (int i = 0; i < c; i++) {
            if (sexo[i] == 1 && idade[i] > 50 && nota[i] > mediaCinema) {
                mulherIdosa++;
            }
        }
        return mulherIdosa;
    }

    
    private void imprimirPesquisa(double mediaCinema, double mediaHomens, int notaJovem, int mulherIdosa){
        System.out.println("Nota média recebida pelo cinema: " + mediaCinema);
        System.out.println("Nota média recebida pelos homens: " + mediaHomens);
        System.out.println("Nota atribuída pela mulher mais jovem: " + notaJovem);
        System.out.println("Mulheres com mais de 50 anos que deram nota superior a média recebida pelo cinema: " + mulherIdosa);
    }

    private void lerValores(Scanner tec, int idade[], int nota[], int sexo[], int c){
        for (int i = 0; i < c; i++) {
            System.out.println("Sexo: 1 = Feminino | 2 = Masculino");
            sexo[i] = tec.nextInt();
            System.out.println("Informe a nota do cinema(0 até 10): ");
            nota[i] = tec.nextInt();
            System.out.println("Informe a idade:");
            idade[i] = tec.nextInt();
        }
    }

    public static void main(String[] args) {
        new Uni6Exe09();   
    }
}

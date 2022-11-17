import java.util.Scanner;

public class EduardoRenanManske_2 {

    private EduardoRenanManske_2(){
        Scanner tec = new Scanner(System.in);
        System.out.print("Tamanho do vetor: ");
        int vetor = tec.nextInt();
        int vetA[] = new int[vetor];
        int vetB[] = new int[vetor];
        int vetSoma[] = new int[vetor];
        lerVetor(tec, vetA, vetB, vetor);
        somarVetores(vetA, vetB, vetor, vetSoma);
        ordenarValores(vetSoma, vetor);
        mostrarVetor(vetSoma, vetor);
        tec.close();
    }

    private void lerVetor(Scanner tec, int vetA[], int vetB[], int vetor){
        System.out.println("___ Lendo o VetA ___");
        for (int i = 0; i < vetor; i++) {
            System.out.print("VetA[" + i + "]: ");
            vetA[i] = tec.nextInt();
        }
        System.out.println("___ Lendo o VetB ___");
        for (int i = 0; i < vetor; i++) {
            System.out.print("VetB[" + i + "]: ");
            vetB[i] = tec.nextInt();
        }
    }

    private void somarVetores(int vetA[], int vetB[], int vetor, int vetSoma[]){
        for (int i = 0; i < vetor; i++) {
            vetSoma[i] = vetA[i] + vetB[i];
        }
    }

    private void ordenarValores(int vetSoma[], int vetor) {
        for (int i = 0; i < vetor - 1;) {
            if (vetSoma[i] > vetSoma[i + 1]) {
                int bolha = vetSoma[i];
                vetSoma[i] = vetSoma[i + 1];
                vetSoma[i + 1] = bolha;
                i = 0;
            } else {
                i++;
            }
        }
    }

    private void mostrarVetor(int vetSoma[], int vetor){
        System.out.println("__ Resultado __");
        for (int i = 0; i < vetor; i++) {
            System.out.println("VetSoma[" + i + "]: " + vetSoma[i]);
        }
    }

    public static void main(String[] args) {
        new EduardoRenanManske_2();
    }
}

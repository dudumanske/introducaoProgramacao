import java.util.Scanner;

public class Uni6Exe10 {

    private Uni6Exe10() {
        Scanner tec = new Scanner(System.in);
        int opcao = 0, posVetor = 0, pesquisa;
        int vetor[] = new int[50];
        do {
            System.out.println("1 - Incluir valor");
            System.out.println("2 – Pesquisar valor");
            System.out.println("3 – Alterar valor");
            System.out.println("4 – Excluir valor");
            System.out.println("5 – Mostrar valores");
            System.out.println("6 – Ordenar valores");
            System.out.println("7 – Inverter valores");
            System.out.println("8 – Sair do sistema");
            System.out.println("Informe a opção:");
            opcao = tec.nextInt();
            switch (opcao) {
                case 1:
                    posVetor = incluirValor(vetor, posVetor, tec);
                    break;
                case 2:
                    pesquisa = pesquisaValor(tec, vetor, posVetor);
                    if (pesquisa != -1) {
                        System.out.println("O valor informado está na posição vetor[" + pesquisa + "]");
                    } else {
                        System.out.println("O valor não está informado");
                    }
                    break;
                case 3:
                    pesquisa = pesquisaValor(tec, vetor, posVetor);
                    if (pesquisa != -1) {
                        System.out.println("Informe o novo Valor:");
                        vetor[pesquisa] = tec.nextInt();
                    } else {
                        System.out.println("Valor não encontrado");
                    }
                    break;
                case 4:
                    pesquisa = pesquisaValor(tec, vetor, posVetor);
                    if (pesquisa != -1) {
                        vetor[pesquisa] = 0;
                        System.out.println("Valor excluído");
                        posVetor = preencherVetor(vetor, posVetor);
                    } else {
                        System.out.println("Valor não encontrado");
                    }
                    break;
                case 5:
                    mostrarValores(vetor, posVetor);
                    break;
                default:
                    break;
                case 6:
                    ordenarValores(vetor, posVetor);
                    break;
                case 7:
                    inverterValores(vetor, posVetor);
                    break;
            }
        } while (opcao != 8);
        tec.close();
    }

    private int incluirValor(int vetor[], int posVetor, Scanner teclado) {
        if (posVetor < vetor.length) {
            System.out.println("Informe um valor para inclusão:");
            vetor[posVetor] = teclado.nextInt();
            System.out.println("Valor: " + vetor[posVetor] + " foi adicionado na posição vetor[" + posVetor + "]");
            posVetor++;

        } else {
            System.out.println("Vetor está cheio, valor não foi adicionado.");
        }

        return posVetor;
    }

    private int pesquisaValor(Scanner tec, int vetor[], int posVetor) {
        System.out.println("Informe o valor:");
        int valor = tec.nextInt();
        for (int i = 0; i < posVetor; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    private int preencherVetor(int vetor[], int posVetor) {
        for (int i = 0; i < posVetor; i++) {
            if (vetor[i] == 0) {
                vetor[i] = vetor[i + 1];
                posVetor--;
            }
        }
        return posVetor;
    }

    private void mostrarValores(int vetor[], int posVetor) {
        System.out.print("Vetor: ");
        for (int i = 0; i < posVetor; i++) {
            System.out.print("[" + vetor[i] + "]");
        }
        System.out.println();
    }

    private void ordenarValores(int vetor[], int posVetor) {
        for (int i = 0; i < posVetor - 1;) {
            if (vetor[i] > vetor[i + 1]) {
                int bolha = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = bolha;
                i = 0;
            } else {
                i++;
            }
        }
    }

    private void inverterValores(int vetor[], int posVetor) {
        int temp = 0;
        for (int i = 0; i < posVetor; i++) {
            for (int x = 0; x < i; x++) {
                temp = vetor[i];
                vetor[i] = vetor[x];
                vetor[x] = temp;
            }
        }
    }

    public static void main(String[] args) {
        new Uni6Exe10();
    }
}

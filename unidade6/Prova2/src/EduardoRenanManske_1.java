import java.util.Scanner;

public class EduardoRenanManske_1 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int opcao, chapa1 = 0, chapa2 = 0, nulo = 0, geral = 0;
        do {
            System.out.println("___Elições Centro Acadêmico___");
            System.out.println("1 - Voto em Chapa1");
            System.out.println("2 - Voto em Chapa2");
            System.out.println("3 - Voto Nulo");
            System.out.println("0 - Encerrar votaçao");
            System.out.print("opção: ");
            opcao = tec.nextInt();
            switch (opcao) {
                case 1:
                    chapa1++;
                    geral++;
                    break;
                case 2:
                    chapa2++;
                    geral++;
                    break;
                case 3:
                    nulo++;
                    geral++;
                    break;
                default:
                    while (opcao < 0 || opcao > 3) {
                        System.out.println("Opção incorreta");
                        System.out.print("opção: ");
                        opcao = tec.nextInt();
                        switch (opcao) {
                            case 1:
                                chapa1++;
                                geral++;
                                break;
                            case 2:
                                chapa2++;
                                geral++;
                                break;
                            case 3:
                                nulo++;
                                geral++;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
            }
        } while (opcao != 0);
        System.out.println("******* Resultados Eleições *******");
        System.out.println("Total de votos Chapa1: " + chapa1);
        System.out.println("Total de votos Chapa2: " + chapa2);
        System.out.println("Total de votos Nulos: " + nulo);
        System.out.println("Total Geral de votos: " + geral);
        tec.close();
    }
}
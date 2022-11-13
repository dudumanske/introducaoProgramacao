import java.util.Scanner;

public class Uni5Exe18 {
    /*
     * Foi feita uma pesquisa de audiência de canal de TV em n casas de um
     * determinado bairro de uma cidade, em um certo dia do mês. Na pesquisa foi
     * utilizado um coletor de dados portátil. Para cada casa visitada, foi
     * fornecido o número do canal (4, 5, 9, 12) e o número de pessoas que estavam
     * assistindo a TV naquele horário, considerando que em cada casa só existia uma
     * televisão. Em casas onde a televisão estava desligada, foi registrado zero
     * para o número do canal e para o número de pessoas. Baseado nisto descreva um
     * algoritmo que calcule e escreva, para cada emissora, o percentual de
     * audiência. A leitura deve ser finalizada quando for informado canal 0.
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int canal = 1; 
        double canal4 = 0, canal5 = 0, canal9 = 0, canal12 = 0, pessoasTotal = 0;
        while (canal != 0) {
            System.out.println("Informe o número do canal:");
            canal = tec.nextInt();
            if (canal != 0) {
                System.out.println("Informe quantas pessoas estavam assistindo: ");
                int pessoas = tec.nextInt();
                pessoasTotal += pessoas;
                switch (canal) {
                    case 4:
                        canal4 += pessoas;
                        break;
                    case 5:
                        canal5 += pessoas;
                        break;
                    case 9:
                        canal9 += pessoas;
                        break;
                    case 12:
                        canal12 += pessoas;
                        break;
                    default:
                        break;
                }
            }
        }
        tec.close();
        canal4 = (canal4 / 100) * pessoasTotal;
        canal5 = (canal5 / 100) * pessoasTotal;
        canal9 = (canal9 / 100) * pessoasTotal;
        canal12 = (canal12 / 100) * pessoasTotal;
        System.out.println("Porcentagem de audiência: ");
        System.out.println("Canal 4: " + canal4);
        System.out.println("Canal 5: " + canal5);
        System.out.println("Canal 9: " + canal9);
        System.out.println("Canal 12: " + canal12);
    }
}

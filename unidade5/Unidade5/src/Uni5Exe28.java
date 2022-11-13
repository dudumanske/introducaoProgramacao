import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe28 {
    /*
     * Uma emissora de rádio decidiu promover uma eleição para determinar o melhor
     * conjunto do ano segundo a opinião dos ouvintes. Entraram
     * na disputa apenas os quatro conjuntos mais solicitados durante o ano. Os
     * votos são informados através de códigos:
     * Descreva um algoritmo que:
     * 
     * informe o total de votos para cada grupo;
     * informe o percentual dos votos para cada grupo;
     * informe o grupo vencedor.
     * O algoritmo deve apresentar ao usuário a seguinte mensagem: mais um voto: s
     * (SIM) / n (NÃO)? antes de prosseguir com a entrada de dados.
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        char opcao = 'o';
        double voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0, pessoas = 0, vencedor = 0;
        String grupoVencedor = "";
        while (opcao != 'S') {
            System.out.println("Digite o código do voto:");
            int voto = tec.nextInt();
            pessoas++;
            switch (voto) {
                case 1:
                    voto1++;
                    break;
                case 2:
                    voto2++;
                    break;
                case 3:
                    voto3++;
                    break;
                case 4:
                    voto4++;
                    break;
                default:
                    break;
            }
            if (voto1 > vencedor) {
                vencedor = voto1;
                grupoVencedor = "Nenhum de Nós";
            } else if (voto2 > vencedor) {
                vencedor = voto2;
                grupoVencedor = "CPM22";
            } else if (voto3 > vencedor) {
                vencedor = voto3;
                grupoVencedor = "Skank";
            } else if (voto4 > vencedor) {
                vencedor = voto4;
                grupoVencedor = "Jota Quest";
            }
            System.out.println("Mais um voto: s (SIM) / n (NÃO)?");
            opcao = tec.next().charAt(0);
            opcao = Character.toUpperCase(opcao);
        }
        tec.close();
        System.out.println("Nenhum de Nós: " + voto1 + " voto(s)");
        System.out.println("CPM22: " + voto2 + " voto(s)");
        System.out.println("Skank: " + voto3 + " voto(s)");
        System.out.println("Jota Quest: " + voto4 + " voto(s)");
        voto1 = (voto1 / 100) * pessoas;
        voto2 = (voto2 / 100) * pessoas;
        voto3 = (voto3 / 100) * pessoas;
        voto4 = (voto4 / 100) * pessoas;
        System.out.println("Nenhum de Nós: " + df.format(voto1) + "%");
        System.out.println("CPM22: " + df.format(voto2) + "%");
        System.out.println("Skank: " + df.format(voto3) + "%");
        System.out.println("Jota Quest: " + df.format(voto4) + "%");
        System.out.println("O grupo vencedor foi o " + grupoVencedor);
    }
}

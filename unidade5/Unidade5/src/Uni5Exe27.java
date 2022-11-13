import java.util.Scanner;

public class Uni5Exe27 {
    /*
     * Uma fábrica resolveu, no mês de Abril, pagar seus funcionários um valor
     * diário conforme as regras descritas abaixo. Escreva um programa para ler o
     * dia do mês de abril que será calculado o valor diário. O programa deve
     * validar a leitura do dia deforma a aceitar apenas valores válidos para o mês
     * de Abril (1 a 30). Caso o dia seja inválido, escrever a mensagem
     * "Dia inválido" e repetir a leitura até que seja válido. A seguir deve ser
     * lido o total de peças produzidas pelo funcionário no turno da manhã e o total
     * de peças produzidas no turno da tarde. Escrever o valor que o respectivo
     * funcionário receberá no dia. Logo após exibir a mensagem
     * "Novo funcionário (1.sim 2.não)?". Caso a resposta seja 1 o programa deve ser
     * repetido solicitando novamente o dia do mês e a produção de peças do
     * funcionário em cada turno, caso contrário deve ser encerrado.
     * 
     * Regras:
     * 
     * para a primeira quinzena do mês (1 a 15) o funcionário recebe R$ 0,80 por
     * peça caso tenha produzido mais de 100 no dia (considerando manhã e tarde),
     * desde que a produção em cada um dos turnos não seja inferior a 30. Caso
     * contrário recebe R$ 0,50 por peça.
     * para a segunda quinzena do mês (16 a 30) o funcionário recebe R$ 0,40 por
     * peça produzida no turno da manhã e R$ 0,30 por peça produzida no turno da
     * tarde.
     * Considere que a produção em cada turno nunca será a mesma (não é necessário
     * validar) Responda também:
     * 
     * qual dia ocorreu a maior produção;
     * em qual período o funcionário mais produz (manhã ou tarde e a quantidade
     * produzida).
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int funcionario = 0, maiorProducao = 0, diaMaiorProd= 0, totalPecasM = 0, totalPecasT = 0;
        double valorRecebido = 0;
        while (funcionario != 2) {
            int dia = 0;
            while (dia < 1 && dia > 30) {
                System.out.println("Informe o dia:");
                dia = tec.nextInt();
                if (dia < 1 && dia > 30) {
                    System.out.println("Dia inválido");
                }
            }
            System.out.println("Número de peças produzidas pelo funcionário na parte da manhã:");
            int numPecasManha = tec.nextInt();
            System.out.println("Número de peças produzidas pelo funcionário na parte da tarde:");
            int numPecasTarde = tec.nextInt();
            totalPecasM += numPecasManha;
            totalPecasT += numPecasTarde;
            if (numPecasManha + numPecasTarde > maiorProducao) {
                diaMaiorProd = dia;
                maiorProducao = numPecasManha + numPecasTarde;
            }
            if (dia >= 1 && dia <= 15 && numPecasManha + numPecasTarde > 100 && numPecasManha < 30 && numPecasTarde < 30) {
                valorRecebido = (numPecasManha + numPecasTarde) * 0.8;
            } else if (dia >= 1 && dia <= 15 && numPecasManha + numPecasTarde > 100) {
                valorRecebido = (numPecasManha + numPecasTarde) * 0.5;
            } else if (dia >= 16 && dia <= 30){
                valorRecebido = (numPecasManha * 0.4) + (numPecasTarde * 0.3);
            }
            System.out.println("R$ " + valorRecebido + " (valor recebido)");
            System.out.println("Novo funcionário: (1.sim 2.não)?");
            funcionario = tec.nextInt();
        }
        tec.close();
        System.out.println("Dia da maior produçao: " + diaMaiorProd);
        if (totalPecasM > totalPecasT) {
            System.out.println("O funcionário produz mais peças no período da manhã e foram produzidas " + totalPecasM + " peças");
        } else {
            System.out.println("O funcionário produz mais peças no período da tarde e foram produzidas " + totalPecasT + " peças");
        }
    }
}

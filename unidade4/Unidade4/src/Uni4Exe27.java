import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe27 {
    /*
     * As tarifas de um estacionamento são as seguintes:
     * 
     * 1° e 2° hora - R$ 5,00 cada
     * 3° e 4° hora - R$ 7,50 cada
     * 5° hora e seguintes - R$ 10,00 cada
     * 
     * O número de horas a pagar é sempre inteiro e arredondado para cima ou para
     * baixo dependendo do tempo. Até 29 minutos depois da chegada, arredonda-se
     * para baixo e após 30 minutos arredonda-se para cima. Por exemplo, quem
     * estacionar durante 1 hora e 15 minutos pagará por 1 hora e quem estacionar
     * por 1 hora e 35 minutos pagará por duas horas. Entretanto, se a pessoa
     * permaneceu menos de 30 minutos, também pagará por uma hora. Os horários de
     * chegada e partida são apresentados na forma de pares de inteiros,
     * representando horas e minutos. Por exemplo, o par 12 50 representará meio dia
     * e cinquenta. Assim, faça um algoritmo que leia os horários de chegada e de
     * partida e escreva na tela o tempo que ficou estacionado, e o preço a ser
     * cobrado. Deverá haver validação de dados. Admite-se que a chegada e a partida
     * se dão com intervalo não superior a 24 horas, e sempre chegam e saem no mesmo
     * dia.
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Digite a hora e os minutos em que o veículo chegou:");
        int horaC = tec.nextInt();
        int minutoC = tec.nextInt();
        System.out.println("Digite a hora e os minutos em que o veículo quer sair:");
        int horaS = tec.nextInt();
        int minutoS = tec.nextInt();
        tec.close();
        double valor = 0;
        int duracaoH = 0;
        int duracaoM = 0;
        
        if (minutoC > minutoS) {
            duracaoH = horaS - horaC - 1;
            duracaoM = (60 - minutoC) + minutoS;
        } else if (minutoC < minutoS){
            duracaoH = horaS - horaC;
            duracaoM = minutoS - minutoC;
        }

        if (duracaoH == 0) {
            valor = 5;
        } else if (duracaoH == 1 || duracaoH ==2) {
            if (duracaoM <= 29) {
                valor = 5 * duracaoH;
            } else if (duracaoH == 2 && duracaoM >= 30) {
                valor = 7.5 * duracaoH;
            }
        } else if (duracaoH == 3 || duracaoH ==4) {
            if (duracaoM <= 29) {
                valor = 7.5 * duracaoH;
            } else if (duracaoH == 4 && duracaoM >= 30) {
                valor = 10 * duracaoH;
            }
        } else if (duracaoH >= 5) {
            if (duracaoM <= 29) {
                valor = 10 * duracaoH;
            } else {
                valor = 10 * (duracaoH + 1);
            }
        }

        if (duracaoH < 10 && duracaoM < 10) {
            System.out.println("Tempo estacionado: 0" + duracaoH + ":0" + duracaoM);
        } else if (duracaoH < 10 && duracaoM > 10){
            System.out.println("Tempo estacionado: 0" + duracaoH + ":" + duracaoM);
        } else if (duracaoH > 10 && duracaoM < 10){
            System.out.println("Tempo estacionado: " + duracaoH + ":0" + duracaoM);
        } else {
            System.out.println("Tempo estacionado: " + duracaoH + ":" + duracaoM);
        }
        System.out.println("Deverá ser pago: R$ " + df.format(valor));
    }
}

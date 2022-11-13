import java.util.Scanner;

public class Uni5Exe13 {
    /*
     * Um motorista acaba de voltar de um feriado prolongado. Antes de sair de
     * viagem e imediatamente após retornar, o motorista encheu o tanque do veículo
     * e registrou as medidas do odômetro. Em cada parada feita durante a viagem,
     * foi registrado o valor do odômetro e a quantidade de combustível comprado
     * para reabastecer o veículo (suponha que o tanque foi enchido a cada parada).
     * Descreva um algoritmo que leia o número total de reabastecimentos feitos e os
     * dados registrados relativos à compra de combustível. Calcule e escreva:
     * 
     * a quilometragem obtida por litro de combustível em cada parada;
     * a quilometragem média obtida por litro de combustível em toda a viagem.
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe quantas paradas você realizou: ");
        int paradas = tec.nextInt();
        double odometroM = 0, gasolinaM = 0;
        for (int i = 1; i <= paradas; i++) {
            System.out.println("Informe em quantos km o odômetro aumentou na " + i + "a parada:");
            double odometro = tec.nextInt();
            System.out.println("Informe a quantidade de combustível comprada na " + i + "a parada:");
            double gasolina = tec.nextDouble();
            double kmParada = odometro / gasolina;
            System.out.println("A quilometragem por litro foi de " + kmParada + " km/L");
            odometroM += odometro;
            gasolinaM += gasolina;
        }
        tec.close();
        double kmMedia = odometroM / gasolinaM;
        System.out.println("A quilometragem média por litro em toda viagem foi de: " + kmMedia + " km/L");
    }
}

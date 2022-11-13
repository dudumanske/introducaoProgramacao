import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1015 {
    /*Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a 
    distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

    Distancia = */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");
        double x1 = tec.nextDouble();
        double y1 = tec.nextDouble();
        double x2 = tec.nextDouble();
        double y2 = tec.nextDouble();
        tec.close();
        double distancia = Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
        System.out.println(df.format(distancia));
    }
}

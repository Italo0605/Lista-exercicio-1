import java.util.Scanner;
import java.lang.Math;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o raio do circulo: ");
        double raio = scan.nextFloat();

        double area = 3.14 * Math.pow(raio, 2);
        System.out.print("O valor da Área do circulo é: "+area);
        scan.close();
    }
}

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade em metros: ");
        float metros = scan.nextFloat();

        float cent = metros*100;

        System.out.print("Quantidade em centímetros: "+cent);
        scan.close();
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("digite o valor de um lado: ");        
        double base = scan.nextDouble();

        double area = base*base;
        System.out.println("O valor da Area é: "+ area);
        scan.close();
    }
}

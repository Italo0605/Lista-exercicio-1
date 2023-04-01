import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Por favor digite um numero: ");
        int number = scan.nextInt();

        System.out.println("O numero digitado foi: "+number);
        scan.close();
    }
}

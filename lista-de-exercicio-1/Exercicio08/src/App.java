import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora? ");
        Double valorHora = scan.nextDouble();

        System.out.print("Digite o numero de horas trabalhadas no mês: ");
        Double horasMes = scan.nextDouble();

        double valorTotal = horasMes * valorHora;

        System.out.print("O valor total é: "+ valorTotal);
        
        scan.close();
    }
}

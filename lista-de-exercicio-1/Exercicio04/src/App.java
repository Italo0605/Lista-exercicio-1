import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor digite a primeira nota bimestral: ");
        float note1 = scan.nextInt();

        System.out.println("Por favor digite a segunda nota bimestral: ");
        float note2 = scan.nextInt();

        System.out.println("Por favor digite a terceira nota bimestral: ");
        float note3 = scan.nextInt();

        System.out.println("Por favor digite a quarta nota bimestral: ");
        float note4 = scan.nextInt();

        float media = (note1+note2+note3+note4)/4;
        System.out.println("O valor da média é: "+ media);
        scan.close();
    }
}

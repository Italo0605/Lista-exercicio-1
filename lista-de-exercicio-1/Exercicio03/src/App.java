// Para ler inputs no java é necessario usar a classe Scanner 
// primeiro importe ele;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in); //Instancie a classe scan

        System.out.println("Por favor digite um numero: ");
        float num1 = scan.nextFloat(); // a leitura é feita como no C# como se fosse um "Console.ReadLine()";

        System.out.println("Por favor digite  o segundo numero: ");
        float num2 = scan.nextFloat();

        float sum =  num1 + num2;

        System.out.println("O resultado da soma é: "+sum);
        scan.close();
    }
}

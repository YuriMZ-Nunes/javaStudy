import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Double num;

        System.out.println("Digite um numero: ");
        num = sc.nextDouble();

        System.out.println("Num digitado: " + num);

        sc.close();
    } 
}

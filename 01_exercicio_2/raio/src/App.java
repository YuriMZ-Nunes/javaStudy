import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double raio, area;

        System.out.println("Digite o raio: ");
        raio = sc.nextDouble();

        area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("A = %.4f", area);
        sc.close();
    }
}

import java.util.Scanner; //importar scan do console para ler dados digitados

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a, b, soma;

        System.out.println("Digite o primeiro numero: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = sc.nextInt();

        soma = a + b;

        System.out.printf("SOMA = %d", soma);

        sc.close();
    }
}

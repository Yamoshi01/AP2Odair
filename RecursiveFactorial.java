import java.util.Scanner;

public class RecursiveFactorial {
    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("Fatorial não é definido para números negativos.");
            return -1; // Indica erro
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int num = scanner.nextInt();

        long resultado = factorial(num);

        if (resultado != -1) {
            System.out.println("Fatorial de " + num + " é: " + resultado);
        }

        scanner.close();
    }
}

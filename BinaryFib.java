import java.util.Scanner;

public class BinaryFib {
    public static int fib(int n) {
        if (n < 0) {
            System.out.println("Fibonacci não é definido para números negativos.");
            return -1; // Indica erro
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o Fibonacci: ");
        int n = scanner.nextInt();

        int resultado = fib(n);

        if (resultado != -1) {
            System.out.println("Fibonacci(" + n + ") = " + resultado);
            System.out.println("Em binário: " + Integer.toBinaryString(resultado));
        }

        scanner.close();
    }
}

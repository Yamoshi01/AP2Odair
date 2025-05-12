import java.util.Scanner;

public class DF1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a posição desejada na sequência de Fibonacci: ");
        int n = scanner.nextInt();

        int resultado = calcularFibonacci(n);
        System.out.println("O número de Fibonacci na posição " + n + " é: " + resultado);

        scanner.close();
    }

    public static int calcularFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int anterior = 0, atual = 1, proximo = 0;
        for (int i = 2; i <= n; i++) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        return atual;
    }
}
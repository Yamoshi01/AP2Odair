import java.util.Scanner;

public class DF2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o tamanho do array: ");
    int tamanho = scanner.nextInt();
    int[] array = new int[tamanho];

    System.out.println("Digite os elementos do array:");
    for (int i = 0; i < tamanho; i++) {
        System.out.print("Elemento " + (i + 1) + ": ");
        array[i] = scanner.nextInt();
    }

    System.out.println("Array original:");
    for (int num : array) {
        System.out.print(num + " ");
    }
    System.out.println();

    // Revertendo o array
    for (int i = 0; i < tamanho / 2; i++) {
        int temp = array[i];
        array[i] = array[tamanho - 1 - i];
        array[tamanho - 1 - i] = temp;
    }

    System.out.println("Array invertido:");
    for (int num : array) {
        System.out.print(num + " ");
    }
    System.out.println();

    scanner.close();
}

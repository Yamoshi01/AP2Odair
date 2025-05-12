import java.util.Arrays;

public class Ap2Odair {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Array original: " + Arrays.toString(array));

        // Inversão do array
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        System.out.println("Array invertido: " + Arrays.toString(array));

        // Soma binária
        System.out.println("Soma dos elementos (BinarySum): " + binarySum(array, 0, array.length - 1));
    }

    public static int binarySum(int[] A, int i, int j) {
        if (i > j) return 0;
        if (i == j) return A[i];
        int m = (i + j) / 2;
        return binarySum(A, i, m) + binarySum(A, m + 1, j);
    }
}

/* Resultado esperado:
   Array original: [1, 2, 3, 4, 5]
   Array invertido: [5, 4, 3, 2, 1]
   Soma dos elementos (BinarySum): 15
 */
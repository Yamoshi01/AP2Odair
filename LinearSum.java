public class LinearSum {

    public static int somar(int[] numeros, int indice) {
        if (indice == numeros.length) {
            return 0;
        }

        return numeros[indice] + somar(numeros, indice + 1);
    }

    public static void main(String[] args) {
        int[] meusNumeros = {4, 7, 1, 3, 9};

        int resultado = somar(meusNumeros, 0);

        System.out.println("A soma dos números é: " + resultado);
    }
}
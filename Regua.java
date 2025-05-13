public class Regua {

    public static void main(String[] args) {
        int polegadas = 2; // Número de polegadas (marcas principais)
        int nivelMaximo = 4; // Nível de profundidade da recursão (subdivisões)

        desenharRegua(polegadas, nivelMaximo);
    }

    public static void desenharRegua(int polegadas, int nivelMaximo) {
        desenharMarca(nivelMaximo, 0); // Primeira marca (posição 0)

        for (int i = 1; i <= polegadas; i++) {
            desenharIntervalo(nivelMaximo); // Subdivisões entre marcas principais
            desenharMarca(nivelMaximo, i);  // Marca principal
        }
    }

    public static void desenharIntervalo(int nivel) {
        if (nivel == 0) return;

        desenharIntervalo(nivel - 1);
        desenharMarca(nivel);
        desenharIntervalo(nivel - 1);
    }
    public static void desenharMarca(int altura) {
        desenharMarca(altura, -1);
    }

    public static void desenharMarca(int altura, int numero) {
        for (int i = 0; i < altura; i++) System.out.print("-");
        System.out.print("|");
        if (numero >= 0) System.out.print(" " + numero);
        System.out.println();
    }
}
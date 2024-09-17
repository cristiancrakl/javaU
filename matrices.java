public class matrices {

    public static void main(String[] args) {

        // declaracion de matrices

        int matriz1[][] = new int[5][2];

        // para imprimir matrices
        for (int fila = 0; fila < matriz1.length; fila++) {// maneja las filas
            for (int columna = 0; columna < matriz1.length; columna++) {// maneja las coumnas
                System.out.print(matriz1[fila][columna] + " ");
            }

            System.out.println(" ");
        }

    }
}

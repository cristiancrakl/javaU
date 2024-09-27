import java.util.Scanner;

public class arrayMultidimencionalYoutube {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        // inicializar el scanner
        Scanner scanner = new Scanner(System.in);

        // declaracion matriz
        int matriz[][] = new int[3][3];

        // cargar datos en la matriz
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.println("ingrese el valor de la posicion fila: " + f + " columna: " + c);
                matriz[f][c] = scanner.nextInt();
            }
        }

        // recorrido
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.println("el valor de la posicion fila: " + f + " columna: " + c);
                System.out.println("es de:" + matriz[f][c]);
                System.out.println("");
            }

            System.out.println("");
        }

    }
}

import java.util.Scanner;

public class ImprimirConfigurarLeerMatrices {

    static int matriz1[][] = null;
    static int matriz2[][] = null;

    static Scanner scanner = new Scanner(System.in);

    public static int[][] definirTamaño(int[][] x) {
        System.out.println("ingrese el tamaño de la matriz Filas&Columnas");
        String datosIngresados = scanner.next();

        String[] datos = datosIngresados.split("&");
        int filas = Integer.parseInt(datos[0]);
        int columnas = Integer.parseInt(datos[1]);

        x = new int[filas][columnas];

        return x;
    }

    public static void ingresarValores(int[][] x) {

        System.out.println("ingresen valores de la matriz");

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = Integer.parseInt(scanner.next());
            }
        }

    }

    public static void ImprimirMatriz(int[][] x) {

        System.out.println("ingresen valores de la matriz");

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]);
                System.out.print(",");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        matriz1 = definirTamaño(matriz1);

        System.out.println("Filas: " + matriz1.length);
        System.out.println("Columnas: " + matriz1[0].length);

        System.out.println();
        ingresarValores(matriz1);
        System.out.println();
        ImprimirMatriz(matriz1);

        matriz2 = definirTamaño(matriz2);
        System.out.println("Filas: " + matriz2.length);
        System.out.println("Columnas: " + matriz2[0].length);

        System.out.println();
        ingresarValores(matriz2);
        System.out.println();
        ImprimirMatriz(matriz2);
    }

}

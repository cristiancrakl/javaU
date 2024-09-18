import java.util.Scanner;

public class arreglos_unidimensionales_vectores1 {

    public static void main(String[] args) {

        // inicializar el scanner
        Scanner scanner = new Scanner(System.in);

        // asignacion para vector
        int vector1[] = new int[5];

        // guardar datos en un vector
        for (int posicion = 0; posicion < vector1.length; posicion++) {
            System.out.println("ingrese el valor en la posicion: " + posicion);
            vector1[posicion] = scanner.nextInt();
        }

        // recorrer el vector para mostrar en pantalla
        for (int posicion = 0; posicion < vector1.length; posicion++) {
            System.out.println("el valor almacenado en la posicion " + posicion + " es: " + vector1[posicion]);

        }

    }

}
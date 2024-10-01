//esto es para manipular arrays
import java.util.Arrays;
//esto es para importar el scanner
import java.util.Scanner;

public class Anagrama_Reordenar {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        // inicializo el scanner para utilizarlo despues
        Scanner scanner = new Scanner(System.in);

        // ingresar las cadenas a ser comparadas
        System.out.println("escriba la palabra numero 1 a ser comparada");
        String palabra1 = scanner.nextLine();

        System.out.println("");

        System.out.println("escriba la palabra numero 2 a ser comparada");
        String palabra2 = scanner.nextLine();

        // comparar cadenas para ver si son strings
        if (sonAnagramas(palabra1, palabra2)) {
            System.out.println(palabra1 + " y " + palabra2 + " son anagramas.");
        } else {
            System.out.println(palabra1 + " y " + palabra2 + " no son anagramas.");
        }
    }

    public static boolean sonAnagramas(String palabra1, String palabra2) {
        // eliminamos espacios en blanco y convertimos a minúsculas
        palabra1 = palabra1.replaceAll("\\s", "").toLowerCase();
        palabra2 = palabra2.replaceAll("\\s", "").toLowerCase();

        // si las longitudes no coinciden, no pueden ser anagramas
        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        // convertimos las cadenas a arreglos de caracteres
        char[] arreglo1 = palabra1.toCharArray();
        char[] arreglo2 = palabra2.toCharArray();

        // Ordenamos los arreglos de caracteres
        Arrays.sort(arreglo1);
        Arrays.sort(arreglo2);

        // Comparamos los arreglos ordenados
        return Arrays.equals(arreglo1, arreglo2);
    }

}

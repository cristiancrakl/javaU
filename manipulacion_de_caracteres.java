import java.util.Scanner;

public class manipulacion_de_caracteres {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        String cadena_original = "", candena_sustraida = "";
        int numero_caracteres = 0, desde = 0, hasta = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("escriba la cadena de caracteres a ser recortada");
        cadena_original = scanner.nextLine();

        numero_caracteres = cadena_original.length();

        System.out.println("la cadena de caracteres " + cadena_original + " tiene " + numero_caracteres + " letras");

        System.out.println("desde que numero de letra desea sustraer");
        desde = scanner.nextInt();
        System.out.println("hasta que numero de letra desea sustraer");
        hasta = scanner.nextInt();

        candena_sustraida = cadena_original.substring(desde, hasta);
        System.out.println("esta es su cadena sustraida " + candena_sustraida);

    }
}
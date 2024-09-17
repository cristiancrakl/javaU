import java.util.Scanner;

public class vectores_ingresando_datos {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int vector1[] = new int[8];

        System.out.println("ingrese los valores que desea guardar");
        vector1[0] = scanner.nextInt();
        vector1[1] = scanner.nextInt();
        vector1[2] = scanner.nextInt();
        vector1[3] = scanner.nextInt();
        vector1[4] = scanner.nextInt();
        vector1[5] = scanner.nextInt();
        vector1[6] = scanner.nextInt();
        vector1[7] = scanner.nextInt();

        int opcion = 0;

        while (opcion != 8) {

            System.out.println(
                    "seleccione qu eespacio del vector desea mostar en pantalla, y si desea terminar el programa escriba 8");

            opcion = scanner.nextInt();
            System.out.println(vector1[opcion]);
        }

    }
}

import java.util.Scanner;

public class vectorPromedio {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        int vector1[] = new int[5];
        double promedio = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Escriba el valor de la posicion " + i);
            vector1[i] = scanner.nextInt();
            promedio += vector1[i];
        }
        promedio /= 5;
        System.out.println("El promedio de los valores ingresados es de: " + promedio);
    }
}
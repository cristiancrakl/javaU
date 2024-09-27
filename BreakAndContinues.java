import java.util.Scanner;

public class BreakAndContinues {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeros[] = new int[2];

        for (int numero = 0; numero < numeros.length; numero++) {

            System.out.println("ingrese el dato de la posicion " + (numero + 1));
            numeros[numero] = scanner.nextInt();

        }

        System.out.println("");

        for (int numero : numeros) {
            if (numero == 8) {
                System.out.println("Número encontrado, saliendo del ciclo");
                break; // Sale del ciclo al encontrar el número 8
            }
            System.out.println(numero);
        }

    }
}

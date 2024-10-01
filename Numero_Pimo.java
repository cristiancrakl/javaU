import java.util.Scanner;

public class Numero_Pimo {
    
    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        // Un número menor que 2 no es primo
        if (numero <= 1) {
            return false;
        }
        
        // Verificamos si el número es divisible por algún número menor que él mismo
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si es divisible, no es primo
            }
        }
        
        // Si no encontramos divisores, el número es primo
        return true;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("ingrese el numero a ser probado");
        int numero = scanner.nextInt(); // esto es para colocar el numero a probar
        
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }
}

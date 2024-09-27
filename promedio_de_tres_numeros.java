import java.util.Scanner;

public class promedio_de_tres_numeros {

    @SuppressWarnings("resource")
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese su primer dato a promediar");
        int num1 = scanner.nextInt();
        System.out.println("ingrese su segundo dato a promediar");
        int num2 = scanner.nextInt();
        System.out.println("ingrese su tercer dato a promediar");
        int num3 = scanner.nextInt();

        float promedio = (num1 + num2 + num3) / 3;

        System.out.println("este es el promedio" + promedio);

    }
}
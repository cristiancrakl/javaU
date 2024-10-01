import java.util.Scanner;

public class Area_De_Un_Poligono {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa para calcular el area de un poligono");
        System.out.println("Seleccione a que poligono le desea saber el area");
        System.out.println("1).Triangulo   2).Cuadrado    3).Rectangulo");

        int opcion_seleccionada = scanner.nextInt();

        switch (opcion_seleccionada) {
            case 1:

                System.out.print("ingrese este dato, Base poligono en cm: ");
                float Base_triangulo = scanner.nextFloat();

                System.out.print("ingrese este dato, Altura poligono en cm: ");
                float Altura_triangulo = scanner.nextFloat();

                float Area_del_Triangulo = (Base_triangulo * Altura_triangulo) / 2;

                System.out.println("Esta es el area del triangulo en cm: " + Area_del_Triangulo);

                break;

            case 2:

                System.out.print("ingrese este dato, lado1 poligono: ");
                float Lado1_cuadrado = scanner.nextFloat();

                System.out.print("ingrese este dato, lado2 poligono: ");
                float Lado2_cuadrado = scanner.nextFloat();

                float Area_del_Cuadrado  = (Lado1_cuadrado * Lado2_cuadrado);

                System.out.println("Esta es el area del cuadrado: " + Area_del_Cuadrado);

                break;

            case 3:
                System.out.print("ingrese este dato, Base poligono en cm: ");
                float Base_rectangulo = scanner.nextFloat();

                System.out.print("ingrese este dato, Altura poligono en cm: ");
                float Altura_rectangulo = scanner.nextFloat();

                float Area_del_rectangulo = (Base_rectangulo * Altura_rectangulo);

                System.out.println("Esta es el area del cuadrado en cm: " + Area_del_rectangulo);

                break;

        }

    }

}

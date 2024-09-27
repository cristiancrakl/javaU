import java.util.Scanner;

public class inicio_de_sesion_con_contrasena {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        System.out.println("algoritmo para iniciar sesion en su cuenta: ");

        Scanner in = new Scanner(System.in);

        System.out.println("escriba el nombre de usuario");
        String nombre1 = in.nextLine();

        if (nombre1.equals("cristiancrakl")) {

            System.out.println("escriba la contraseña");
            String contraseña = in.nextLine();

            if (contraseña.equals("cristian123.C")) {

                System.out.println("bienvenido Sr@ " + nombre1);

            } else {

                System.out.println("contraseña invalida");

            }

        } else {

            System.out.println("usuario invalido");
        }

    }
}

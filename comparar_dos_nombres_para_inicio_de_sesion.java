import java.util.Scanner;




public class comparar_dos_nombres_para_inicio_de_sesion {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        

        System.out.println("algoritmo para comparar nombres: ");

        Scanner in = new Scanner(System.in);

        System.out.println("escriba el primer nombre a ser comparado");
        String nombre1=in.nextLine();
        System.out.println("escriba el segundo nombre a ser comparado");
        String nombre2=in.nextLine();



        if (nombre1.equals(nombre2)) {
            System.out.println("los nombres son iguales");
        } else {
            System.out.println("los nombres no son iguales");
        }





    }
}

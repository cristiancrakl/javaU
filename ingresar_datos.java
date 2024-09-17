import java.util.Scanner;

public class ingresar_datos {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        String nombre="";
        int resultado=0, num1=0, num2=0, num3=0;
    
        
        System.out.println("cual es tu nombre: ");
        nombre=in.nextLine();

        System.out.println("dame el primer valor para tu suma: ");
        num1=in.nextInt();

        System.out.println("dame el segundo valor para tu suma: ");
        num2=in.nextInt();

        System.out.println("dame el tercer valor para tu suma: ");
        num3=in.nextInt();

        resultado=(num1+num2+num3);

        System.out.println("hola"+nombre+"el resultado es de tu suma es "+resultado);


    }
}

import java.util.Scanner;


public class el_numero_mayor_de_dos_numeros {
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        




        System.out.println("algoritmo para imprimir de dos numeros el mayor");



        Scanner in = new Scanner(System.in);
        int num1, num2;


        System.out.println("escriba un numero");
        num1=in.nextInt();
       

        System.out.println("escriba un numero");
        num2=in.nextInt();



        

        if (num1>num2) {
            

           
            System.out.println(num1);
            System.out.println("el numero mayor es: "+ num1);




        }else{

            System.out.println(num2);
            System.out.println("el numero mayor es: "+ num2);
        }



    }
}

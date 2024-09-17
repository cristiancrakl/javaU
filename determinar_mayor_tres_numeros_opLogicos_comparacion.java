import java.util.Scanner;


public class determinar_mayor_tres_numeros_opLogicos_comparacion {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        
        Scanner scanner =new Scanner(System.in);
        
        
        System.out.println("ingrese tres numeros seguidos");
        
        int numero1=scanner.nextInt();
        int numero2=scanner.nextInt();
        int numero3=scanner.nextInt();
        

        if ((numero1>numero2)&&(numero1>numero3)) {
            System.out.println("este es el mayor "+numero1);



            
        }else if ((numero2>numero3)&&(numero2>numero1)) {
            System.out.println("este es el mayor "+numero2);
        
        
        
            
        }else{


            System.out.println("este es el mayor "+numero3);


        }
            
         
    }
}

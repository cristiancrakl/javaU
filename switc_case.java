import java.util.Scanner;





public class switc_case {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        
        
        System.out.println("escriba un numero del uno al tres");
        int num1=1,num2=2,num3=3;
        int opcion;
        opcion= in.nextInt();

        

        
        switch (opcion) {
            
            case 1:
                
            System.out.println(num1);

        
            break;

            case 2:

            System.out.println(num2);

            break;

            case 3:

            System.out.println(num3);


            break;


               
           
        }
    }
}

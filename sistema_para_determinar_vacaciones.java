import java.util.Scanner;

public class sistema_para_determinar_vacaciones {

    @SuppressWarnings("resource")
    public static void main(String args[]){

        

        int clave_dep1_atn_cliente=5237;
        int clave_dep2_logistic=1785;
        int clave_dep3_gerencia=5940;

        int años_emp=0;

        Scanner in = new Scanner(System.in);
        int opcion;
        String nombre="";
        
        
        System.out.println("ingrese su nombre");
        nombre=in.nextLine();

        System.out.println("ingrese la clave de su departamento");
        opcion=in.nextInt();
        
        


        if (opcion==clave_dep1_atn_cliente) {

            
            System.out.println("ingrese los años que tiene en la empresa");
            años_emp=in.nextInt();



            if (años_emp==1 && (años_emp<2)) {
                
                System.out.println("usted "+nombre+" con "+años_emp+" años, recibe vacaciones por 6 dias");

            }else if (años_emp>=2 && (años_emp<=6)) {
                
                System.out.println("usted "+nombre+" con "+años_emp+" años, recibe vacaciones por 14 dias");

            }else {

                System.out.println("usted "+nombre+" con "+años_emp+" años, recibe vacaciones por 20 dias");

            }
                
        
        }else if (opcion==clave_dep2_logistic) {
            
            System.out.println("ingrese los años que tiene en la empresa");
            años_emp=in.nextInt();

            if (años_emp==1 && (años_emp<2)) {
                
                System.out.println("usted "+nombre+" con "+años_emp+" años, recibe vacaciones por 7 dias");

            }else if (años_emp>=2 && (años_emp<=6)) {
                
                System.out.println("usted "+nombre+" con "+años_emp+" años, recibe vacaciones por 15 dias");

            }else {

                System.out.println("usted "+nombre+" con "+años_emp+" años, recibe vacaciones por 22 dias");

            }


        }else if (opcion==clave_dep3_gerencia) {
            
        System.out.println("ingrese los años que tiene en la empresa");
            años_emp=in.nextInt();

            if (años_emp==1 && (años_emp<2)) {
                
                System.out.println("usted "+nombre+" con "+años_emp+" años, recibe vacaciones por 10 dias");

            }else if (años_emp>=2 && (años_emp<=6)) {
                
                System.out.println("usted "+nombre+" con "+años_emp+" años, recibe vacaciones por 20 dias");

            }else {

                System.out.println("usted "+nombre+" con "+años_emp+" años, recibe vacaciones por 30 dias");

            }


        }else{ 
          
            System.out.println("ingrese una clave valida");


        }
        



    }

}

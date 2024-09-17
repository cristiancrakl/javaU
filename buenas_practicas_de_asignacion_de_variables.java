import java.util.Scanner;





public class buenas_practicas_de_asignacion_de_variables {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int contador_estudiantes;
        double promedio_grupo=87.5;
        boolean esta_activo_el_curso=true;
        String nombre_del_curso="introduccion a java";
        
       
       
        System.out.println(" a continuacion escriba el numero de los estudiantes");
        contador_estudiantes=in.nextInt();

        System.out.println("nombre del curso "+nombre_del_curso);
        System.out.println("numero de estudiantes "+contador_estudiantes);
        System.out.println("promedio "+ promedio_grupo);
        System.out.println("el curso esta activo "+esta_activo_el_curso);


        

    }
}

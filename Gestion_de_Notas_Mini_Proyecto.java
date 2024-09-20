import java.util.Scanner;//importamos el scanner

public class Gestion_de_Notas_Mini_Proyecto {

    public static void main(String[] args) {
        @SuppressWarnings("resource")

        Scanner scanner = new Scanner(System.in);//inicializamos el scanner para poder utilizarlo

        System.out.print("Escriba el numero de estudiantes: ");//mostramos en pantalla al usuario para que ingrese el numero de los estudiantes
        int estudiantesNum = scanner.nextInt();//ponemos el escaner para que nos lea el numero de estudiantes

        
        //Declarar los arrays donde se van a almacenar los datos
        String Nombres[] = new String[estudiantesNum];//inicializamos un vector para que tenga guardado el nombre de los estudiantes deacuerdo al numero de estudiantes que haya
        int Identificacion[] = new int[estudiantesNum];//inicializamos un vector para guardar el numero de identificacion de los estudiantes teniendo en cuenta el numero de estudiantes
        float Notas[] = new float[3];//inicializamos un vector para guardar las 3 notas por cada estudiante
        float Promedio[] = new float[estudiantesNum];//inicializamos un vector de tipo duble para guardar el promedio 

        
        for (int posicion = 0; posicion < estudiantesNum; posicion++) {
            
            System.out.println("");
            if (posicion==0) {
                Nombres[0]=scanner.nextLine();
            }

            System.out.println("Escriba el nombre del estudiante numero: " + (posicion+1));
            Nombres[posicion] = scanner.nextLine();
            
        }
        
        
        
        
        for (int posicion = 0; posicion < estudiantesNum; posicion++) {
            
            float notasAcumulacion = 0;
            System.out.println("Escriba la identificacion del estudiante:  " + Nombres[posicion]);

            Identificacion[posicion] = scanner.nextInt();

            for (int j = 0; j < 3; j++) {
             
                System.out.print("Escriba la nota numero " + (j+1)+" del estudiante "+Nombres[posicion]+":");
                Notas[j] = scanner.nextFloat();
                notasAcumulacion += Notas[j];
                }

            Promedio[posicion] = notasAcumulacion / 3;
        }

        for (int posicion = 0; posicion < estudiantesNum; posicion++) {

            if (Promedio[posicion] >= 3) {

                System.out.println("Estudiante: " + Nombres[posicion] + "  (ID: " + Identificacion[posicion] + ")  Promedio: "
                        + Promedio[posicion] + " - Aprobado");

            } else {

                System.out.println("Estudiante: " + Nombres[posicion] + "  (ID: " + Identificacion[posicion] + ")  Promedio: "
                        + Promedio[posicion] + " - Reprovado");
            }
        }
    }
}
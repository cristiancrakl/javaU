import java.util.Scanner;//importamos el scanner

public class Gestion_de_Notas_Mini_Proyecto {

    public static void main(String[] args) {
        @SuppressWarnings("resource")

        Scanner scanner = new Scanner(System.in);// inicializamos el scanner para poder utilizarlo

        final double NotaMaximaIngresar = 5;
        final double NotaMinimaIngresar = 0;
        final int NotaMinimaParaAprobar = 3;

        System.out.print("Escriba el numero de estudiantes: ");// mostramos en pantalla al usuario para que ingrese el
                                                               // numero de los estudiantes
        int estudiantesNum = scanner.nextInt();// ponemos el escaner para que nos lea el numero de estudiantes
        System.out.println("");

        // Declarar los arrays donde se van a almacenar los datos
        String Nombres[] = new String[estudiantesNum];// inicializamos un vector para que tenga guardado el nombre de
                                                      // los estudiantes deacuerdo al numero de estudiantes que haya
        int Identificacion[] = new int[estudiantesNum];// inicializamos un vector para guardar el numero de
                                                       // identificacion de los estudiantes teniendo en cuenta el numero
                                                       // de estudiantes
        float Notas[] = new float[3];// inicializamos un vector para guardar las 3 notas por cada estudiante
        float Promedio[] = new float[estudiantesNum];// inicializamos un vector de tipo duble para guardar el promedio
        System.out.println("");

        for (int posicion = 0; posicion < estudiantesNum; posicion++) {// ciclo for para ingresar los datos en el array
                                                                       // de nombre

            if (posicion == 0) {// esto es para solucionar un problema que tenia porque no
                Nombres[0] = scanner.nextLine();
            }

            System.out.println("Escriba el nombre del estudiante numero: " + (posicion + 1)); // ese +1 se lo añadi para
                                                                                              // mejorar la estetica a
                                                                                              // la hora de ingresar los
                                                                                              // datos
            Nombres[posicion] = scanner.nextLine();

            System.out.println("");
        }

        for (int posicion = 0; posicion < estudiantesNum; posicion++) { // ciclo for para ingresar los datos en el
                                                                        // vector de indetificacion de estidiantes

            System.out.println("Escriba la identificacion del estudiante:  " + Nombres[posicion]);
            Identificacion[posicion] = scanner.nextInt();
            System.out.println("");

        }

        for (int posicion = 0; posicion < estudiantesNum; posicion++) { // ciclo for para ingrasr los datos de las notas

            float notasAcumulacion = 0;

            for (int j = 0; j < 3; j++) {

                do {
                    System.out.print("Escriba la nota numero " + (j + 1) + " del estudiante " + Nombres[posicion] + ":");

                    Notas[j] = scanner.nextFloat();

                } while (Notas[j] > NotaMaximaIngresar || Notas[j] < NotaMinimaIngresar);

                notasAcumulacion += Notas[j];// notas por fuera para que no alla error de acumulacion

            }

            Promedio[posicion] = notasAcumulacion / 3; // para sacar el promedio
            System.out.println(""); // meramente estetica

        }

        for (int posicion = 0; posicion < estudiantesNum; posicion++) { // para hacer la comprobacion final si el
                                                                        // estudiante aprovo o no

            System.out.println("");
            if (Promedio[posicion] >= NotaMinimaParaAprobar) {

                System.out.println("Estudiante: " + Nombres[posicion] + "  (ID: " + Identificacion[posicion]
                        + ")  Promedio: " + Promedio[posicion] + " - Aprobado");

            } else {

                System.out.println("Estudiante: " + Nombres[posicion] + "  (ID: " + Identificacion[posicion]
                        + ")  Promedio: " + Promedio[posicion] + " - Reprovado");
            }
        }
    }
}// finish

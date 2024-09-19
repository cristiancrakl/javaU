import java.util.Scanner;

public class Gestion_de_Notas_Mini_Proyecto {
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el numero de estudiantes");
        int estudiantesNum = scanner.nextInt();

        String names[] = new String[estudiantesNum];
        int Identificacion[] = new int[estudiantesNum];
        double Notas[] = new double[3];
        double Promedio[] = new double[estudiantesNum];

        for (int i = 0; i < estudiantesNum; i++) {
            double notaAcumulacion = 0;

            System.out.println("Escriba el nombre del estudiante numero: " + i);

            names[i] = scanner.nextLine();
            System.out.println(names[i]);

            System.out.println("Escriba la identificacion del estudiante numero: " + i);

            Identificacion[i] = scanner.nextInt();

            for (int j = 0; j < 3; j++) {

                System.out.println("Escriba la nota numero: " + j + "  del estudiante " + i);
                Notas[j] = scanner.nextInt();
                notaAcumulacion += Notas[j];

            }

            Promedio[i] = notaAcumulacion / 3;
        }

        for (int i = 0; i < estudiantesNum; i++) {

            if (Promedio[i] > 3.0) {

                System.out.println("Estudiante: " + names[i] + "  (ID: " + Identificacion[i] + ")  Promedio: "
                        + Promedio[i] + " - Aprobado");

            } else {

                System.out.println("Estudiante: " + names[i] + "  (ID: " + Identificacion[i] + ")  Promedio: " + Promedio[i] + " - Reprovado");
            }
        }
    }
}

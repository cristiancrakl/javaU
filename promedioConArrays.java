import java.util.Scanner;

public class promedioConArrays {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        int Promedio=0;
        int SumaDeLosNumeros=0;
        float Guardado_de_numeros[] = new float[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese 5 numeros para calcular su promedio");
        Guardado_de_numeros[0]=scanner.nextFloat();
        Guardado_de_numeros[1]=scanner.nextFloat();
        Guardado_de_numeros[2]=scanner.nextFloat();
        Guardado_de_numeros[3]=scanner.nextFloat();
        Guardado_de_numeros[4]=scanner.nextFloat();


      




       
        Promedio=(SumaDeLosNumeros/5);

        System.out.println("su promedio es: "+Promedio);

    }
}
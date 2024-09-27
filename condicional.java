import java.util.Scanner;

public class condicional {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("escriba su nota de matematicas");
        int mat = in.nextInt();
        System.out.println("escriba su nota de biologia");
        int bgia = in.nextInt();
        System.out.println("escriba su nota de quimica");
        int quim = in.nextInt();

        float prom = (mat + bgia + quim) / 3;

        String aprobo = "el alumno aprobo";
        String no_aprobo = "el alumno no aprobo";

        if (prom >= 6) {
            System.out.println(aprobo + " con nota de " + prom);

        } else {
            System.out.println(no_aprobo + " con nota de " + prom);

        }

    }
}

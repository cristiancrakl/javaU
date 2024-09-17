public class arreglos_unidimensionales_vectores1 {

    public static void main(String[] args) {

        // asignacion para vector
        int vector1[] = new int[5];

        // guardar elementos en vector
        vector1[0] = 5000;
        vector1[1] = 1550;
        vector1[2] = 1590;
        vector1[3] = 1300;
        vector1[4] = 1600;

        System.out.println(vector1[1]);
        System.out.println(vector1[4]);

        vector1[1] = 5600;
        System.out.println(vector1[1]);

    }

}
public class operadores_logicos_yyoo {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 20;

        System.out.println(a > b && b < c);// true
        System.out.println(a < b || b > c);// t
        System.out.println(!(b < c) == !(b > c));// true

    }

}
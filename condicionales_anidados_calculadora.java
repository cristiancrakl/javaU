public class condicionales_anidados_calculadora {

    public static void main(String args[]) {

        String opc_invalida = ("su opcion no existe");
        String Tittle = ("calculadora hecha con condicionales anidados");
        System.out.println(Tittle);

        int ope = 1;
        int num1 = 8;
        int num2 = 4;
        int resultado;

        if (ope == 1) {
            resultado = num1 + num2;
            System.out.println("El resultado de la suma es: " + resultado);

        } else if (ope == 2) {
            resultado = num1 - num2;
            System.out.println("El resultado de la resta es: " + resultado);

        } else if (ope == 3) {
            resultado = num1 * num2;
            System.out.println("El resultado de la multiplicacion es: " + resultado);

        } else if (ope == 4) {
            resultado = num1 / num2;
            System.out.println("El resultado de la division es: " + resultado);
        } else {
            System.out.println(opc_invalida);
        }

    }
}

public class tienda_descuento {
    public static void main(String[] args) {

        // inicializacion de constantes
        final double precioCamisa = 25.0;
        final double precioPantalon = 30.0;
        final double descuento15 = 0.15;
        final double descuento5 = 0.05;


        double precioCamisaDescontada = precioCamisa * (1 - descuento15);
        double precioPantalonDescontado = precioPantalon * (1 - descuento15);

        System.out.println("Precio de la camiseta después del descuento del 15%: " + precioCamisaDescontada);
        System.out.println("Precio del pantalón después del descuento del 15%: " + precioPantalonDescontado);

        
        double precioSegundaCamisaDescontada = precioCamisaDescontada * (1 - descuento5);

        System.out.println("Precio de la segunda camiseta después del descuento adicional del 5%: "
                + precioSegundaCamisaDescontada);

        double precioTotal = precioCamisaDescontada + precioPantalonDescontado + precioSegundaCamisaDescontada;

        System.out.println("Precio total después de aplicar todos los descuentos: " + precioTotal);
    }
}

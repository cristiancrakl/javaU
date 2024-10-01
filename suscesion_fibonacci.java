public class suscesion_fibonacci {

	public static void main(String[] args) {

		// numero hasta el que va a llegar la suscecion
		int numeroMaximoSusecion = 50;

		long numeroAnterior = 0;
		long numeroSiguiente = 1;

		System.out.print("susecion de fibonacci para el numero: " + numeroMaximoSusecion);

		for (int i = 1; i <= numeroMaximoSusecion; ++i) {
			System.out.print(numeroAnterior + " ");

			long Suma = numeroAnterior + numeroSiguiente;
			numeroAnterior = numeroSiguiente;
			numeroSiguiente = Suma;

		}

	}
}

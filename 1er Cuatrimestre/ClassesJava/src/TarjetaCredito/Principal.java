package TarjetaCredito;

public class Principal {

	public static void main(String[] args) {

		Persona persona1 = new Persona("carlos", "nose", "calle 3443");
		Persona persona2 = new Persona("diego", "diaz", "calle 444");

		System.out.println(persona1.toString());
		System.out.println(persona2.toString());

		Tarjeta t1 = new Tarjeta("*nroTarjeta*", "Deigo Diez", 5000);
		t1.realizarCompra(3500);
		t1.actualizarLimite(3000);
		System.out.println(t1.toString());
	}

}




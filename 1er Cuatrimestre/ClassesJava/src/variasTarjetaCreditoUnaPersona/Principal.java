package variasTarjetaCreditoUnaPersona;

public class Principal {

	public static void main(String[] args) {


		Persona persona1 = new Persona ("Carlos");
		TarjetaCredito tarjeta1 = new TarjetaCredito ("00xx4567",5000);
		TarjetaCredito tarjeta2 = new TarjetaCredito ("00xx9999",2000);
		
		//asignación mutua
		persona1.addTarjeta(tarjeta1);
		persona1.addTarjeta(tarjeta2);
		tarjeta1.addDuenio(persona1);
		tarjeta2.addDuenio(persona1);
		//muestro tarjetas de persona1
		persona1.mostrarTarjetas();
		
		verDatos(tarjeta1);
		verDatos(tarjeta2);
		
		persona1.comprar(tarjeta1, "empanadas", 500);
		persona1.comprar(tarjeta1, "cafe", 200);
		persona1.comprar(tarjeta2, "helado", 500);
		
		verDatos(tarjeta1);
		verDatos(tarjeta2);
		
		tarjeta1.mostrarListaGastos();
		
		tarjeta1.cambiarLimiteDeCompra(10);
		verDatos(tarjeta1);
		
		
		
	}
	
	//función rápida
	public static void verDatos(TarjetaCredito tarjeta) {
		System.out.println(tarjeta.mostrarDatos());
	}

}

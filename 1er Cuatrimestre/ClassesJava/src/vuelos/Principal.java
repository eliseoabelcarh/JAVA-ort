package vuelos;

public class Principal {

	public static void main(String[] args) {
		
		// constructor Vuelo ( String origen,String destino, String fecha,int numero,
		// int capacidadTotal)

		Vuelo vuelo1 = new Vuelo("Aeroparque", "Miami", "01/06/2018", 1234, 250);
		
		//set asientos ocupados
		int ocupadoSet=15;
		System.out.println("Seteo asientos ocupados: " + ocupadoSet );
		vuelo1.setAsientosOcupados(ocupadoSet);
		
		//Datos de vuelo 
		System.out.println(vuelo1.toString());
		
		System.out.println("cantidad de asientos disponibles: " + vuelo1.getDisponibles());
		System.out.println("cantidad de asientos ocupados : " + vuelo1.getAsientosOcupados());
		

		int nroReservado = 100;
		System.out.println("se está reservando " + nroReservado + " : " + vuelo1.reservar(nroReservado));
		System.out.println("cantidad de asientos disponibles: " + vuelo1.getDisponibles());
		System.out.println("cantidad de asientos ocupados : " + vuelo1.getAsientosOcupados());

		int nroLiberar = 50;
		System.out.println("Se está liberando " + nroLiberar + " " + vuelo1.liberarAsientos(nroLiberar));
		System.out.println("cantidad de asientos disponibles: " + vuelo1.getDisponibles());
		System.out.println("cantidad de asientos ocupados : " + vuelo1.getAsientosOcupados());
		
		int nroReservado1 = 10;
		System.out.println("se está reservando " + nroReservado1 + " : " + vuelo1.reservar(nroReservado1));
		System.out.println("cantidad de asientos disponibles: " + vuelo1.getDisponibles());
		System.out.println("cantidad de asientos ocupados : " + vuelo1.getAsientosOcupados());

		int nroLiberar1 = 150;
		System.out.println("Se está liberando " + nroLiberar1 + " " + vuelo1.liberarAsientos(nroLiberar1));
		System.out.println("cantidad de asientos disponibles: " + vuelo1.getDisponibles());
		System.out.println("cantidad de asientos ocupados : " + vuelo1.getAsientosOcupados());
		

	}

}

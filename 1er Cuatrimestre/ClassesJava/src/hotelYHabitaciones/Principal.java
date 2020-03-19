package hotelYHabitaciones;

public class Principal {

	public static void main(String[] args) {


		Hotel hotel = new Hotel ("hotel las americas");
		System.out.println(hotel.getNombre());
		System.out.println("");
		
		hotel.addHabitaciones(15);
		//hotel.mostrarListaDeHabitaciones();
		System.out.println("disponibles " + hotel.getCantidadHabitacionesDisponibles());
		System.out.println("reservadas " + hotel.getCantidadHabitacionesReservadas());
		System.out.println("");
		
		hotel.reservarHabitacion(12);
		hotel.mostrarListaDeHabitaciones();
		System.out.println("disponibles " + hotel.getCantidadHabitacionesDisponibles());
		System.out.println("reservadas " + hotel.getCantidadHabitacionesReservadas());
		System.out.println("");
		
		
		/*
		hotel.liberarHabitacion(2);
		hotel.mostrarListaDeHabitaciones();
		System.out.println("disponibles " + hotel.getCantidadHabitacionesDisponibles());
		System.out.println("reservadas " + hotel.getCantidadHabitacionesReservadas());
		System.out.println("");
		*/
		
		hotel.asignarTipoDeHabitacio(2, "Suite");
		
		hotel.reservarVarias(4);
		hotel.mostrarListaDeHabitaciones();
		System.out.println("disponibles " + hotel.getCantidadHabitacionesDisponibles());
		System.out.println("reservadas " + hotel.getCantidadHabitacionesReservadas());
		System.out.println("");
		
		hotel.liberarVarias(5);
		hotel.mostrarListaDeHabitaciones();
		System.out.println("disponibles " + hotel.getCantidadHabitacionesDisponibles());
		System.out.println("reservadas " + hotel.getCantidadHabitacionesReservadas());
		System.out.println("");
	}

}

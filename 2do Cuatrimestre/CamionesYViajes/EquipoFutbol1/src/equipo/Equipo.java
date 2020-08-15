package equipo;
import java.util.Arrays;

import jugador.Jugador;

public class Equipo {
	
	private String nombre;
	private Jugador[] jugadores;
	private final int CANTIDAD_MAXIMA_JUGADORES = 11;
	
	
	public Equipo(String nombre){
		this.nombre = nombre;
		this.jugadores = new Jugador[CANTIDAD_MAXIMA_JUGADORES];
	}
	
	
	public String getNombre(){
		
		return this.nombre;
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	public Jugador[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return "Equipo [jugadores=" + Arrays.toString(jugadores) + "]";
	}
	
	
	
	//AGREGAR JUGADOR
	public void agregarJugador(int i, String nombre, String dni, int edad) {
		Jugador jugador = new Jugador(nombre, dni, edad);
		this.jugadores[i] = jugador;
	}
	
	//OBTENER JUGADORES CON CIERTA EDAD - DEVUELVE VECTOR
	public Jugador[] obtenerJugadoresCiertaEdad(int edadBuscada) {
		Jugador[] jugadoresCiertaEdad = new Jugador[CANTIDAD_MAXIMA_JUGADORES] ;
		
		int i = 0;
		
		for(Jugador jugador: this.jugadores ) {
			if(jugador.getEdad() == edadBuscada) {
				jugadoresCiertaEdad[i] = jugador;
			}
			i++;
			
		}
		
		return jugadoresCiertaEdad;
	}
	
	//MUESTRA POR CONSOLA NOMBRE DE JUGADORES CON LA EDAD BUSCADA
	public void mostrarEdad(int edadBuscada) {
		
		
		int i = 0;
		
		while(i < this.jugadores.length) {
			if(jugadores[i] != null && jugadores[i].getEdad() == edadBuscada ) {
				jugadores[i].mostrarDatos();;
			}
			i++;
		}
		
	}
	
	//CUENTA CANTIDAD DE JUGADORES QUE EL DIGITO PROPOCIONADO ES IGUAL AL ULTIMO DIGITO DE SU EDAD 
	public int contarDigito(int ultimoDigito) {
		int resultado = 0;
		
		
		for(int i = 0; i < this.jugadores.length; i++) {
					
				if(this.jugadores[i] != null && (this.jugadores[i].getEdad())%10 == ultimoDigito) {
					resultado++;
				}	
				
		}
		
		return resultado;
	}
	
	
	//DEVUELVE ARRAY CON CANTIDAD DE VOCALES EN CADA POSICION
	public int[] darMisVocales (int posicion) {
		int[] array = new int[5];
		//array = this.jugadores[posicion].darMisVocales();//tmb válido
		array = this.jugadores[posicion].darMisVocales1();
		
	
		return array;
	}

	//muestre para cada jugador la cantidad de vocales en su nombre
	
	public void vocalesDelEquipo () {
		
		for(int i = 0; i < CANTIDAD_MAXIMA_JUGADORES; i++) {
			
			if(this.jugadores[i] != null) {
				
			
				Jugador jugador = this.jugadores[i];
				
					int[] array = jugador.darMisVocales();
					int suma = 0;
					
					for(int j = 0; j < array.length ; j++) {
						suma+=array[j];
					}
				
				
				System.out.println(jugador.getNombre() + ": " + suma  );
			
			}
			
		}
		
	}
	
	

}

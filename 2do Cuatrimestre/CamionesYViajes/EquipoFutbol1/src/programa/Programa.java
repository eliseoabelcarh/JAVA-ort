package programa;
import java.util.Arrays;

import equipo.Equipo;


public class Programa {

	
	public static void main(String[] args) {
		
		
		Equipo equipo = new Equipo("equipo1");
		
		equipo.agregarJugador(0, "a0", "xx0", 20);
		equipo.agregarJugador(1, "aeu1", "xx1", 25);
		equipo.agregarJugador(2, "aaaeeiioouuuu2", "xx2", 25);
		equipo.agregarJugador(3, "a3", "xx3", 27);
		equipo.agregarJugador(4, "a4", "xx5", 28);
		equipo.agregarJugador(5, "ai5", "xx5", 25);
		
		
		
		//OJO IMPORTANTE! ++ método length es determinista, verificar nulls
		
		
		//mostrarEdad que dada una edad, muestre por pantalla los jugadores que tienen esa edad.
		//equipo.mostrarEdad(25);
		
		
		//contarDigito que dado un número de un dígito devuelva la cantidad de jugadores
		//cuya edad termina en ese número.
		//System.out.println(equipo.contarDigito(5));
		
		
		//darMisVocales que devuelva un array de 5 elementos enteros que contenga la
		//cantidad de cada una de las vocales que tiene el nombre del jugador.
		//int[] array = equipo.darMisVocales(2);//de jugador posicion2
		// System.out.println(Arrays.toString(array));
		// System.out.println(array.length);
		
		
		//vocalesDelEquipo que muestre para cada jugador la cantidad de vocales en su nombre
		equipo.vocalesDelEquipo();
		
	}

	
	
}

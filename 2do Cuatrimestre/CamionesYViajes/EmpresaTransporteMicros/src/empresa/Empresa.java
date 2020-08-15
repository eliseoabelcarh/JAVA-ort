package empresa;

import java.lang.reflect.Array;
import java.util.ArrayList;

import chofer.Chofer;
import destino.Destino;
import micro.Micro;
import viaje.Viaje;


public class Empresa {
	
	public final int CANTIDAD_MICROS = 30;
	public final int CANTIDAD_CHOFERES = 50;
	public final int CANTIDAD_DESTINOS = 5;
	
	private Micro[] micros;
	private Chofer[] choferes;
	private ArrayList<Viaje> viajes;
	private Destino[] destinos;
	
	public Empresa(){
		this.micros = new Micro[CANTIDAD_MICROS];
		this.choferes = new Chofer[CANTIDAD_CHOFERES];
		this.viajes = new ArrayList<Viaje>();
		this.destinos = new Destino[CANTIDAD_DESTINOS];
	}
	/**
	 * 
	 * @return vector de tipo int con la cantidad que realizó cada chofer
	 */
	private int[] cantidadViajesXCadaChofer() {
		int[] vector = new int[CANTIDAD_CHOFERES];
		for (int i = 0; i < this.viajes.size(); i++) {
			int indexChofer = this.viajes.get(i).getNroLegajo() - 1;
			vector[indexChofer]++;
		}
		return vector;
	}
	
	private ArrayList<Chofer> choferesConMasViajes(){
		ArrayList<Chofer> vector = new ArrayList<Chofer>();
		int max = -1;
		int[] cantViajesXCadaChofer = cantidadViajesXCadaChofer();
		for (int i = 0; i < cantViajesXCadaChofer.length; i++) {
			if(cantViajesXCadaChofer[i] >= max) {
				max= cantViajesXCadaChofer[i];
				Chofer chofer = devolverChofer(i);
				if(chofer != null) {
					vector.add(chofer);
				}
			}
		}
		return vector;
	}

	private Chofer devolverChofer(int indexChofer) {
		Chofer chofer = this.choferes[indexChofer];
		return chofer;
	}
	public String obtenerChoferMax () {
		String nombreDeChoferesMax = "";
		ArrayList<Chofer> choferesMax = choferesConMasViajes();
		if(choferesMax.size()>0) {
			for (int i = 0; i < choferesMax.size(); i++) {
				nombreDeChoferesMax += choferesMax.get(i).getNombre() + ", ";
			}
		}
		return nombreDeChoferesMax;
	}

	public void informarMicrosXDestinos() {
		int[][] matriz = microsXDestinos();
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Para micro nroLegajo " + (i+1));
			for (int x = 0; x < matriz[i].length; x++) {
				int cant = matriz[i][x];
				String nombreDestino = devolverNombreDestino(x);
				System.out.println("viajó " + cant + " veces a " + nombreDestino );
			}
		}
	}
	
	private String devolverNombreDestino(int indexDestino) {
		String nombre = "";
		Destino destino = this.destinos[indexDestino];
		if(destino != null) {
			nombre = destino.getNombre();
		}
		return nombre;
	}

	private int[][] microsXDestinos(){
		int[][] matriz = new int[CANTIDAD_DESTINOS][CANTIDAD_MICROS];
		for (int i = 0; i < this.viajes.size(); i++) {
			Viaje viaje = this.viajes.get(i);
			String nombreDestino = viaje.getNombreDestino();
			int indexDestino = devolverIndexDestino(nombreDestino);
			int nroInterno = viaje.getNroInterno();
			int indexMicro = nroInterno-1;
			matriz[indexDestino][indexMicro]++;
		}
		return matriz;
	}

	/**
	 * devuelve posición del destino pasándole el nombre del destino
	 * @param nombreDestino 
	 * @return nro posición del destino encontrado
	 */
	private int devolverIndexDestino(String nombreDestino) {
		int indexDestino = -1;
		int i =0;
		boolean encontrado = false;
		while(!encontrado && i < this.destinos.length) {
			if(this.destinos[i] != null && (this.destinos[i].getNombre().equals(nombreDestino))) {
				encontrado = true;
				indexDestino = i;
			}
		}
		return indexDestino;
	}
	
	
	public void informarMantenimiento(int anioActual) {
		ArrayList<Micro> microsParaMantenimiento = microsNecesitanMantenimiento(anioActual);
		System.out.println("Micros que necesitan mantenimiento: ");
		for (int i = 0; i < microsParaMantenimiento.size(); i++) {
			Micro micro = microsParaMantenimiento.get(i);
			System.out.println("Micro Patente: "+ micro.getPatente());
		}
	} 
	
	private ArrayList<Micro> microsNecesitanMantenimiento(int anioActual){
		ArrayList<Micro> array = new ArrayList<Micro>();
		for (int i = 0; i < this.micros.length; i++) {
			if(this.micros[i] != null) {
				if(this.micros[i].necesitaMantenimiento(anioActual)) {
					array.add(this.micros[i]);
				}
			}
		}
		return array;
	}
	private int[] cantidadDeViajesPorDestino() {
		int[] vector = new int[CANTIDAD_DESTINOS];
		for (int i = 0; i < this.viajes.size(); i++) {
			Viaje viaje = this.viajes.get(i);
			String nombreDestino = viaje.getNombreDestino();
			int indexDestino = devolverIndexDestino(nombreDestino);
			vector[indexDestino]++;
		}
		return vector;
	}
	private ArrayList<Destino> destinosMasVisitados(){
		ArrayList<Destino> destinosMasVisitados = new ArrayList<Destino>();
		int[] cantidadViajesXDestino = cantidadDeViajesPorDestino();
		int maxCant = -1;
		for (int i = 0; i < cantidadViajesXDestino.length; i++) {
			if(cantidadViajesXDestino[i] >= maxCant) {
				maxCant = cantidadViajesXDestino[i];
				Destino destino = this.destinos[i];
				if(destino != null) {
					destinosMasVisitados.add(destino);
				}	
			}
		}
		return destinosMasVisitados;
	}
	public void informarDestinoMasVisitado() {
		ArrayList<Destino> destinosMasVisitados = destinosMasVisitados();
		System.out.println("Destino(s) más visitado(s): ");
		for (int i = 0; i < destinosMasVisitados.size(); i++) {
			System.out.println(destinosMasVisitados.get(i).getNombre());
		}
	}
	
	
	
	
	
}

package estacionDeBicis;

import java.util.ArrayList;

import bici.Bici;

public class EstacionDeBicis {


	private static final int CANT_ANCLAJES = 10;
	//TODO COMPLETAR Atributos
	
	private final int id;
	private String ubicacion;
	private Bici[] anclajes;
	
	public EstacionDeBicis(int id, String ubicacion) {
		this.id = id;
		this.ubicacion = ubicacion;
		this.anclajes = new Bici[CANT_ANCLAJES];
	}

	
	

	/***
	 * intenta anclar una bici en el primer anclaje disponible en la estacion.
	 * 
	 * @param bici bici a anclar.
	 * @return si se pudo anclar o no.
	 */
	public boolean anclar(Bici bici) {
		boolean anclajeExitoso = false;
		int indexAnclajeLibre = obtenerAnclajeLibre();
		if(indexAnclajeLibre != -1) {
			this.anclajes[indexAnclajeLibre]= bici;
			anclajeExitoso=true;
			bici.registrarMovimiento(getId(), (indexAnclajeLibre+1));
			System.out.println("bici nro #"+ bici.getId() + " anclada con éxito en estación "+ getId() + " (" + getUbicacion() + ")");
		}
		return anclajeExitoso;
	}
	
	
	

	/**
	 * intenta estacionar la bici en el anclaje indicado.
	 * 
	 * @param bici    bici a anclar.
	 * @param anclaje anclaje donde se quiere dejar la bici.
	 * @return si se pudo anclar o no.
	 */
	public boolean anclar(Bici bici, int anclaje) {
		boolean anclajeExitoso = false;
		int indexAnclaje = anclaje-1;
		if(this.anclajes[indexAnclaje] == null) {
			this.anclajes[indexAnclaje]= bici;
			anclajeExitoso = true;
			bici.registrarMovimiento(getId(), (indexAnclaje+1));
		}
		return anclajeExitoso;
	}
	
	
	
	public int getId() {
		return this.id;
	}
	
	
	public String getUbicacion() {
		return this.ubicacion;
	}
	
	
	/**
	 * devuelve una lista con las bicicletas averiadas
	 */
	public ArrayList<Bici> listaBicisAveriadas() {
		ArrayList<Bici> bicisAveriadas = new ArrayList<Bici>();
		for (int i = 0; i < this.anclajes.length; i++) {
			if(this.anclajes[i] != null && this.anclajes[i].estaAveriada()) {
				bicisAveriadas.add(this.anclajes[i]);
			}
		}
		return bicisAveriadas;
	}
	
	
	

	/**
	 * muestra por pantalla el nro de los anclajes disponibles
	 */
	public void mostrarAnclajesLibres() {
		System.out.println("Anclajes libres en la Estacion #" + getId());
		String anclajes = "";
		for (int i = 0; i < this.anclajes.length; i++) {
			if(this.anclajes[i] == null) {
				anclajes += ((i+1) + ", " );
			}
		}
		System.out.println(anclajes);
	}
	
	public int devolverCantidadAnclajesLibres() {
		int cantidadAnclajesLibres = 0;
		for (int i = 0; i < this.anclajes.length; i++) {
			if(this.anclajes[i] == null) {
				cantidadAnclajesLibres++;
			}
		}
		return cantidadAnclajesLibres;
	}
	
	
	

	/**
	 * muestra por pantalla el nro de los anclajes ocupados con bicis sin averias.
	 */
	public void mostrarBicisDisponibles() {
		for (int i = 0; i < this.anclajes.length; i++) {
			if(this.anclajes[i] != null && !this.anclajes[i].estaAveriada()) {
				System.out.println("Bicis disponibles en la Estacion #" + getId() + "(" + getUbicacion() + ") :");
				System.out.println("Anclaje " + (i+1) + " - bici " + this.anclajes[i].getId() + " está libre y sin averías");
			}
		}
	}
	
	
	
	public int obtenerAnclajeLibre(){
		int indexAnclajeLibre = -1;
		int i = 0;
		boolean encontrado = false;
		while(!encontrado && i < this.anclajes.length) {
			if(this.anclajes[i] == null){
				encontrado = true;
				indexAnclajeLibre = i;
			}
			i++;
		}
		return indexAnclajeLibre;
	}
	
	

	/**
	 * devuelve la primera bici que encuentra disponible, quitandola del stock de la
	 * estacion.
	 */
	public Bici retirarBici() {
		Bici biciARetirar =  null;
		int indexBiciSinAveria = devuelveIndexPrimeraBiciSinAveria();
		if(indexBiciSinAveria != -1) {
			biciARetirar = this.anclajes[indexBiciSinAveria];
			this.anclajes[indexBiciSinAveria] = null;
			biciARetirar.registrarMovimiento(getId(), (indexBiciSinAveria+1) );
			System.out.println("Retirando bici nro #" + biciARetirar.getId());
		}
		return biciARetirar;
	}

	public int devuelveIndexPrimeraBiciSinAveria() {
		int indexBiciSinAveria = -1;
		int i= 0;
		boolean encontrado = false;
		while(!encontrado && i < this.anclajes.length) {
			if(this.anclajes[i] != null) {
				if(!this.anclajes[i].estaAveriada()) {
					indexBiciSinAveria = i;
					encontrado = true;
				}
			}
			i++;
		}
		return indexBiciSinAveria;
	}




	
	
}

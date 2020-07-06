package estacionamiento;

public class Estacionamiento {
	
	private static final String ERROR = "no se peude ocupar ese espacio";
	private static final String EXITO = " espacio se marcó ocupado";
	
	private boolean[][] espacios;
	
	public Estacionamiento(int pasillos, int posiciones) {
		this.espacios = new boolean[pasillos][posiciones];
		inicializarEstacionamiento();
	}
//Este método se encargará de poner todas las posiciones del estacionamiento libres (es decir, en “false”)
	private void inicializarEstacionamiento() {
		for (int i = 0; i < this.espacios.length; i++) {
			for (int x = 0; x < this.espacios[i].length; x++) {
				this.espacios[i][x]= false;
			}
		}

	}
//Dado un pasillo y una posición, me indica si está ocupado
	public boolean estaOcupado(int pasillo, int posicion) {
		return this.espacios[pasillo][posicion];
	}
//devuelve cuantos trues hay en vector
	private int cantidadTruesEnVector(boolean[] vector) {
		int cantidad= 0;
		for(int i= 0; i< vector.length; i++) {
			if(vector[i]==false) {
				cantidad++;
			}
		}
		return cantidad;
	}
//Me devuelve la cantidad total de espacios disponibles en el estacionamiento
	public int cantidadDisponible() {
		int cantidadFalses =0;
		for(int i=0; i< this.espacios.length; i++) {
			int cantidadFalsesEnFila= cantidadTruesEnVector(this.espacios[i]);
			cantidadFalses+=cantidadFalsesEnFila;
		}
		return cantidadFalses;
	}
//Si el espacio está libre, lo marca como ocupado y avisa
//por consola. Si no está libre, un mensaje por consola 
//debe avisar que no se puede ocupar ese espacio.
	public void ocuparEspacio(int pasillo, int posicion) {
		boolean estado= this.espacios[pasillo][posicion];
		if(!estado) {
			this.espacios[pasillo][posicion]= true;
			System.out.println(EXITO);
		}
		else {
			System.out.println(ERROR);
		}
	}
	
	
	
	
	
}

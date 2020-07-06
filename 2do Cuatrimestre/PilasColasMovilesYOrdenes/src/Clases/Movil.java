package Clases;

import java.util.LinkedList;
import java.util.Queue;

public class Movil {

	private int nroMovil;
	private String zona;
	private int cantMaxAsignada;
	private Queue<Orden> ordenesAsignadas;
	
	public Movil(int nroMovil, String zona, int cantMaxAsignada, Queue<Orden> ordenesAsignadas) {
		
		this.nroMovil = nroMovil;
		this.zona = zona;
		this.cantMaxAsignada = cantMaxAsignada;
		this.ordenesAsignadas = ordenesAsignadas;
	}

	public int getCantOrdenesActual() {
		Orden centinela =  new Orden("***", null);
		Orden orden;
		int contador= 0;
		ordenesAsignadas.add(centinela);
		orden = ordenesAsignadas.remove();
		while(orden != centinela) {
			contador++;
			ordenesAsignadas.add(orden);
			orden= ordenesAsignadas.remove();
		}
		
		return contador;
	}

	public String getZona() {
		return this.zona;
	}

	public int getNro() {
		return this.nroMovil;
	}

	public boolean puedoRecibirXOrdenes(int cantOrdenesARecibir) {
		int cantActualDeOrdenes;
		boolean resultado =  false;
		cantActualDeOrdenes = getCantOrdenesActual();
		if(cantActualDeOrdenes+cantOrdenesARecibir <= this.cantMaxAsignada) {
			resultado = true;
		}
		return resultado;
	}

	public boolean pertenezcoAZona(String zona) {
		return getZona().equals(zona);
	}

	public Queue<Orden> entregarColaDeOrdenes() {
		Orden orden;
		Queue<Orden> colaNueva = new LinkedList<Orden>();
		while(!this.ordenesAsignadas.isEmpty()) {
			orden = this.ordenesAsignadas.remove();
			colaNueva.add(orden);
		}
		return colaNueva;
	}

	public void agregarOrden(Orden orden) {
		this.ordenesAsignadas.add(orden);
		
	}

	
	public void mostrarInfo() {
		System.out.println("Movil nro " + this.nroMovil + " zona: " + this.zona);
		Orden centinela = new Orden("***", null);
		Orden orden;
		
		this.ordenesAsignadas.add(centinela);
		orden = this.ordenesAsignadas.remove();
		while(orden != centinela) {
			System.out.println("- "+orden.toString());
			this.ordenesAsignadas.add(orden);
			orden = this.ordenesAsignadas.remove();
		}
	}
	
	@Override
	public String toString() {
		return "Movil [nroMovil=" + nroMovil + ", zona=" + zona + ", cantMaxAsignada=" + cantMaxAsignada
				+ ", ordenesAsignadas=" + ordenesAsignadas + "]";
	}

	public boolean existeEnMisOrdenes(String idOrden) {
		Orden centinela =  new Orden("**",null);
		Orden orden;
		boolean existe = false;
		this.ordenesAsignadas.add(centinela);
		orden  = this.ordenesAsignadas.remove();
		while(orden != centinela) {
			if(orden.getId() == idOrden) {
				existe = true;
			}
			this.ordenesAsignadas.add(orden);
			orden = this.ordenesAsignadas.remove();
		}
		return existe;
	}
	
	
	
}

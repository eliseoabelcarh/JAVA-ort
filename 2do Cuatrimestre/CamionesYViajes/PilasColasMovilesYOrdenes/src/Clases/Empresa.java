package Clases;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Empresa {

	private Queue<Orden> ordenesSinAsignar;
	private ArrayList<Movil> moviles;
	private Queue<Movil> movilesEnReparacion;
	private ArrayList<Cliente> clientes;
	
	public Empresa(Queue<Orden> ordenesSinAsignar, ArrayList<Movil> moviles, ArrayList<Cliente> clientes) {
		this.ordenesSinAsignar = ordenesSinAsignar;
		this.moviles = moviles;
		this.movilesEnReparacion = new LinkedList<Movil>();
		this.clientes = clientes;
	}
	
	public void buscarOT(String idOrden) {
		Movil movil;
		movil = ordenExisteEnAlgunMovil(idOrden);
		if(movil == null) {
			if(existeEnOrdenesSinAsignar(idOrden)) {
				System.out.println("Aún no asignada");
			}else {
				System.out.println("ID de OT inexistente");
			}
		}else {
			System.out.println("Asignada a móvil " + movil.getNro());
		}
	}



	private boolean existeEnOrdenesSinAsignar(String idOrden) {
		Orden centinela = new Orden("**",null);
		boolean existe =  false;
		Orden orden;
		this.ordenesSinAsignar.add(centinela);
		orden = this.ordenesSinAsignar.remove();
		while(orden != centinela) {
			if(orden.getId().equals(idOrden)) {
				existe= true;
			}
			this.ordenesSinAsignar.add(orden);
			orden = this.ordenesSinAsignar.remove();
		}
		return existe;
	}

	private Movil ordenExisteEnAlgunMovil(String idOrden) {
		int i = 0;
		boolean encontrado =  false;
		Movil movilEncontrado = null;
		while(!encontrado && i < this.moviles.size()) {
			if(this.moviles.get(i).existeEnMisOrdenes(idOrden)) {
				movilEncontrado = this.moviles.get(i);
				encontrado = true;
			}
		i++;
		}
		return movilEncontrado;
	}

	public void retirarMovil(int nroMovil) {
		boolean existeMovil = false;
		Movil  movil;
		//Queue<Orden> colaOrdenesAsignadas = new LinkedList<>(); 
		int cantOrdenesAsigActual;
		String zona;
		Movil movilDisponible = null;
		
		existeMovil = existeMovil(nroMovil);
		if(existeMovil) {
			movil = removerMovil(nroMovil);
			cantOrdenesAsigActual = movil.getCantOrdenesActual();
			zona = movil.getZona();
			movilDisponible = getMovilDisponibleParaRecibirOrdenes(cantOrdenesAsigActual, zona);
			if(movilDisponible != null) {
				reasignarOrdenesDeUnoAOtro(movil, movilDisponible);
			}else {
				enviarOrdenesASinAsignar(movil);
			}
			movilesEnReparacion.add(movil);
		}
		
		
	}

	private void enviarOrdenesASinAsignar(Movil movil) {
		Queue<Orden> cola;
		Orden orden;
		
		cola = movil.entregarColaDeOrdenes();
		while(! cola.isEmpty()) {
			orden = cola.remove();
			this.ordenesSinAsignar.add(orden);
		}
		
	}

	private void reasignarOrdenesDeUnoAOtro(Movil m1, Movil m2) {
		Orden orden;
		Queue<Orden> cola1;
		
		cola1 = m1.entregarColaDeOrdenes();
		while(!cola1.isEmpty()) {
			orden = cola1.remove();
			m2.agregarOrden(orden);
		}
		
	}

	private Movil getMovilDisponibleParaRecibirOrdenes(int nroDeOrdenes, String zona) {
		int i = 0;
		boolean encontrado =  false;
		Movil movil = null;
		while(!encontrado  &&  i < this.moviles.size()) {
			if(this.moviles.get(i).puedoRecibirXOrdenes(nroDeOrdenes)) {
				if(this.moviles.get(i).pertenezcoAZona(zona)) {
					encontrado = true;
					movil = this.moviles.get(i);
				}
			}
			i++;
		}
		
		return movil;
	}

	private Movil removerMovil(int nroDeMovil) {
		boolean encontrado = false;
		Movil movil =  null;
		int i = 0;
		while(!encontrado && i < this.moviles.size()) {
			if(this.moviles.get(i).getNro() == nroDeMovil) {
				encontrado = true;
				movil = this.moviles.remove(i);
			}else {
				i++;
			}
		}
		return movil;
	}

	private boolean existeMovil(int nroBuscado) {
		boolean encontrado = false;
		int i = 0;
		while(!encontrado && i < this.moviles.size()) {
			if(this.moviles.get(i).getNro() == nroBuscado) {
				encontrado = true;
			}else {i++;}
		}
		return encontrado;
	}





	@Override
	public String toString() {
		return "Empresa [ordenesSinAsignar=" + ordenesSinAsignar + ", moviles=" + moviles + ", movilesEnReparacion="
				+ movilesEnReparacion + ", clientes=" + clientes + "]";
	}
	
	
}

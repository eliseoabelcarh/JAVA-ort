package clases;

import java.util.ArrayList;
import java.util.Stack;

public class Mazo {
	
	
	private int cantCartas;
	private Stack<Carta> pila;
	
	
	public Mazo() {
		this.cantCartas = 0;
		this.pila = new Stack<Carta>();
	}
	
	public ArrayList<Carta> devolverArrayConCartas(int cantCartasAMover) {
		ArrayList<Carta> lista = new ArrayList<Carta>();
		int i = 0;
		if(tengoSuficientesCartas(cantCartasAMover)) {
			while(i < cantCartasAMover) {
				Carta carta = this.pila.pop();
				this.cantCartas--;
				lista.add(carta);
				i++;
			}
		}		
		return lista ;
	}

	public boolean tengoSuficientesCartas(int cantCartasAMover) {
		return cantCartas >= cantCartasAMover;
	}

	public void AgregarAMiPila(ArrayList<Carta> cartas) {	
		for (Carta carta : cartas) {
			this.pila.add(carta);
			this.cantCartas++;			
		}
	}
	
	public void agregarCarta(String letra) {
		this.pila.add(new Carta(letra));
		this.cantCartas++;
	}

	@Override
	public String toString() {
		return "Mazo [cantCartas=" + cantCartas + ", pila=" + pila + "]";
	}

	public Stack<Carta> getPila() {
		return pila;
	}
	
	

}

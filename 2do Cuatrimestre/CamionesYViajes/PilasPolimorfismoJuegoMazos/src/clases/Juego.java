package clases;

import java.util.ArrayList;

public class Juego {

	private ArrayList<Mazo> mazos;
	private ArrayList<Operacion> operaciones;

	public Juego() {
		this.mazos = new ArrayList<Mazo>();
		this.operaciones = new ArrayList<Operacion>();
	}

	public void agregarMazo(Mazo mazo) {
		this.mazos.add(mazo);
	}
	public void agregarOperacion(Operacion operacion) {
		this.operaciones.add(operacion);
	}

	public void realizarSimulacion() {	
		boolean cartasSuficientes = true;
		int i = 0;
		while(cartasSuficientes && i < this.operaciones.size() ) {
			Operacion operacion = this.operaciones.get(i);
			int nroMazoFrom = operacion.getNc();
			int cantCartasAMover = operacion.getN();
			Tipo  tipoOperacion = operacion.getTipo();
			boolean operacionValida = esTipoValido(tipoOperacion);
				if(operacionValida && this.mazos.get(nroMazoFrom-1).tengoSuficientesCartas(cantCartasAMover)) {	
					ArrayList<Carta> cartas = this.mazos.get(nroMazoFrom-1).devolverArrayConCartas(cantCartasAMover);
					switch (tipoOperacion) {
					case D:
						Mazo mazoDer = mazoDerecha(nroMazoFrom);
						mazoDer.AgregarAMiPila(cartas);
						operacion.setValido(true);
						break;
					case I:
						Mazo mazoIz = mazoIzquierda(nroMazoFrom);
						mazoIz.AgregarAMiPila(cartas);
						operacion.setValido(true);
						break;
					case E:
						cartas.clear();
						operacion.setValido(true);
						break;
					}
				}else {
					cartasSuficientes = false;
					operacion.setValido(false);
				}
			i++;
		}
		

	}




	private Mazo mazoIzquierda(int nroMazoFrom) {
		int resultado;
		if(nroMazoFrom == 1) {
			resultado = 4;
		}else {
			resultado = nroMazoFrom-1;
		}
		return this.mazos.get(resultado-1);
	}




	private boolean esTipoValido(Tipo tipoOperacion) {
		return tipoOperacion == Tipo.D || tipoOperacion== Tipo.E || tipoOperacion == Tipo.I;
	}

	private Mazo mazoDerecha(int nroMazoFrom) {
		int resultado;
		if(nroMazoFrom == 4) {
			resultado = 1;
		}else {
			resultado = nroMazoFrom+1;
		}
		return this.mazos.get(resultado-1);
	}

	@Override
	public String toString() {
		return "Juego [mazos=" + mazos + ", operaciones=" + operaciones + "]";
	}
	
}

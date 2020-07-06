package numeroTelefonico;

import tipoDeLinea.TipoDeLinea;

public class NumeroTelefonico {

	
	private int caracteristica;
	private int numeroDeAbonado;
	private int codigoDePais;
	private TipoDeLinea tipoDeLinea;
	
	public NumeroTelefonico(int caracteristica, int numeroDeAbonado, int codigoDePais, TipoDeLinea tipoDeLinea) {
		this.caracteristica = caracteristica;
		this.numeroDeAbonado = numeroDeAbonado;
		this.codigoDePais = codigoDePais;
		this.tipoDeLinea = tipoDeLinea;
	}
	
	public String getValor() {
		String codigo= "+" + getCodigoDePais();
		return codigo+getCaracteristica()+getNumeroDeAbonado();
	}

	private int getCaracteristica() {
		return caracteristica;
	}

	private int getNumeroDeAbonado() {
		return numeroDeAbonado;
	}

	private int getCodigoDePais() {
		return codigoDePais;
	}

	private String getTipoDeLinea() {
		return tipoDeLinea.name();
	}

	

	@Override
	public String toString() {
		return getTipoDeLinea() + " " + getValor() + " ";
	}
	
	
	
}

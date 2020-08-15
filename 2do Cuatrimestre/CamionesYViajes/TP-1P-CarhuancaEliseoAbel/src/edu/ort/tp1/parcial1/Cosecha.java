package edu.ort.tp1.parcial1;

public class Cosecha {
	private int nro;
	private Producto producto;
	private double toneladas;
	private double hectareas;

	public Cosecha(DatosCosecha info) {
		nro = info.getNroCosecha();
		producto = info.getProducto();
		toneladas = info.getToneladas();
		hectareas = info.getHectareas();
	}

	public void setHectareas(double hectareas) {
		this.hectareas = hectareas;
	}

	public double getHectareas() {
		return hectareas;
	}

	public int getNumero() {
		return nro;
	}

	public Producto getProducto() {
		return producto;
	}

	public double getToneladas() {
		return toneladas;
	}

	public double obtenerRendimiento() {
		return toneladas / hectareas;
	}

	public void imprimirResultadoCosecha() {
		System.out.printf("\tCosecha nro: %s %s\t rendimiento: %6.2f\n", nro, producto, obtenerRendimiento());
	}

	@Override
	public String toString() {
		return "Cosecha " + nro + " fruta:" + producto + " toneladas:" + toneladas + " hectareas:" + hectareas;
	}
}
package edu.ort.tp1.parcial1;

public class DatosCosecha {
	private int nroPlantacion;
	private int nroCosecha;
	private Producto producto;
	private double toneladas;
	private double hectareas;

	public DatosCosecha(int nroPlantacion, int nroCosecha, Producto producto, double toneladas, double hectareas) {
		this.nroPlantacion=nroPlantacion;
		this.nroCosecha=nroCosecha;
		this.producto=producto;
		this.toneladas=toneladas;
		this.hectareas=hectareas;
	}
	public int getNroPlantacion() {
		return nroPlantacion;
	}
	public double getHectareas() {
		return hectareas;
	}
	public int getNroCosecha() {
		return nroCosecha;
	}
	public Producto getProducto() {
		return producto;
	}
	public double getToneladas() {
		return toneladas;
	}
	@Override
	public String toString() {
		return "[plantacion=" + nroPlantacion + ", nroCosecha=" + nroCosecha + ",\t producto=" + producto +
			",\t toneladas=" + toneladas + ",\thectareas=" + hectareas + "]";
	}
}

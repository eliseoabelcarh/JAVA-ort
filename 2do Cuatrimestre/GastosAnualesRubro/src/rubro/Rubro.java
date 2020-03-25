package rubro;

import mes.Mes;

public class Rubro {
	
	private String nombre;
	private double[] gastosPorMes;
	private static final int TOTAL_MESES = 12;

	public Rubro(String nombre) {
		this.nombre = nombre;
		inicializarGastos();
	}
	
	private void inicializarGastos() {
		gastosPorMes = new double[TOTAL_MESES];
	}
	
	public void agregarGasto(Mes mes, double importe) {
		int indexMes = mes.ordinal();
		gastosPorMes[indexMes] += importe;

	}
	public String getNombre() {
		return this.nombre;
	}
	
	public static int getTOTAL_MESES() {
		return TOTAL_MESES;
	}

	public double getTotalGastos(Mes mes) {
		double total = 0;
		int indexMes = mes.ordinal();
		total = gastosPorMes[indexMes];
		return total;
	}
	
	
}

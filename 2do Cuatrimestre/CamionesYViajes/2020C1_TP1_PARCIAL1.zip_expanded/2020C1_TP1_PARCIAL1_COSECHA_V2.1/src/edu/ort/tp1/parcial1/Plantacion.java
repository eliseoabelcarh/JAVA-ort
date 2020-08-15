package edu.ort.tp1.parcial1;

import java.util.ArrayList;

public class Plantacion {
	private String nombre;
	private double hectareas;
	private ArrayList<Cosecha> cosechas;

	public Plantacion(String nombre, double hectareas) {
		this.nombre = nombre;
		this.hectareas = hectareas;
		cosechas = new ArrayList<Cosecha>();
	}

	public void agregarCosecha(Cosecha cosecha) {
		if (cosecha.getHectareas() == 0) {
			cosecha.setHectareas(hectareas);
		}
		cosechas.add(cosecha);
	}

	public Cosecha getCosecha(int indice) {
		Cosecha cosecha = null;
		if (indice >= 0 && indice < cosechas.size()) {
			cosecha = cosechas.get(indice);
		}
		return cosecha;
	}

	public double getHectareas() {
		return hectareas;
	}

	public String getNombre() {
		return nombre;
	}

	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre);
		for (int i = 0; i < cosechas.size(); i++) {
			cosechas.get(i).toString();
		}
	}

	public void mostrarTodos() {
		System.out.println("Nombre: " + nombre);
		for (int i = 0; i < cosechas.size(); i++) {
			cosechas.get(i).imprimirResultadoCosecha();
		}
	}

	public void rendimientoMaximo() {
		System.out.println(nombre);
		double rendimientoMax = Double.MIN_VALUE;
		double rendimiento = 0;
		int nroMax = -1;
		Cosecha cosecha;
		for (int i = 0; i < cosechas.size(); i++) {
			cosecha = cosechas.get(i);
			rendimiento = cosecha.obtenerRendimiento();
			if (rendimiento > rendimientoMax) {
				rendimientoMax = rendimiento;
				nroMax = cosecha.getNumero();
			}
		}
		System.out.print("Nro Cosecha Mejor Rendimiento:" + nroMax);
		System.out.printf(" - Rendimiento:%.2f \n", rendimientoMax);
	}

	public void rendimientoMinimo() {
		System.out.println(nombre);
		double rendimientoMin = Double.MAX_VALUE;
		double rendimiento = 0;
		int nroMin = -1;
		Cosecha cosecha;
		for (int i = 0; i < cosechas.size(); i++) {
			cosecha = cosechas.get(i);
			rendimiento = cosecha.obtenerRendimiento();
			if (rendimiento < rendimientoMin) {
				rendimientoMin = rendimiento;
				nroMin = cosecha.getNumero();
			}
		}
		System.out.print("Nro Cosecha Peor Rendimiento:" + nroMin);
		System.out.printf(" - Rendimiento:%.2f \n", rendimientoMin);
	}

	public void mostrarMenoresA(int rendimiento) {
		Cosecha cosecha;
		for (int i = 0; i < cosechas.size(); i++) {
			cosecha = cosechas.get(i);
			if (cosecha.obtenerRendimiento() < rendimiento) {
				System.out.println("Nombre: " + nombre);
				cosecha.imprimirResultadoCosecha();
			}
		}
	}

	public void mostrarMayoresA(int rendimiento) {
		Cosecha cosecha;
		for (int i = 0; i < cosechas.size(); i++) {
			cosecha = cosechas.get(i);
			if (cosecha.obtenerRendimiento() > rendimiento) {
				System.out.println("Nombre: " + nombre);
				cosecha.imprimirResultadoCosecha();
			}
		}
	}

	public Cosecha getCosechaPorNumero(int nroCosecha) {
		Cosecha cosecha = null;
		int indice = 0;
		while (indice < cosechas.size() && cosecha == null) {
			if (cosechas.get(indice).getNumero() == nroCosecha) {
				cosecha = cosechas.get(indice);
			} else {
				indice++;
			}
		}
		return cosecha;
	}

	public Cosecha getCosechaPorProducto(Producto producto) {
		Cosecha cosecha = null;
		int indice = 0;
		while (indice < cosechas.size() && cosecha == null) {
			if (cosechas.get(indice).getProducto().equals(producto)) {
				cosecha = cosechas.get(indice);
			} else {
				indice++;
			}
		}
		return cosecha;
	}


}
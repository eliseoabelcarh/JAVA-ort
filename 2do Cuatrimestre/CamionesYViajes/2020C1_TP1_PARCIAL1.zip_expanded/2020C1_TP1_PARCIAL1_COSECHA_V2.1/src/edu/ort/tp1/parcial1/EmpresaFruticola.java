package edu.ort.tp1.parcial1;

import java.util.ArrayList;

//1) Descargar este proyecto e importarlo en Eclipse

public class EmpresaFruticola {
	private static final String SIN_DATOS = "sin datos";
	private String nombre;
	private ArrayList<DatosCosecha> datosCosecha;
	private ArrayList<Plantacion> plantaciones;
	private int[][] contCosechas;
	private double[][] toneladasAcumuladas;

	// 2) Elegir y aplicar el que considere mejor constructor para
	// EmpresaFruticola.
	public EmpresaFruticola(String nombre) {
	}

	public void agregarPlantacion(Plantacion plantacion) {
		plantaciones.add(plantacion);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void cargarDatosCosecha(int nroPlantacion, int nroCosecha, Producto producto, double toneladas) {
		cargarDatosCosecha(nroPlantacion, nroCosecha, producto, toneladas,
				plantaciones.get(nroPlantacion - 1).getHectareas());
	}

	public void cargarDatosCosecha(int nroPlantacion, int nroCosecha, Producto producto, double toneladas,
			double hectareas) {
		if (nroDePlantacionValido(nroPlantacion)) {
			datosCosecha.add(new DatosCosecha(nroPlantacion, nroCosecha, producto, toneladas, hectareas));
		} else {
			System.out.println("Error en el numero de plantacion ingresado");
		}
	}

	private boolean nroDePlantacionValido(int nroPlantacion) {
		return nroPlantacion > 0 && nroPlantacion <= plantaciones.size();
	}

	private int cantidadDeProductos() {
		return Producto.values().length;
	}

	public void procesarDatos() {
		Cosecha cosecha;
		int nroPlantacion;
		int cantProd = cantidadDeProductos();
		// 3) Inicializar las estructuras que guardan mas abajo (en el for)
		// los datos para ser explotados en la estadistica de plantaciones y
		// productos.
		// ...
		// ...
		// ----------------------------------------------------------------
		System.out.println("Procesando los datos de cosechas");
		// Recorro todos los informes para cargar la estadistica
		for (DatosCosecha info : datosCosecha) {
			nroPlantacion = info.getNroPlantacion() - 1;
			cosecha = new Cosecha(info);
			// guardo la cosecha
			plantaciones.get(nroPlantacion).agregarCosecha(cosecha);
			// acumulo las toneladas por campo y producto
			toneladasAcumuladas[nroPlantacion][info.getProducto().ordinal()] += info.getToneladas();
			contCosechas[nroPlantacion][info.getProducto().ordinal()]++;
		}
	}

	public void listarDatosEntrada() {
		System.out.println("Datos de todas las cosechas");
		for (int i = 0; i < datosCosecha.size(); i++) {
			System.out.println(datosCosecha.get(i).toString());
		}
	}

	public void listarDatosSalida() {
		System.out.println("Rendimiento de todas las cosechas");
		for (int i = 0; i < plantaciones.size(); i++) {
			plantaciones.get(i).mostrarTodos();
		}
	}

	// 4) Mostrar la cantidad de cosechas de cada producto para cada plantación
	// (principal Plantación y secundario Producto).
	// public void mostrarCantCosechasPorPlantacionYProducto() {
	// }

	// 4) Mostrar la cantidad de cosechas en cada plantación para cada
	// producto (principal Producto y secundario Plantación).
	// public void mostrarCantCosechasPorProductoYPlantacion() {
	// }

	// 4) Mostrar las toneladas acumuladas de cada producto para cada
	// plantación (principal Plantación y secundario Producto).
	// public void mostrarToneladasPorPlantacionYProducto() {
	// }

	// 4) Mostrar las toneladas acumuladas en cada plantación para cada
	// producto (principal Producto y secundario Plantación).
	// public void mostrarToneladasPorProductoYPlantacion() {
	// }

	// 5) Obtener la cantidad de cosechas de un producto en una plantación
	// determinada, devolviendo un string con el nombre de producto y la
	// cantidad de cosechas. Si no se encuentra devolver "Sin datos".
	// public String cosechasDePlantacionYProducto(int nroPlantacion, Producto
	// producto) {
	// }

	// 5) Obtener las toneladas cosechadas de un producto en una plantación
	// determinada, devolviendo un string con el nombre de producto y las
	// toneladas. Si no se encuentra devolver "Sin datos".
	// public String toneladasDePlantacionYProducto(int nroPlantacion, Producto
	// producto) {
	// }

	// 6) Buscar la plantación y la cosecha enviados por parámetro,
	// devolviendo un String con todos los datos de la cosecha. Validar que la
	// plantación y la cosecha sean válidos. Si no lo son devolver "sin datos".
	// public String buscarCosecha(int nroPlantacion, int nroCosecha) {
	// }

	// 6) Buscar la primera cosecha de la plantación y el producto enviados
	// por parámetro. Devolver los datos de la cosecha en un string. Validar que
	// la cosecha exista. Si esta no existe devolver "sin datos".
	// public String buscarCosecha(int nroPlantacion, Producto producto) {
	// }

	// 7) Buscar la mayor cantidad de cosechas entre todas las plantaciones y
	// productos. Devolver un string con la mayor cosecha, pero si no hay datos
	// procesados devolver "Sin datos".
	// public String buscarMayorCosecha() {
	// }

	// 7) Buscar la menor cantidad de cosechas entre todas las plantaciones y
	// productos. Devolver un string con la mayor cosecha, pero si no hay datos
	// procesados devolver "Sin datos".
	// public String buscarMenorCosecha() {
	// }

	// 8) Listar el mejor rendimiento por plantación.
	// public void mejorRendimiento() {
	// }

	// 8) Listar el peor rendimiento por plantación.
	// public void peorRendimiento() {
	// }

	// 8) Mostrar las cosechas con rendimiento menor a un valor recibido por
	// parámetro.
	// public void mostrarMenoresARendimiento(int rendimiento) {
	// }

	// 8) Mostrar las cosechas con rendimiento mayor a un valor recibido por
	// parámetro.
	// public void mostrarMayoresARendimiento(int rendimiento) {
	// }

	// 9) Mostrar rendimientos promedio por hectárea de todas las cosechas por
	// plantación y producto (solo si hay cosechas). La fórmula a aplicar es:
	// toneladas / cantidad cosechas / hectáreas de la plantación.
	// public void mostrarCosechasPromedioPorPlantacionYProducto() {
	// }

	// 9) Mostrar rendimientos promedio por hectárea de todas las cosechas por
	// producto y plantación (solo si hay cosechas). La fórmula a aplicar es:
	// toneladas / cantidad cosechas / hectáreas de la plantación.
	// public void mostrarCosechasPromedioPorProductoYPlantacion() {
	// }

	// 9) Mostrar rendimientos promedio de todas las cosechas de la plantación
	// indicada por parámetro. Si no se procesaron datos mostrar "Sin datos", si
	// no existe la plantación mostrar "Plantación Inexistente" y si no hubo
	// cosechas mostrar "No hubo cosechas". La fórmula a aplicar es: toneladas
	// totales / cantidad cosechas totales / hectáreas de la plantación.
	// public void mostrarCosechasPromedioPorPlantacion(int nroPlantacion) {
	// }

	// 9) Mostrar el rendimiento promedio general por producto. Si no se
	// procesaron datos mostrar "Sin datos" y si no hubo cosechas para ese
	// producto mostrar "No hubo cosechas". La fórmula a aplicar es: toneladas
	// totales / cantidad cosechas totales / hectáreas totales.
	// public void mostrarCosechasPromedioGeneralPorProducto() {
	// }
}
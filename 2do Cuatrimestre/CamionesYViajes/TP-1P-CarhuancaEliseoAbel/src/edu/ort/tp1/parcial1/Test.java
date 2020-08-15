package edu.ort.tp1.parcial1;

import edu.ort.tp1.parcial1.EmpresaFruticola;
import edu.ort.tp1.parcial1.Plantacion;
import edu.ort.tp1.parcial1.Producto;

public class Test {
	public static void main(String[] args) {
		EmpresaFruticola laFrutera = new EmpresaFruticola("La Frutera");
		Plantacion plantacion1 = new Plantacion("Plantacion 1", 5);
		Plantacion plantacion2 = new Plantacion("Plantacion 2", 10);
		laFrutera.agregarPlantacion(plantacion1);
		laFrutera.agregarPlantacion(plantacion2);

		laFrutera.cargarDatosCosecha(1, 1, Producto.MANZANA, 100, 2.5);
		laFrutera.cargarDatosCosecha(1, 2, Producto.MANZANA, 200);
		laFrutera.cargarDatosCosecha(1, 3, Producto.LIMON, 150);
		laFrutera.cargarDatosCosecha(1, 4, Producto.NARANJA, 50);
		laFrutera.cargarDatosCosecha(2, 5, Producto.NARANJA, 75);
		laFrutera.cargarDatosCosecha(2, 6, Producto.LIMON, 200);
		laFrutera.cargarDatosCosecha(2, 7, Producto.LIMON, 100, 2);
		laFrutera.cargarDatosCosecha(2, 8, Producto.MANZANA, 20, .5);

		System.out.println("--------------------------------------------");
		laFrutera.listarDatosEntrada();
		laFrutera.procesarDatos();
		System.out.println("--------------------------------------------");
		laFrutera.listarDatosSalida();
		System.out.println("--------------------------------------------");

		// ------------------------------------------------ //
		// DESCOMENTA LOS METODOS QUE TE HAYAN TOCADO
		// PARA OBTENER LA SALIDA COMPLETA.
		// ELIMINA LOS RESTANTES.
		// ------------------------------------------------ //

		// Mostrar la Cantidad de cosechas por plantacion y producto
		// laFrutera.mostrarCantCosechasPorPlantacionYProducto();

		// Mostrar la Cantidad de cosechas por producto y plantacion
		// laFrutera.mostrarCantCosechasPorProductoYPlantacion();

		// Mostrar la cantidad acumulada de toneladas de cosechas por
		// plantacion y producto
		 laFrutera.mostrarToneladasPorPlantacionYProducto();
		 System.out.println("--------------------------------------------");

		// Mostrar la cantidad acumulada de toneladas de cosechas por
		// producto y plantacion
		// laFrutera.mostrarToneladasPorProductoYPlantacion();

		// Obtener la cantidad de cosechas de Manzana en la plantacion 1 y
		// mostrarla por pantalla
		System.out.println("Cosechas de " + Producto.MANZANA + " en la Plantacion 1:");
		System.out.println(laFrutera.cosechasDePlantacionYProducto(1,Producto.MANZANA));

		System.out.println("--------------------------------------------");
		// Obtener las toneladas consechadas de Limon en la Plantacion 2 y
		// mostrarla por pantalla
		//System.out.println("Toneladas de " + Producto.LIMON + " en la Plantacion 2:");
		//System.out.println(laFrutera.toneladasDePlantacionYProducto(2,Producto.LIMON));
		//System.out.println("--------------------------------------------");

		// Buscar la cosecha 3 en la plantacion 1 y mostrarla por pantalla
		//System.out.println("Buscar la cosecha 3 en la plantacion 1");
		//System.out.println(laFrutera.buscarCosecha(1, 3));
		//System.out.println("--------------------------------------------");

		// Buscar Manzanas en la plantacion 1
		System.out.println("Buscar Manzanas en la plantacion 1");
		System.out.println(laFrutera.buscarCosecha(1, Producto.MANZANA));
		System.out.println("--------------------------------------------");

		// Buscar la mayor cantidad de toneladas cosechadas entre todas las
		// plantaciones.
		System.out.println(laFrutera.buscarMayorCosecha());
		System.out.println("--------------------------------------------");

		// Buscar la menor cantidad de toneladas cosechadas entre todas las
		// plantaciones
		// System.out.println(laFrutera.buscarMenorCosecha());
		// System.out.println("--------------------------------------------");

		// Obtener el mejor rendimiento
		// laFrutera.mejorRendimiento();
		// System.out.println("--------------------------------------------");

		// Obtener el peor rendimiento
		// laFrutera.peorRendimiento();
		// System.out.println("--------------------------------------------");

		// Mostrar rendimientos menores a 40
		laFrutera.mostrarMenoresARendimiento(40);
		System.out.println("--------------------------------------------");

		// Mostrar rendimientos mayores a 30
		// laFrutera.mostrarMayoresARendimiento(30);
		// System.out.println("--------------------------------------------");

		// Mostrar los promedios de todas las cosechas por Plantacion y
		// Producto
		laFrutera.mostrarCosechasPromedioPorPlantacionYProducto();
		System.out.println("--------------------------------------------");

		// Mostrar los promedios de todas las cosechas por Producto y
		// Plantacion
		// laFrutera.mostrarCosechasPromedioPorProductoYPlantacion();
		// System.out.println("--------------------------------------------");

		// Mostrar los promedios de todas las cosechas por Plantación (no
		// importa el producto)
		// laFrutera.mostrarCosechasPromedioPorPlantacion(2);
		// System.out.println("--------------------------------------------");

		// Mostrar las cosechas promedio en general por Producto (no importa
		// la Plantacion)
		// laFrutera.mostrarCosechasPromedioGeneralPorProducto();
		// System.out.println("--------------------------------------------");
	}
}
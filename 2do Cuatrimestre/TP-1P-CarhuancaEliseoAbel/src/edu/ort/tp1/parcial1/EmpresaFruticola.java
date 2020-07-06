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
	// Se elige este constructor porque contcosechas y  toneladasAcumuladas dependen de la cant de productos
	// y de cantidad de plantaciones q se inicializan en procesarDatos()
	
	public EmpresaFruticola(String nombre) {
		this.setNombre(nombre);
		this.datosCosecha = new ArrayList<>();
		this.plantaciones = new ArrayList<>();
		
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
		
		this.toneladasAcumuladas = new double[this.plantaciones.size()][cantProd];
		this.contCosechas = new int[this.plantaciones.size()][cantProd];
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

	
	// 4) Mostrar las toneladas acumuladas de cada producto para cada
	// plantacion (principal Plantacion y secundario Producto).
	 public void mostrarToneladasPorPlantacionYProducto() {
		 for (int i = 0; i < this.toneladasAcumuladas.length; i++) {
			System.out.println("Plantación "  + (i+1) + ":");
			for (int x = 0; x < this.toneladasAcumuladas[i].length; x++) {
				Producto producto = Producto.values()[x];
				System.out.println("- " + producto);
				System.out.println(this.toneladasAcumuladas[i][x] + " tn");
			}
		}
	 }

	

	
	
	
	
	// 5) Obtener la cantidad de cosechas de un producto en una plantacion
	// determinada, devolviendo un string con el nombre de producto y la
	// cantidad de cosechas. Si no se encuentra devolver "Sin datos".
	public String cosechasDePlantacionYProducto(int nroPlantacion, Producto producto) {
		String resultado;
		int IndexProducto = producto.ordinal();
		int cantCosechas = 0;
		if(nroDePlantacionValido(nroPlantacion)) {
			cantCosechas = this.contCosechas[nroPlantacion - 1][IndexProducto];
		}
		if(cantCosechas != 0) {
			resultado = "Producto " + producto.name() + " tuvo " + cantCosechas + " cosechas";			
		}
		else {
			resultado = SIN_DATOS;
		}
		return resultado;
	}

	

	 
	 
	 



	// 6) Buscar la primera cosecha de la plantacion y el producto enviados
	// por parametro. Devolver los datos de la cosecha en un string. Validar que
	// la cosecha exista. Si esta no existe devolver "sin datos".
	public String buscarCosecha(int nroPlantacion, Producto producto) {
		String resultado= SIN_DATOS;
		if(nroDePlantacionValido(nroPlantacion)) {
			Plantacion plantacion = this.plantaciones.get(nroPlantacion - 1);
			Cosecha cosecha = plantacion.getCosechaPorProducto(producto);
			if(cosecha != null) {
				resultado = cosecha.toString();
			}
		}
		return resultado;
	}

	
	
	
	
	
	// 7) Buscar la mayor cantidad de cosechas entre todas las plantaciones y
	// productos. Devolver un string con la mayor cosecha, pero si no hay datos
	// procesados devolver "Sin datos".
	// correccion:
	// Buscar la mayor cantidad de toneladas cosechadas entre todas las
	// plantaciones.
	public String buscarMayorCosecha() {
		String resultado =SIN_DATOS;
		int mayorIndexPlantacion = -1;
		Producto mayorProducto = null;
		double mayorToneladas = 0;
		//si no hay datos procesados ojo
		if(this.toneladasAcumuladas != null) {
			for (int i = 0; i < this.toneladasAcumuladas.length; i++) {
				for (int x = 0; x < this.toneladasAcumuladas[i].length; x++) {
					if(this.toneladasAcumuladas[i][x]> mayorToneladas) {
						mayorToneladas = this.toneladasAcumuladas[i][x];
						mayorIndexPlantacion = i;
						mayorProducto = Producto.values()[x];
					}
				}
			}
			if(mayorIndexPlantacion != -1 && mayorProducto != null) {
				resultado = "La mayor cantidad de toneladas fue:" + mayorToneladas + " de " + mayorProducto + " en Plantación " + (mayorIndexPlantacion+1);
			}
		}
		return resultado;
	}

	

	
	
	


	// 8) Mostrar las cosechas con rendimiento menor a un valor recibido por
	// parametro.
	public void mostrarMenoresARendimiento(int rendimiento) {
		System.out.println("Cosechas con rendimiento menor a " + rendimiento);
		for (int i = 0; i < this.plantaciones.size(); i++) {
			Plantacion plantacion = this.plantaciones.get(i);
			for (int x = 0; x < plantacion.getCosechas().size(); x++) {
				Cosecha cosecha = plantacion.getCosecha(x);
				double rendimientoCosecha = cosecha.obtenerRendimiento();
				if(rendimientoCosecha < rendimiento) {
					System.out.println("Plantación " + (i+1));
					cosecha.imprimirResultadoCosecha();
				}
			}
		}
	}

	
	
	

	// 9) Mostrar rendimientos promedio por hectarea de todas las cosechas por
	// plantacion y producto (solo si hay cosechas). La formula a aplicar es:
	// toneladas / cantidad cosechas / hectareas de la plantacion.
//	public void mostrarCosechasPromedioPorPlantacionYProducto() {
//		
//		//OJO FALTA TERMINAR 
//		double result = 0;
//		for (int i = 0; i < plantaciones.size(); i++) {
//			System.out.println("Plantación " + (i+1));
//			int cantDeCosechas= plantaciones.get(i).getCosechas().size();
//			
//			for (int x = 0; x < cantDeCosechas; x++) {
//				
//				double totalRendimientos = 0;
//				for (int m = 0; m < Producto.values().length; m++) {
//					System.out.println("producto " + Producto.values()[m]);
//					double acumCosechas = 0;
//					Cosecha cosecha = plantaciones.get(i).getCosecha(x);
//					
//					if(cosecha.getProducto() == Producto.values()[m]) {
//				
//						totalRendimientos += cosecha.obtenerRendimiento();
//						acumCosechas++;
//					}
//					if(totalRendimientos != 0) {
//						result = totalRendimientos/acumCosechas;
//						System.out.println(" "+ result);	
//					}
//					else {System.out.println(" - ");}
//				}
//			}
//		}
//	}
//
//	
	  public void mostrarCosechasPromedioPorPlantacionYProducto() {
	       
	        double result = 0;
	        for (int i = 0; i < plantaciones.size(); i++) {
	            System.out.println("Plantación " + (i+1));
	            int cantDeCosechas= plantaciones.get(i).getCosechas().size();
	           
	            double totalRendimientos[] = new double[cantidadDeProductos()];
	            double acumCosechas[] = new double[cantidadDeProductos()];
	           
	            for (int x = 0; x < cantDeCosechas; x++) {               
	                Cosecha cosecha = plantaciones.get(i).getCosecha(x);
	                totalRendimientos[cosecha.getProducto().ordinal()] += cosecha.obtenerRendimiento();
	                acumCosechas[cosecha.getProducto().ordinal()]++;
	            }
	            for (int j = 0; j < cantidadDeProductos(); j++) {
	                if(totalRendimientos[j] != 0) {
	                    System.out.println("producto " + Producto.values()[j]);
	                    result = totalRendimientos[j]/acumCosechas[j];
	                    System.out.println(" "+ result);   
	                }
	            }
	        }
	    }
	
	
	
	
	
	
	
	

}
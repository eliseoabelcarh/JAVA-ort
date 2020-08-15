

package gastoAnual;

import mes.Mes;
import rubro.Rubro;

public class GastoAnual {
	
	private Rubro[] rubros;
	private final int CANTIDAD_MAX_DE_RUBROS = 20;
	
	public GastoAnual() {
		rubros = new Rubro[CANTIDAD_MAX_DE_RUBROS];
	}
	
	
	
	public void agregarGasto(Mes mes, String nombreRubro, double importe) {
			if(importe > 0) {
				Rubro rubro = obtenerRubro(nombreRubro);
				rubro.agregarGasto(mes, importe);
			}else {
				System.out.println("gasto no agregado");
			}
		}
	private int buscarIndexVacioArrayRubros(Rubro[] vector) {
		int indexVacio = -1;
		int i = 0;
		boolean encontrado =  false;
		while(!encontrado && i < vector.length) {
			if(vector[i] == null) {
				indexVacio = i;
				encontrado = true;
			}
			i++;
		}
		return indexVacio;
	}
		
	private Rubro obtenerRubro(String nombreRubro) {
			Rubro rubro = buscarRubro(nombreRubro);
			if(rubro == null) {
				rubro = new Rubro(nombreRubro);
				int indexVacio = buscarIndexVacioArrayRubros(this.rubros);
				if(indexVacio != -1) {
					this.rubros[indexVacio] = rubro;
				}
				
			}
			return rubro;
		}
	private Rubro buscarRubro(String nombreRubro) {
		Rubro rubroBuscado = null;
		int i = 0;
		boolean encontrado = false;
		while(!encontrado && i < this.rubros.length) {
			if(this.rubros[i] != null) {
				if(this.rubros[i].getNombre() == nombreRubro) {
					rubroBuscado = this.rubros[i];
					encontrado = true;
				}
			}
			i++;
		}
		return rubroBuscado;
	}
	
	private double[][] consolidadoDeGastos(){
		double[][] consolidado = new double[12][CANTIDAD_MAX_DE_RUBROS];
		
		for (int i = 0; i < consolidado.length; i++) {
			for (int j = 0; j <CANTIDAD_MAX_DE_RUBROS; j++) {
				Mes mes = Mes.getMes(i);
				if(this.rubros[j] != null) {
					consolidado[i][j]= this.rubros[j].getTotalGastos(mes);
				}
				
			}
		}
		return consolidado;
	}


	public double gastoAcumulado(Mes mes) {
		double gastoAcumulado = 0;
		int indexMes = mes.ordinal();
		double[][] consolidado = consolidadoDeGastos();
		for (int i = 0; i < consolidado[indexMes].length; i++) {
			gastoAcumulado += consolidado[indexMes][i];
		}
		return gastoAcumulado;
	}
	
	public double gastoAcumulado(String nombreRubro) {
		double gastoAcumulado = -1;
		Rubro rubro = buscarRubro(nombreRubro);
		if(rubro != null) {
			int indexRubro = convertirRubroAIndex(rubro);
			if(indexRubro != -1) {
				double[][] consolidado = consolidadoDeGastos();
				for (int i = 0; i < consolidado.length; i++) {
					gastoAcumulado += consolidado[i][indexRubro];
				}
			}	
		}
		return gastoAcumulado;
	}
	
	private int convertirRubroAIndex(Rubro rubro) {
		int index = -1;
		if(rubro != null) {
			int i = 0;
			boolean encontrado = false;
			while(!encontrado && i < this.rubros.length) {
				if(this.rubros[i] == rubro) {
					index = i;
					encontrado = true;
				}
				i++;
			}
		}
		return index;
	}
	
	public void informarConsumosPorMes() {
		int CantidadDeMeses = Rubro.getTOTAL_MESES();
		for (int i = 0; i < CantidadDeMeses; i++) {
			Mes mes = Mes.getMes(i);
			double gastoAcumulado = gastoAcumulado(mes);
			//System.out.println(gastoAcumulado + "breakkkkkk");
			System.out.println("Para " + mes.toString() + " se gastó " + gastoAcumulado);
		}
	}
	public void informarPromedioMensualPorRubro() {
		for (int i = 0; i < this.rubros.length; i++) {
			if(this.rubros[i] != null) {
				String nombreRubro = this.rubros[i].getNombre();
				double gastoAcumAlAnio= gastoAcumulado(nombreRubro);
				
				double promedio = sacarPromedio(gastoAcumAlAnio, 12);
				System.out.println("el promedio para " + nombreRubro + " es " + promedio );
			}
		}
	}
	
	 private double sacarPromedio(double total, double cantidadElementos) {
		 double resultado = 0;
		 if(cantidadElementos != 0) {
			 resultado = total/ cantidadElementos;
		 }
		 return  resultado;
	 }
	 
	 private int buscarIndexVacioArrayMeses(Mes[] vector) {
		 int indexVacio = -1;
		 if(vector != null) {
			 int i = 0;
			 boolean encontrado = false;
			 while(!encontrado && i < vector.length) {
				 if(vector[i] == null) {
					 indexVacio = i;
					 encontrado = true;
				 }
				 i++;
			 }
		 }
		 return indexVacio;
	 }
	 
	 public void informarMesMayorConsumo() {
		 double [][] consolidado = consolidadoDeGastos();
		 Mes[] maxMeses = new Mes[consolidado.length];
		 double maxValue = 0;
		 for (int i = 0; i < consolidado.length; i++) {
			Mes mes = Mes.getMes(i);
			double gastoAcumuladoDelMes = gastoAcumulado(mes);
			if(gastoAcumuladoDelMes > maxValue) {
				maxValue = gastoAcumuladoDelMes;
			}
		}
		 
		for (int i = 0; i < Rubro.getTOTAL_MESES(); i++) {
			Mes mes = Mes.getMes(i);
			double gastoAcumuladoDelMes = gastoAcumulado(mes);
			if(gastoAcumuladoDelMes == maxValue) {
				int indexVacio = buscarIndexVacioArrayMeses(maxMeses);
				if(indexVacio != -1 ) {
					maxMeses[indexVacio] = mes;
				}
			}
		}
		 //muestro datos de vector maxMeses
		System.out.println("------------------------------");
		 System.out.println("MES O MESES CON MAYOR CONSUMO:");
		 for (int i = 0; i < maxMeses.length; i++) {
			 if(maxMeses[i] != null) {
				 System.out.println((i+1)+ ".- " + maxMeses[i].toString());
			 }
			
		}
		 System.out.println("con consumo: " + maxValue);
	 }
	 

}

package testVec;

import java.util.Arrays;

public class TestVec {
	
	private int[] vec;
	private final int CANTIDAD_MAXIMA_DE_NROS = 10;
	
	public TestVec(){
		vec = new int[CANTIDAD_MAXIMA_DE_NROS];
		
	}
	
	public void addNros(int[] vector) {
		this.vec = vector;
	}
	
	private int devolverNroMayor(int[] vector) {
		int maxValue = 0;
		if(vector != null) {
			for (int i = 0; i < vector.length; i++) {
				if(vector[i] > maxValue) {
					maxValue = vector[i];
				}
			}
		}
		return maxValue;
	}
	
	private int sumarNrosAlmacenados(int[] vector) {
		int suma = 0;
		if(vector != null) {
			for (int i = 0; i < vector.length; i++) {
				suma+= vector[i];
			}
		}
		return suma;
	}
	private int devolverCantidadDeElementos(int[] vector) {
		int cantidad = 0;
		if(vector != null) {
			cantidad = vector.length;
		}
		return cantidad;
	}
	
	private int sacarPromedioDeNrosAlmacenados(int[] vector) {
		int promedio = -1;
		int cantElementos = devolverCantidadDeElementos(vector);
		if(cantElementos > 0) {
			int suma = sumarNrosAlmacenados(vector);
			promedio = suma/cantElementos;
		}
		return promedio;
	}
	
	private boolean existeNroEnVector(int nro, int[] vector) {
		boolean existe = false;
		int i = 0;
		if(vector != null) {
			while(!existe && i < vector.length ) {
				if(vector[i] == nro) {
					existe = true;
				}
				i++;
			}
		}
		return existe;
	}
	
	private int devolverCantidadVecesRepiteNro(int nro, int[] vector) {
		int cantidadDeVecesRepiteNro = 0;
		if(vector != null) {
			for (int i = 0; i < vector.length; i++) {
				if(vector[i] == nro) {
					cantidadDeVecesRepiteNro++;
				}
			}
		}
		return cantidadDeVecesRepiteNro;
	}

	public int cantidadRepetidaDeNroMayor() {
		int[] vector = this.vec;
		int nroMayor = devolverNroMayor(vector);
		int cantidadQueSeRepiteMayor = devolverCantidadVecesRepiteNro(nroMayor, vector);
		return cantidadQueSeRepiteMayor;
	}
	public boolean elPromedioExisteEnVector() {
		boolean existe = false;
		int[] vector = this.vec;
		if(vector != null) {
			int promedio = sacarPromedioDeNrosAlmacenados(vector);
			if(promedio != -1) {
				existe = existeNroEnVector(promedio, vector);
			}
		}
		
		return existe;
	}
	private int[] crearArrayConNroInicialYNroFinal(int nroInicial, int nroFinal) {
		int[] vectorFinal = null;
		if(nroFinal - nroInicial > 1) {
			int cantidadDeElementos = (nroFinal - nroInicial) + 1;
			vectorFinal =  new int[cantidadDeElementos];
			int indexFinal = cantidadDeElementos-1;
			vectorFinal[0] = nroInicial;
			vectorFinal[indexFinal]=nroFinal;
			for (int i = 1; i < nroFinal-1 ; i++) {
				vectorFinal[i] = vectorFinal[i-1] + 1 ;
			}
		}
		return vectorFinal;
	}
	
	//mejorado
	public void mostrarEnterosEntre1YNroAlmacenados() {
		int[] vector = this.vec;
		if(vector != null) {
			for (int i = 0; i < vector.length; i++) {
				int[] array = crearArrayConNroInicialYNroFinal(1, vector[i]);
				System.out.println(Arrays.toString(array));
			}
		}
	}
	public void mostrarValoresEntre1YNroAlmacenados() {
		int[] vector = this.vec;
		final int NRO_INICIAL = 1;
		for (int i = 0; i < vector.length; i++) {
			System.out.println("-------------------");
			System.out.println("valor inicial: " + NRO_INICIAL);
			if(vector[i] - NRO_INICIAL > 1) {
				for (int j = NRO_INICIAL+1; j < vector[i]; j++) {
					System.out.println(j);	
				}
			}
			System.out.println("valor final: " + vector[i]);
			System.out.println("-------------------");
		}
	}
	
	private int[] cambiarPosicionesAlSgte(int[] vector) {
		final int CANTIDAD_DE_ELEMENTOS = devolverCantidadDeElementos(vector);
		int[] vectorFinal = new int[CANTIDAD_DE_ELEMENTOS];
		
		if(vector!= null) {
			int IndexDelUltimoNro = (vector.length)-1;
			int ultimoNro = vector[IndexDelUltimoNro];
			vectorFinal[0] = ultimoNro;
			for (int i = 1; i < vectorFinal.length; i++) {
				vectorFinal[i] = vector[i-1];
			}
		}	
		return vectorFinal;
	}
	
	public int[] rotacionNPosicionesDeVector(int nroRotaciones) {
		 
		int[] vectorFinal = this.vec;
		if(vectorFinal!=null && nroRotaciones > 0) {
			
			for (int i = 0; i < nroRotaciones; i++) {
				vectorFinal = cambiarPosicionesAlSgte(vectorFinal);//1 vuelta
			}
		}
		return vectorFinal;
	}
	
}

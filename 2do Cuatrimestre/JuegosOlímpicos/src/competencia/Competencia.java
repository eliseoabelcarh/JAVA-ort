package competencia;

import atleta.Atleta;

public class Competencia {
	
	private Atleta[] competidores;
	private float[] arrayDeCompetidoresConSuTiempo;
	private int NRO_MAXIMO_DE_COMPETIDORES = 10;
	
	public Competencia() {
		this.competidores = new Atleta[NRO_MAXIMO_DE_COMPETIDORES];
		this.arrayDeCompetidoresConSuTiempo  = new float[NRO_MAXIMO_DE_COMPETIDORES];
	}

	public Atleta agregarCompetidor(Atleta atleta) {
		Atleta competidor = null;
		if(atleta != null) {
			int indexVacio = buscarEspacioNullEnVector(this.competidores);
			if(indexVacio != -1 && !existeEnCompetidores(atleta)) {
				this.competidores[indexVacio] = atleta;
				competidor = atleta;	
			}
		}
		return competidor;			
	}
	
	public boolean addTiempoACompetidor(Atleta atleta, float tiempo) {
		boolean resultado = false;
		if(existeEnCompetidores(atleta)) {
			int indexAtleta = convertirAtletaEnIndex(atleta);
			if(indexAtleta != -1) {
				this.arrayDeCompetidoresConSuTiempo[indexAtleta] = tiempo;
				resultado = true;
			}
		}
		return resultado;
	}
	public void mostrarPuestosNro1() {
		float[][] primerosPuestos = new float[NRO_MAXIMO_DE_COMPETIDORES][2];		
		float[][] posicionesFinalesCompetidoresConSuTiempo = new float[NRO_MAXIMO_DE_COMPETIDORES][2];
		posicionesFinalesCompetidoresConSuTiempo = ordenarCompetidoresYSusTiempos(this.arrayDeCompetidoresConSuTiempo);
		calcularGanadores("PRIMER PUESTO ", primerosPuestos, posicionesFinalesCompetidoresConSuTiempo);

	}
	
	private void calcularGanadores(String mensaje, float[][] xPuestos , float[][] posicionesFinalesCompetidoresConSuTiempo) {
		
		float[][] ganadores = obtenerPrimerosPuestosExistentesEnArray(posicionesFinalesCompetidoresConSuTiempo);
		
		if(ganadores != null) {
			int cantidadDeGanadores = 0;
			for (int i = 0; i < ganadores.length; i++) {
				if(ganadores[i][1] != 0) {
					
					float indexFloatAtleta = ganadores[i][0];
					float tiempoAtleta = ganadores[i][1];
					int indexVacio = buscarEspacioConValorNullEnFloat(xPuestos);
					if(indexVacio != -1) {
						xPuestos[indexVacio][0]= indexFloatAtleta;
						xPuestos[indexVacio][1]= tiempoAtleta;		
						cantidadDeGanadores++;	
					}
				}
			}
		//borro indexes de los primeros ganadores dejando los sgtes ganadores
		int h =0;
		int i = 0;
		while (h < cantidadDeGanadores && i < posicionesFinalesCompetidoresConSuTiempo.length) {
			if(posicionesFinalesCompetidoresConSuTiempo[i][1] != 0 ) {
				posicionesFinalesCompetidoresConSuTiempo[i][0]=-1;
				posicionesFinalesCompetidoresConSuTiempo[i][1]=0;
				h++;
				}
			i++;
		}
		//muestro los ganadores			
		mostrarGanadores(mensaje, xPuestos);
		}
	}
	
	
	public void obtenerTernaGanadora() {
		float[][] primerosPuestos = new float[NRO_MAXIMO_DE_COMPETIDORES][2];
		float[][] segundosPuestos = new float[NRO_MAXIMO_DE_COMPETIDORES][2];
		float[][] tercerosPuestos = new float[NRO_MAXIMO_DE_COMPETIDORES][2];
		float[][] posicionesFinalesCompetidoresConSuTiempo = new float[NRO_MAXIMO_DE_COMPETIDORES][2];
		posicionesFinalesCompetidoresConSuTiempo = ordenarCompetidoresYSusTiempos(this.arrayDeCompetidoresConSuTiempo);
		calcularGanadores("PRIMER PUESTO ", primerosPuestos, posicionesFinalesCompetidoresConSuTiempo);
		calcularGanadores("SEGUNDO PUESTO ", segundosPuestos, posicionesFinalesCompetidoresConSuTiempo);
		calcularGanadores("TERCER PUESTO ", tercerosPuestos, posicionesFinalesCompetidoresConSuTiempo);
	}
	
	private void mostrarGanadores(String texto, float[][] vector) {
		if(vector != null ) {
			int i = 0;
			while(vector[i][1] != 0 && i < vector.length) {
				int indexCompetidor = (int)vector[i][0];
				float tiempoAtleta = vector[i][1];
				Atleta competidor = devolverCompetidor(indexCompetidor);
				System.out.println( texto + " " + competidor.getNombre() + " con tiempo " + tiempoAtleta );
				i++;
			}
		}
	}
	

	private float[][] obtenerPrimerosPuestosExistentesEnArray(float[][] vectorConPosicionesYTiemposOrdenados){
		float[][] vector = new float[NRO_MAXIMO_DE_COMPETIDORES][2];
		int i = 0;
		boolean encontradoAlPrimerNoNull = false;
		float primerMejorTiempo = -1;
		while (i < vectorConPosicionesYTiemposOrdenados.length && !encontradoAlPrimerNoNull) {
			if(vectorConPosicionesYTiemposOrdenados[i][1] != 0) {
					primerMejorTiempo = vectorConPosicionesYTiemposOrdenados[i][1];
					encontradoAlPrimerNoNull= true;	
			}
			i++;
		}
		//verifico si hay más con  igual tiempo que el encontrado y agrego desde el principio	
		for (int j = 0; j < vectorConPosicionesYTiemposOrdenados.length; j++) {
			if(vectorConPosicionesYTiemposOrdenados[j][1] != 0) {
				if(vectorConPosicionesYTiemposOrdenados[j][1]== primerMejorTiempo) {
					int indexVacio = buscarEspacioConValorNullEnFloat(vector);
					vector[indexVacio][0]=vectorConPosicionesYTiemposOrdenados[j][0];
					vector[indexVacio][1]=vectorConPosicionesYTiemposOrdenados[j][1];
				}
			}
		}
		//devuelve vector algo similar a {mismotiempo, mismotiempo, mismotiempo, null , null, null}
		return vector;
	}

	private int buscarEspacioConValorNullEnFloat(float[][] vector) {
		int indexVacio = -1;
		int i = 0;
		boolean encontrado = false;
		while(!encontrado && i < vector.length) {
			if(vector[i][1] == 0) {
				indexVacio = i;
				encontrado = true;
			}
			i++;
		}
		return indexVacio;
	}
	
	
	private Atleta devolverCompetidor(int indexBuscado) {
		Atleta atleta = null;
		if(indexBuscado != -1) {
			atleta = this.competidores[indexBuscado];
		}
		return atleta;
	}
	
	private float[][] ordenarCompetidoresYSusTiempos(float[] array){
		float[][] vector = new float[NRO_MAXIMO_DE_COMPETIDORES][2];
		float[] copiaDeArrayDeCompetidoresConSuTiempo = new float[NRO_MAXIMO_DE_COMPETIDORES];
		copiaDeArrayDeCompetidoresConSuTiempo = array;
		for (int i = 0; i < vector.length; i++) {
			int indexGanador = buscarIndexGanadorConMejorTiempo(copiaDeArrayDeCompetidoresConSuTiempo); 
			if(indexGanador != -1) {
				vector[i][0] = indexGanador;
				vector[i][1] = copiaDeArrayDeCompetidoresConSuTiempo[indexGanador];
				removerIndexDeArrayFloat(copiaDeArrayDeCompetidoresConSuTiempo , indexGanador);
			}
		}	
		return vector;
	}
	
	
	
	private boolean removerIndexDeArrayFloat(float[] vector, int indexABorrar) {
		boolean removido = false;
		if(vector != null && indexABorrar != -1) {
			vector[indexABorrar] = -1;
			removido = true;
		}
		return removido;
	}
	private int buscarIndexGanadorConMejorTiempo(float[] vector) {
		int indexGanador = -1;
		float minValue = 9999999;
		for (int i = 0; i < vector.length; i++) {
			if(vector[i] < minValue && vector[i] > 0) {
				minValue = vector[i];
				indexGanador = i;
			}
		}
		return indexGanador;
	}
	
	private int convertirAtletaEnIndex(Atleta atleta) {
		int index= -1;
		if(existeEnCompetidores(atleta)) {
			int i = 0;
			boolean encontrado = false;
			while(!encontrado && i < this.competidores.length) {
				if(this.competidores[i] == atleta) {
					encontrado = true;
					index = i;
				}
				i++;
			}
		}
		return index;
	}
	private boolean existeEnCompetidores(Atleta atleta) {
		boolean existe =  false;
		int i = 0;
		while(!existe && i < this.competidores.length ) {
			if(devolverCompetidor(i) == atleta) {
				existe=true;
			}
			i++;
		}		
		
		return existe;
	}
	
	private int buscarEspacioNullEnVector(Atleta[] vector) {
		int indexVacio = -1;
		int i = 0;
		boolean encontrado = false;
		while(!encontrado && i < vector.length) {
			if(vector[i] == null) {
				indexVacio = i;
				encontrado = true;
			}
			i++;
		}
		return indexVacio;
	}


	
	
}

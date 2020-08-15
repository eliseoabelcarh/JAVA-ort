package competencia;

import atleta.Atleta;

public class Competencia {
	
	private Atleta[] competidores;
	private float[] competidoresYTiempos;
	
	
	public Competencia(int cantidadMaximaCompetidores) {
		this.competidores =  new Atleta[cantidadMaximaCompetidores];
		this.competidoresYTiempos = new float [cantidadMaximaCompetidores];
		
	}

	public int RegistrarCompetidor(Atleta atleta) {
		int indexVacio;
		indexVacio = buscarEspacioNullTipoAtleta(this.competidores);
		if(indexVacio != -1) {
			this.competidores[indexVacio] = atleta;
		}
		return indexVacio;
	}

	public void registrarTiempoCompetidor(int nroIndexCompetidor, float tiempo ) {
		this.competidoresYTiempos[nroIndexCompetidor]= tiempo;
	}
	public Atleta[] devolverPrimerosPuestos() {
		Atleta[] vector;
		float mejorTiempo =  devolverMejorTiempoExcepto(this.competidoresYTiempos, 0, 0);
		vector = devolverCompetidoresConTiempoX(mejorTiempo);
		return vector;
	}
	public Atleta[] devolverSegundosPuestos() {
		Atleta[] vector;
		float mejorTiempo =  devolverMejorTiempoExcepto(this.competidoresYTiempos, 0, 0);
		float segundoMejorTiempo = devolverMejorTiempoExcepto(competidoresYTiempos, mejorTiempo, 0);
		vector = devolverCompetidoresConTiempoX(segundoMejorTiempo);
		return vector;
	}
	public Atleta[] devolverTercerosPuestos() {
		Atleta[] vector;
		float mejorTiempo =  devolverMejorTiempoExcepto(this.competidoresYTiempos, 0, 0);
		float segundoMejorTiempo = devolverMejorTiempoExcepto(competidoresYTiempos, mejorTiempo, 0);
		float tercerMejorTiempo = devolverMejorTiempoExcepto(competidoresYTiempos, mejorTiempo, segundoMejorTiempo);
		vector = devolverCompetidoresConTiempoX(tercerMejorTiempo);
		return vector;
	}
	
	
	public Atleta[] devolverCompetidoresConTiempoX(float tiempo) {
		Atleta[] vector = new Atleta[this.competidores.length];
		for (int i = 0; i < this.competidoresYTiempos.length; i++) {
			if(this.competidoresYTiempos[i] == tiempo) {
				Atleta competidor = devolverCompetidor(i);
				vector[i] = competidor;
			}
		}
		
		return vector;
	}
	private float devolverMejorTiempoExcepto(float[] vector, float t1, float t2) {
		float mejorTiempo = 9999999;
		for (int i = 0; i < vector.length; i++) {
			if(vector[i] < mejorTiempo && vector[i] > 0 
			   && vector[i] != t1 && vector[i] != t2
					) {
				mejorTiempo = vector[i];
			}
		}
		return mejorTiempo;
	}
	
	private Atleta devolverCompetidor(int indexCompetidor) {
		Atleta competidor;
		competidor = this.competidores[indexCompetidor];
		return competidor;
	}
	
	private int buscarEspacioNullTipoAtleta(Atleta[] vector) {
		int indexVacio = -1;
		boolean encontrado = false;
		int i = 0;
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

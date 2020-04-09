package institucion;

import atleta.Atleta;
import competencia.Competencia;

public class Institucion {
	
	
	private Competencia competencia;
	
	
	public Institucion(int cantidadMaximaAtletas) {
		
		this.competencia = new Competencia(cantidadMaximaAtletas);
	}
	
	public void registrarTiempoDeAtleta(String nombreAtleta, float tiempo) {
		Atleta atleta = new Atleta(nombreAtleta);
		int nroIndexCompetidor = this.competencia.RegistrarCompetidor(atleta);
		if(nroIndexCompetidor != -1) {
			this.competencia.registrarTiempoCompetidor(nroIndexCompetidor, tiempo);
		}else {System.out.println("no registrado");}
		
	}

	public void informarPuesto(int i) {
		Atleta[] vector;
		switch (i) {
		case 1:
			vector = this.competencia.devolverPrimerosPuestos();
			System.out.println("Puesto " + i + ":");
			mostrarDatos(vector);
			break;
		case 2:
			vector = this.competencia.devolverSegundosPuestos();
			System.out.println("Puesto " + i + ":");
			mostrarDatos(vector);
			break;
		case 3:
			vector = this.competencia.devolverTercerosPuestos();
			System.out.println("Puesto " + i + ":");
			mostrarDatos(vector);
			break;

		default:
			break;
		}
		
	}
	public void mostrarDatos(Atleta[] vector) {
		for (int i = 0; i < vector.length; i++) {
			if(vector[i] != null) {
				String nombre = vector[i].getNombre();
				System.out.println(" - " + nombre);
			}
		}
	}
	
}

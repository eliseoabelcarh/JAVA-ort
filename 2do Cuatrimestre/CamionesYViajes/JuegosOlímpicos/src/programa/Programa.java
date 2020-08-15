package programa;

import atleta.Atleta;
import institucion.Institucion;


public class Programa {

	public static void main(String[] args) {


		Institucion institucion = new Institucion();
		institucion.registrarAtletaEnCompetencia("atleta1");
		institucion.registrarAtletaEnCompetencia("atleta2");
		institucion.registrarAtletaEnCompetencia("atleta3");
		institucion.registrarAtletaEnCompetencia("atleta4");
		institucion.registrarAtletaEnCompetencia("atleta5");
		institucion.registrarAtletaEnCompetencia("atleta6");
		
		institucion.registrarTiempoDeAtleta("atleta1", 11.5f);
		institucion.registrarTiempoDeAtleta("atleta2", 1.1f);
		institucion.registrarTiempoDeAtleta("atleta3", 5f);
		institucion.registrarTiempoDeAtleta("atleta4", 1.2f);
		institucion.registrarTiempoDeAtleta("atleta5", 5f);
		institucion.registrarTiempoDeAtleta("atleta6", 11.5f);
		
		//institucion.mostrarPuestosNroUnoDeLaCompetencia();
		
		institucion.mostrarTerna();
		
		
		
	}


}



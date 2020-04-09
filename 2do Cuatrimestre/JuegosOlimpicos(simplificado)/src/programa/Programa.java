package programa;

import institucion.Institucion;

public class Programa {

	public static void main(String[] args) {

		Institucion inst = new Institucion(10);
		inst.registrarTiempoDeAtleta("Jose", 1.25f);
		inst.registrarTiempoDeAtleta("Armando", 0.15f);
		inst.registrarTiempoDeAtleta("Pedro", 1.25f);
		inst.registrarTiempoDeAtleta("Felipe", 0.25f);
		inst.registrarTiempoDeAtleta("Julio", 0.15f);
		inst.registrarTiempoDeAtleta("Juan", 1.85f);
		
		inst.informarPuesto(1);
		inst.informarPuesto(2);
		inst.informarPuesto(3);
	}

}

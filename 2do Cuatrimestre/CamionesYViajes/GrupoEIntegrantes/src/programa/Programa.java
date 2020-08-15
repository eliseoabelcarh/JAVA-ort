package programa;

import grupo.Grupo;


public class Programa {

	

	public static void main(String[] args) {

		Grupo grupo = new Grupo("grupete");
		grupo.agregarIntegrante("mama");
		grupo.agregarIntegrante("meme");
		grupo.agregarIntegrante("mimi");
		grupo.agregarIntegrante("momo");
		grupo.agregarIntegrante("mumu");
		grupo.agregarIntegrante("ficticio");
		
		
		verificarSiIntegranteFueAgregado(grupo, "meme");
		verificarSiIntegranteFueAgregado(grupo, "tiktok");

		mostrarDatosDeGrupo(grupo);
		
		removerIntegranteDeGrupoYMostrarNombre(grupo, "ficticio");		
		mostrarDatosDeGrupo(grupo);
		
		removerIntegranteDeGrupoYMostrarNombre(grupo, "ficticio");
		mostrarDatosDeGrupo(grupo);
		
		vaciarGrupo(grupo);
		mostrarDatosDeGrupo(grupo);
		
		
	}
	
	public static void mostrarDatosDeGrupo(Grupo grupo) {
		if(grupo != null) {
			System.out.println("");
			System.out.println("----DATOS DE GRUPO:");
			grupo.mostrar();
		}
		
	}
	public static void vaciarGrupo(Grupo grupo) {
		if(grupo != null) {
		grupo.vaciar();
		}
	}
	public static void removerIntegranteDeGrupoYMostrarNombre(Grupo grupo , String nombreIntegrante) {
		String integranteRemovido = grupo.removerIntegrante(nombreIntegrante);
		if(integranteRemovido != null) {
			System.out.println(" se removió a "  + integranteRemovido);
		}else {
			System.out.println("no se pudo remover a " + nombreIntegrante + " porq no existe");
		}
	}
	
	public static void verificarSiIntegranteFueAgregado(Grupo grupo, String nombre) {
		String integrante = grupo.buscarIntegrante(nombre);
		if(integrante != null) {
			System.out.println("integrante sí fue agregado");
		}else {
			System.out.println("integrante no fue agregado");
		}		
	}

}

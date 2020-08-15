package institucion;

import atleta.Atleta;
import competencia.Competencia;

public class Institucion {
	
	private Atleta[] atletas ;
	private Competencia competencia;
	
	
	public Institucion() {
		this.atletas =  new Atleta[50];
		this.competencia = new Competencia();
	}
	
	public void mostrarPuestosNroUnoDeLaCompetencia() {
		this.competencia.mostrarPuestosNro1();
		
	}
	
	public void registrarTiempoDeAtleta(String nombre, float tiempo) {
		Atleta atleta = buscarAtletaPorNombre(nombre);
		
		if(atleta != null) {
			boolean exito = this.competencia.addTiempoACompetidor(atleta, tiempo);
			if(exito) {
				//System.out.println("tiempo registrado");
			}
		}
		
	}
	
	public Atleta registrarAtleta(String nombre) {
		Atleta atletaNuevo = null;
		if(nombre != "" && !existeAtleta(nombre)) {
			int indexVacio =  buscarEspacioNullEnVector(this.atletas);
			if(indexVacio != -1) {
				atletaNuevo = new Atleta(nombre);
				this.atletas[indexVacio]= atletaNuevo ;
			}
		}else {System.out.println("ya existe atleta");}
		return atletaNuevo;
	}
	
	private boolean existeAtleta(String nombre) {
		boolean resultado = false;
		if(buscarAtletaPorNombre(nombre) != null) {
			resultado = true;
		}
		return resultado;
	}
	
	private Atleta buscarAtletaPorNombre(String nombre) {
		Atleta atletaEncontrado =  null;
		if(nombre != "") {
			int i = 0;
			boolean encontrado  =  false;
			while(!encontrado && i < this.atletas.length) {
				if(this.atletas[i] != null) {
					String nombreAtleta = this.atletas[i].getNombre();
					if(nombreAtleta == nombre) {
						atletaEncontrado = this.atletas[i];
						encontrado = true;
					}
				}
				i++;
			}
		}
		return atletaEncontrado;
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
	
	private Atleta registrarYAgregarAtletaACompetencia(String nombre) {
		Atleta competidorAgregadoACompetencia = null;
		Atleta atletaRegistrado;
			if(!existeAtleta(nombre)) {
				atletaRegistrado = registrarAtleta(nombre);
			}else {
				atletaRegistrado = buscarAtletaPorNombre(nombre);
			}
			if(atletaRegistrado != null) {
				competidorAgregadoACompetencia = this.competencia.agregarCompetidor(atletaRegistrado);
			}
		return competidorAgregadoACompetencia;
	}

	public void registrarAtletaEnCompetencia(String nombre) {
		
		if(registrarYAgregarAtletaACompetencia(nombre) != null) {
			//System.out.println("atleta agregado a competencia");
		}else {System.out.println("no se pudo agregar atleta");}
	}
	
	public void mostrarTerna() {
		this.competencia.obtenerTernaGanadora();
	}
}

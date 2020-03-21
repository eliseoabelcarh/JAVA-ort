package grupo;

public class Grupo {
	private String nombre;
	private String[] integrantes;
	private final int CANTIDAD_MAXIMA_DE_INTEGRANTES = 10;
	private final int NRO_DONDE_EMPIEZA_POSICIONES = 1;
	
	public Grupo(String nombre) {
		this.nombre = nombre;
		this.integrantes = new String[CANTIDAD_MAXIMA_DE_INTEGRANTES];
	}
	
	public String getNombre() {
		return this.nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadIntegrantes() {
		int cantidadIntegrantes = 0;
		for (int i = 0; i < this.integrantes.length; i++) {
			if(this.integrantes[i] != null ) {
				cantidadIntegrantes++;
			}
		}
		return cantidadIntegrantes;
	}
	
	public void agregarIntegrante(String nombreIntegrante) {
		int indexVacio;
		boolean existeIntegrante = existeIntegrante(nombreIntegrante);
		if(!existeIntegrante) {
			indexVacio= buscarEspacioNullEnArrayIntegrantes();
			if(indexVacio != -1) {
				this.integrantes[indexVacio]= nombreIntegrante;
				//System.out.println(nombreIntegrante + ", fue asignado al grupo: " + getNombre());
			}else {System.out.println("no hay espacio en array para agregar integrante");}
		}else {System.out.println("integrante ya existe");}
	}
	
	private boolean existeIntegrante(String nombreIntegrante) {
		int i= 0;
		boolean encontrado = false;
		while(!encontrado && i < this.integrantes.length) {
			if(this.integrantes[i] == nombreIntegrante) {
				encontrado = true;
			}
			i++;
		}
		
		return encontrado;
	}
	private int buscarEspacioNullEnArrayIntegrantes() {
		int indexVacio = -1;
		int i = 0;
		boolean encontrado = false;
		while(!encontrado && i < this.integrantes.length) {
			if(this.integrantes[i] == null) {
				encontrado = true;
				indexVacio = i;
			}
			i++;
		}
		return indexVacio;
	}
	
	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int posicion = -1;
		boolean encontrado = false;
		int i = 0;
		while(!encontrado && i < this.integrantes.length) {
			if(this.integrantes[i] == nombreIntegrante) {
				encontrado = true;
				posicion  = i+1;//ojo i es index y posicion es +1
			}
			i++;
		}
		
		return posicion;
	}
	
	public String obtenerIntegrante(int posicion) {
		String Integrante = null;
		
		if(posicion >= NRO_DONDE_EMPIEZA_POSICIONES && posicion <= CANTIDAD_MAXIMA_DE_INTEGRANTES) {
			int index = posicion-1;
			if(this.integrantes[index] != null) {
				Integrante = this.integrantes[index];
			}
			
		}
		return Integrante;
	}
	
	public String buscarIntegrante(String nombre) {
		String integranteEncontrado =  null;
		int posicion = obtenerPosicionIntegrante(nombre);
		if(posicion != -1) {
			integranteEncontrado = obtenerIntegrante(posicion);//OJO!index != posicion
			
		}
		return integranteEncontrado;
	}
	
	public String removerIntegrante(String nombreIntegrante) {
		String integranteRemovido = null;
		int posicion = obtenerPosicionIntegrante(nombreIntegrante);
		if(posicion != -1) {
			integranteRemovido = obtenerIntegrante(posicion);
			this.integrantes[posicion-1] = null;
			
		}
		return integranteRemovido;
	}
	
	private void mostrarIntegrantes() {
		String nombre = "";
		int cantidadIntegrantes = getCantidadIntegrantes();
		if(cantidadIntegrantes > 0 ) {
			System.out.println("cantidad de integrantes es " + cantidadIntegrantes );
			for (int i = 0; i < this.integrantes.length; i++) {
				if(this.integrantes[i] != null) {
					nombre = obtenerIntegrante(i+1);//ojo! index != posicion
					System.out.println((i+1)+ ".- " + nombre);
				}
			}
		}
	}
	public void mostrar() {
		System.out.println("Nombre de grupo: " + getNombre());
		if(getCantidadIntegrantes() != 0) {
			mostrarIntegrantes();
		}
		else {
			System.out.println("grupo vacío");
		}
	}
	
	public void vaciar() {
		for (int i = 0; i < this.integrantes.length; i++) {
			this.integrantes[i] = null;
		}
	}
	
}

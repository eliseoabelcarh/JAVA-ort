package clases;

public enum Marca {
	
	WHIRLPOOL ("Televisor")
	
	,PHILLIPS ("Lavarropa")
	
	,DREAN ("Heladera") ; 

	private String nombre;
	
	private Marca(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
}

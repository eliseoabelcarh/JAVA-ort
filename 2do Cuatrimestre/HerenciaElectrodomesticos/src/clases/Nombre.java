package clases;

public enum Nombre {

	TELEVISOR ("Televisor")
	
	,LAVARROPA ("Lavarropa")
	
	,HELADERA ("Heladera")
	
	,LICUADORA ("Licuadora") ; 

	private String nombre;
	
	private Nombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombreLeible() {
		return this.nombre;
	}
	
	
}

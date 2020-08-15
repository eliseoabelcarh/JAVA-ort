package clases;

public enum Habilidad {
	
	TRUCO1 (6, "'truco 1'"),
	TRUCO2 (8, "'truco 2'"),
	TRUCO3 (13, "'truco 3'");
	
	
	//ATRIBUTOS Y CONSTRUCTORES
	private float cantKilosNecesarios;
	private String nombre;
	
	private Habilidad(float cantKilosNecesarios, String nombre) {
		this.cantKilosNecesarios = cantKilosNecesarios;
		setNombre(nombre);
	}
	public String getNombre() {
		return this.nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getCantKilosNecesarios() {
		return this.cantKilosNecesarios;
	}
}

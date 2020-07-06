package clases;

public enum Alimento {

	CALAMARES	(0, "Calamares"),
	PULPOS		(0, "Pulpos"),
	CANGREJOS	(0, "Cangrejos");
	
	
	private float cant;
	private String nombre;
	
	private Alimento(float cant, String nombre) {
		setCant(cant);
		setNombre(nombre);
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}
	public Alimento setCant(float cant) {
		this.cant = cant;
		return this;
	}
	 public float getCant() {
		 return this.cant;
	 }
	
	 
}

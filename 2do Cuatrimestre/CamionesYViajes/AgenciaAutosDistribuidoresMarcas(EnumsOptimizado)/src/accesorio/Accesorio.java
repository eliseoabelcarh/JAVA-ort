package accesorio;

public class Accesorio {
	
	private int id;
	private String descripcion;
	private double precio;
	
	public Accesorio(int id, double precio) {
		
		this.id = id;
		this.descripcion = "desc";
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public double getPrecio() {
		return precio;
	}

	
	
	

}

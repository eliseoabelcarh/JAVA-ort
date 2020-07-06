package producto;

public abstract class Producto {

	private int id;
	private String desc;
	private double precio;
	private int cantStock;
	
	public Producto(int id, String desc, double precio, int cantStock) {
		
		this.id = id;
		this.desc = desc;
		this.precio = precio;
		this.cantStock = cantStock;
	}
	
	public abstract double calcularPrecio();
	

	public String getDesc() {
		return desc;
	}

	public int getId() {
		return id;
	}

	public double getPrecio() {
		return precio;
	}

	public int getCantStock() {
		return cantStock;
	}
	
	
	
}

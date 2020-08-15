package producto;

public class Bazar extends Producto {

	private String color;
	private int unidPorPaq;
	
	public Bazar(int id, String desc, double precio, int cantStock, String color, int unidPorPaq) {
		super(id, desc, precio, cantStock);
		this.color = color;
		this.unidPorPaq = unidPorPaq;
	}
	
	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

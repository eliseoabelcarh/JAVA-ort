package producto;

public class Electrodomestico extends Producto {
	
	private double consumo;
	
	public Electrodomestico(int id, String desc, double precio, int cantStock, double consumo) {
		super(id, desc, precio, cantStock);
		this.consumo = consumo;
	}

	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

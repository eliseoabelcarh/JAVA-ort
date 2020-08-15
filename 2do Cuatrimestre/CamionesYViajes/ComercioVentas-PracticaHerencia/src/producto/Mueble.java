package producto;

import sector.Sector;

public class Mueble extends Producto {
	
	private String material;
	Sector sector;

	public Mueble(int id, String desc, double precio, int cantStock) {
		super(id,desc,precio,cantStock);
	}
	
	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

}

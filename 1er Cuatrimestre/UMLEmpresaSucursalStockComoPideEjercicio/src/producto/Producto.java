package producto;

public class Producto {
	
	private String nombre;
	private int UnidadesEnStock;
	private int UnidadesVendidas;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public int getUnidadesEnStock() {
		return UnidadesEnStock;
	}

	public void incrementarUnidadesVendidas(int cant) {
		this.UnidadesVendidas =+ cant;
	}
	public void descontarDeStock(int cant) {
		this.UnidadesEnStock =-cant;
	}
	
	
}

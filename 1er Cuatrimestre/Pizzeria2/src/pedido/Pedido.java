package pedido;

public class Pedido {

	
	String producto;
	String tipo;
	String gusto;
	int cant;
	
	
	public Pedido(String producto, String tipo, String gusto, int cant) {
		super();
		this.producto = producto;
		this.tipo = tipo;
		this.gusto = gusto;
		this.cant = cant;
		
	}


	public String getProducto() {
		return producto;
	}


	public String getTipo() {
		return tipo;
	}


	public String getGusto() {
		return gusto;
	}


	public int getCant() {
		return cant;
	}


	@Override
	public String toString() {
		return "Pedido [producto=" + producto + ", tipo=" + tipo + ", gusto=" + gusto + ", cant=" + cant + "]";
	}
	
	
	
	
	
}

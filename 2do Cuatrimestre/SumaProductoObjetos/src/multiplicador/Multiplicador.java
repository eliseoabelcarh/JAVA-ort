package multiplicador;

public class Multiplicador {
	
	private Integer productoAcumulado;
	
	public Multiplicador() {
		this.productoAcumulado = new Integer(1);
	}

	public void acumularProducto(Integer numero) {
		this.productoAcumulado *= numero;
	}
	
	public String mostrarProductoAcumulado() {
		return this.productoAcumulado.toString();
	}
}

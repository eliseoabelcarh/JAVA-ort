package Clases;

public class Orden {

	private String id;
	private String detalleProblema;
	private Cliente cliente;
	
	public Orden(String id, Cliente cliente) {
		this.id = id;
		this.detalleProblema = "";
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Orden [id=" + id + ", detalleProblema=" + detalleProblema + ", cliente=" + cliente + "]";
	}

	public String getId() {
		return id;
	}
	
	
	
	
	
}

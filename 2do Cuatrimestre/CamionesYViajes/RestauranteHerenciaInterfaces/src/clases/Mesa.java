package clases;

public class Mesa {
	
	private int nro;
	private int cantCapacidadPersonas;
	private EstadoMesa estado;

	public int getNro() {
		return this.nro;
	}

	private EstadoMesa getEstado() {
		return estado;
	}

	public void setEstadoMesa(EstadoMesa estado) {
		this.estado = estado;
	}
	

}

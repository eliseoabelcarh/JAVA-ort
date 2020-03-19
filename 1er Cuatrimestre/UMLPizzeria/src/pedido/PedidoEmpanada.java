package pedido;

import java.util.ArrayList;
import empanada.Empanada;
import empanada.GustoEmp;
import empanada.TipoEmp;

public class PedidoEmpanada {

	private int cantidad;
	private TipoEmp tipo;
	private GustoEmp gusto;
	
	
	public PedidoEmpanada(int cantidad, TipoEmp tipo, GustoEmp gusto) {
		super();
		this.cantidad = cantidad;
		this.tipo = tipo;
		this.gusto = gusto;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public TipoEmp getTipo() {
		return tipo;
	}


	public void setTipo(TipoEmp tipo) {
		this.tipo = tipo;
	}


	public GustoEmp getGusto() {
		return gusto;
	}


	public void setGusto(GustoEmp gusto) {
		this.gusto = gusto;
	}


	@Override
	public String toString() {
		return "PedidoEmpanada [cantidad=" + cantidad + ", tipo=" + tipo + ", gusto=" + gusto + "]";
	}
	
	
	
	
}

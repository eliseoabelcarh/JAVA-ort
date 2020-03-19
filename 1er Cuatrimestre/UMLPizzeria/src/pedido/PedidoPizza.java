package pedido;
import pizza.Pizza;
import pizza.GustoPizza;
import pizza.TipoPizza;



public class PedidoPizza {

	private int cantidad;
	private TipoPizza tipo;
	private GustoPizza gusto;
	
	public PedidoPizza(int cantidad, TipoPizza tipo, GustoPizza gusto) {
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
	public TipoPizza getTipo() {
		return tipo;
	}
	public void setTipo(TipoPizza tipo) {
		this.tipo = tipo;
	}
	public GustoPizza getGusto() {
		return gusto;
	}
	public void setGusto(GustoPizza gusto) {
		this.gusto = gusto;
	}
	@Override
	public String toString() {
		return "PedidoPizza [cantidad=" + cantidad + ", tipo=" + tipo + ", gusto=" + gusto + "]";
	}
	
	
	
}

package pedido;

import java.util.ArrayList;

public class Pedido {
	
	private String estadoDePedido;
	private ArrayList<PedidoEmpanada> pedidoEmpanadas;
	private ArrayList<PedidoPizza> pedidoPizzas;

	
	public Pedido() {
		this.estadoDePedido="No entregado";
		pedidoEmpanadas=new ArrayList<PedidoEmpanada>();
		pedidoPizzas=new ArrayList<PedidoPizza> ();
	}
	
	public void agregarPedidoEmpanada(PedidoEmpanada pedidoEmpanada) {
		this.pedidoEmpanadas.add(pedidoEmpanada);
	}
	public void agregarPedidoPizza(PedidoPizza pedidoPizza) {
		this.pedidoPizzas.add(pedidoPizza);
	}

	public ArrayList<PedidoEmpanada> getPedidoEmpanadas() {
		return pedidoEmpanadas;
	}

	public void setPedidoEmpanadas(ArrayList<PedidoEmpanada> pedidoEmpanadas) {
		this.pedidoEmpanadas = pedidoEmpanadas;
	}

	public ArrayList<PedidoPizza> getPedidoPizzas() {
		return pedidoPizzas;
	}

	public void setPedidoPizzas(ArrayList<PedidoPizza> pedidoPizzas) {
		this.pedidoPizzas = pedidoPizzas;
	}

	
	
	public String getEstadoDePedido() {
		return estadoDePedido;
	}

	public void setEstadoDePedido(String estadoDePedido) {
		this.estadoDePedido = estadoDePedido;
	}

	@Override
	public String toString() {
		return "Pedido [estadoDePedido=" + estadoDePedido + ", pedidoEmpanadas=" + pedidoEmpanadas + ", pedidoPizzas="
				+ pedidoPizzas + "]";
	}

	
	
	
}

package carrito;

import java.util.ArrayList;
import cliente.Cliente;
import pedido.Pedido;


public class Carrito {
	
	 private ArrayList<Pedido> pedidos;
	
	
	public Carrito() {
		super();
		this.pedidos= new ArrayList<Pedido>();
		
		
	}

	public void addPedidos(Pedido pedido) {
		this.pedidos.add(pedido);
	}

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	
	public void clearCarrito() {
		this.pedidos.clear();
	}

	@Override
	public String toString() {
		return "Carrito [pedidos=" + pedidos + "]";
	}

	
}

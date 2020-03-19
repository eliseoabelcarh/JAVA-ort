package carrito;

import java.util.ArrayList;
import pedido.Pedido;


public class Carrito {
	
	ArrayList<Pedido> pedidos;
	
	public Carrito() {
		pedidos= new ArrayList<Pedido>();
	}
	
	public void AddPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public void mostrarPedidos() {
		for(int i=0;i<pedidos.size();i++) {
			System.out.println("pedido indexnro" +i);
			System.out.println(pedidos.get(i).toString());
		}
		
	}
	
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void vaciarCarrito() {
		pedidos.clear();
		System.out.println("carrito boorrado");
		}
	}
	
	



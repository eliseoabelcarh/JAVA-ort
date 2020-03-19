package principal;

import carrito.Carrito;
import cliente.Cliente;
import pedido.Pedido;
import pizzeria.Pizzeria;

public class Principal {

	public static void main(String[] args) {
		
		Pizzeria pizzeria = new Pizzeria("la pizzeria");
		Cliente cliente = new Cliente("jose");
		cliente.AddCarrito("pizza", "piedra", "cebolla", 1);
		cliente.AddCarrito("pizza", "horno", "carne", 2);
		cliente.AddCarrito("empanada", "frita", "verdura", 1);
		
		cliente.getCarrito().mostrarPedidos();
		pizzeria.MandarAPreparar(cliente);
		
		
		cliente.getBolsa().mostrarContenido();
		
		cliente.getCarrito().mostrarPedidos();
		
		
	}
	
}

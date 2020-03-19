package principal;
import bolsa.Bolsa;
import carrito.Carrito;
import cliente.Cliente;
import cocina.Cocina;
import empanada.Empanada;
import pedido.Pedido;
import pizza.Pizza;
import pizzeria.Pizzeria;


public class Principal {

	public static void main(String[] args) {

		Pizzeria pizzeria = new Pizzeria("la pizzeria");
		Cliente cliente = new Cliente ("carlos", pizzeria);
		
		Pedido pedido1;
		pedido1=cliente.crearPedido("pizza","horno", "verdura", 2);
		cliente.addToCart(pedido1);
		
		Pedido pedido2;
		pedido2=cliente.crearPedido("empanada","frita", "jamon", 3);
		cliente.addToCart(pedido2);
		
		System.out.println(cliente.getCarrito().toString());
		System.out.println(cliente.getBolsa().toString());
		System.out.println(pizzeria.getCocina().getBolsa().toString());
		
		cliente.pedirAhora();
		pizzeria.prepararPedido(cliente);
			
		//cliente.getBolsa().mostrarContenidoBolsa();
		System.out.println(cliente.getCarrito().toString());
		System.out.println(cliente.getBolsa().toString());
		System.out.println(pizzeria.getCocina().getBolsa().toString());
	}

}

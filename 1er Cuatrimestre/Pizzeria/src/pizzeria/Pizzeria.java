package pizzeria;
import java.util.ArrayList;
import cliente.Cliente;
import cocina.Cocina;
import carrito.Carrito;
import bolsa.Bolsa;

public class Pizzeria {
	String nombre;
	ArrayList<Cliente> clientes;
	Cocina cocina;
	
	
	
	public Pizzeria(String nombre) {
		super();
		this.nombre = nombre;
		Cocina cocina = new Cocina();
		this.cocina= cocina;
		clientes= new ArrayList<Cliente>();
	}



	public void MandarAPreparar(Cliente cliente) {
		clientes.add(cliente);
		Carrito carrito;
		Bolsa bolsa;
		carrito= cliente.getCarrito();
				
		cocina.cocinar(carrito);
		bolsa=cocina.getBolsa();
		System.out.println("tengo bolsa con pedido listo");
		
		cliente.setBolsa(bolsa);
		System.out.println("seteo bolsa al cliente");
		cliente.getCarrito().vaciarCarrito();
		
	}

}

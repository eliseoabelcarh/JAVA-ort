package pizzeria;
import cliente.Cliente;
import java.util.ArrayList;
import cocina.Cocina;
import bolsa.Bolsa;

public class Pizzeria {
	
	String nombre;
	ArrayList<Cliente>clientes;
	Cocina cocina;

	public Pizzeria (String nombre) {
		super();
		this.nombre=nombre;
		this.clientes= new ArrayList<Cliente>();
		Cocina cocina = new Cocina();
		this.cocina=cocina;
		
	}
	
	public void addClientes(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void prepararPedido(Cliente cliente) {
		if(cliente.getCarrito() != null) {
			Bolsa bolsa;
			bolsa=this.cocina.cocinar(cliente.getCarrito());
			cliente.getCarrito().clearCarrito();
			this.cocina.setBolsaNueva();
			cliente.setBolsa(bolsa);
			System.out.println("cliente ya tiene su bolsa");
			
		}
	}

	public Cocina getCocina() {
		return cocina;
	}
	
	
	
}

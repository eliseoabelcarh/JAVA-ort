package pizzeria;
import cliente.Cliente;
import java.util.ArrayList;
import pedido.Pedido;
import pedido.PedidoEmpanada;
import pedido.PedidoPizza;
import empanada.Empanada;
import empanada.TipoEmp;
import empanada.GustoEmp;
import pizza.Pizza;
import pizza.TipoPizza;
import pizza.GustoPizza;
import comida.Comida;

public class Pizzeria {
	
	private ArrayList<Cliente> clientes;
	
	public Pizzeria() {
		clientes =  new ArrayList<Cliente> ();
	}

	public Pedido crearPedido() {
		Pedido pedido = new Pedido();
		return pedido;
	}
	public PedidoEmpanada crearPedidoEmpanada(int cantidad, TipoEmp tipo, GustoEmp gusto) {
		return(new PedidoEmpanada(cantidad, tipo, gusto));
	}
	public PedidoPizza crearPedidoPizza(int cantidad, TipoPizza tipo, GustoPizza gusto) {
		return (new PedidoPizza(cantidad, tipo, gusto));
	}
	
	public Comida mandarAPreparar(Pedido pedido) {
		
		Comida comida = new Comida();
		if (pedido != null && pedido.getEstadoDePedido().equals("No entregado")) {
			
			ArrayList<PedidoEmpanada> pedidosEmpanadas;
			pedidosEmpanadas = pedido.getPedidoEmpanadas();//ojo con el array acá
			for (PedidoEmpanada pedidoEmpanada: pedidosEmpanadas) {
				int cant;
				cant=pedidoEmpanada.getCantidad();
				GustoEmp gusto;
				gusto=pedidoEmpanada.getGusto();
				TipoEmp tipo;
				tipo= pedidoEmpanada.getTipo();
				
				int i=0;
				while(i<cant) {
					Empanada empanada= new Empanada(tipo, gusto);
					comida.getEmpanadas().add(empanada);//TODO remover de pedidos
					i++;
				}
			}
			ArrayList<PedidoPizza> pedidosPizzas;
			pedidosPizzas=pedido.getPedidoPizzas();
			for(PedidoPizza pedidoPizza: pedidosPizzas) {
				int cant;
				cant=pedidoPizza.getCantidad();
				GustoPizza gusto;
				gusto=pedidoPizza.getGusto();
				TipoPizza tipo;
				tipo=pedidoPizza.getTipo();
				int i=0;
				while(i<cant) {
					Pizza pizza = new Pizza(tipo, gusto);
					comida.getPizzas().add(pizza);// TODO remover de pedidos
					i++;
				}
			}
			
			
		pedido.setEstadoDePedido("Pedido Entregado");
		
		}
		return comida;
	}
	
	public Empanada prepararEmpanada(TipoEmp tipo, GustoEmp gusto) {
		Empanada empanada = new Empanada(tipo, gusto);
		return empanada;
	}
	public Pizza prepararPizza(TipoPizza tipo, GustoPizza gusto) {
		Pizza pizza = new Pizza(tipo, gusto);
		return pizza;
	}
	
	public void crearCliente(String dniCliente) {
		Cliente cliente = new Cliente (dniCliente);// TODO filtrar si existe o crearlo
		this.clientes.add(cliente);
	}
}

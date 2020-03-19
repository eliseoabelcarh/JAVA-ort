package cliente;
import bolsa.Bolsa;
import carrito.Carrito;
import pedido.Pedido;
import pizzeria.Pizzeria;

public class Cliente {
	
	private String nombre;
	private Carrito carrito;
	private Bolsa bolsa;
	private Pizzeria pizzeria;
	
	public Cliente(String nombre, Pizzeria pizzeria) {
		super();
		this.nombre = nombre;
		this.pizzeria=pizzeria;
		Carrito carrito = new Carrito();
		this.carrito= carrito;
		Bolsa bolsa = new Bolsa();
		this.bolsa= bolsa;
		
	}

	public Pedido crearPedido(String producto,String tipo, String gusto,int cant) {
		Pedido pedido  = new Pedido(producto,tipo,gusto,cant);
		return pedido;
		
	}
	
	public void addToCart(Pedido pedido) {
		this.carrito.addPedidos(pedido);
	}
	
	public void pedirAhora() {
		this.pizzeria.addClientes(this);
	}

	public Carrito getCarrito() {
		return carrito;
	}
	
	public void setBolsa(Bolsa bolsa) {
		this.bolsa=bolsa;
	}
	public void comer() {
		this.bolsa=null;
	}

	public Bolsa getBolsa() {
		return bolsa;
	}

	
}

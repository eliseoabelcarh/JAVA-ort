package cliente;

import java.util.ArrayList;
import bolsa.Bolsa;
import carrito.Carrito;
import pedido.Pedido;


public class Cliente {
	
	String nombre;
	Carrito carrito;
	Bolsa bolsa;
	
	
	public Cliente(String nombre) {
		super();
		Carrito carrito = new Carrito();
		this.carrito=carrito;
		this.nombre=nombre;
		bolsa=new Bolsa();
		//bolsas= new ArrayList<Bolsa>();
		
		
		
	}
	
	public void AddCarrito(String producto, String tipo, String gusto, int cant) {
		
		Pedido pedido;
		pedido=new Pedido(producto, tipo, gusto, cant);
		carrito.AddPedido(pedido);
		
		
		
	}
	public Carrito getCarrito() {
		return this.carrito;
	}
	
	public void setBolsa(Bolsa bolsa) {
		this.bolsa = bolsa;
	}

	public Bolsa getBolsa() {
		return bolsa;
	}

	
	

}

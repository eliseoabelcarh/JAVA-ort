package clases;

import java.util.ArrayList;

public class Pedido {
	
	
	private int nroPedido;
	private Mesa mesa; 
	private Mozo mozo;
	private Cocinero cocinero;
	private ArrayList<Producto> productos;
	private EstadoPedido estadoPedido;
	
	public Pedido(int nroPedido, Mesa mesa, Mozo mozo, Cocinero cocinero, ArrayList<Producto> productos) {
		this.nroPedido = nroPedido;
		this.mesa = mesa;
		this.mozo = mozo;
		this.cocinero = cocinero;
		this.productos = productos;
		this.estadoPedido = EstadoPedido.ABIERTO;
	}

	public boolean estaCerrado() {
		boolean result;
		if(this.estadoPedido == EstadoPedido.ABIERTO) {
			result = false;
		}
		else {
			result = true;
		}
		return result;
	}

	public Cocinero getCocinero() {
		return this.cocinero;
	}

	public int getNroMesa() {
		return this.mesa.getNro();
	}

	public double calcularImportePagar() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Mesa getMesa() {
		return this.mesa;
	}

	public void setEstadoPedido(EstadoPedido estado) {
		this.estadoPedido = estado;
		
	}
	
	

}

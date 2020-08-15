package pedido;
import java.util.ArrayList;

import cliente.Cliente;
import producto.Producto;
import sucursal.Sucursal;

public class Pedido {

	private int tipo;
	private Sucursal sucursal;
	private ArrayList<Producto> productos;
	private Cliente cliente;
	
	public Pedido(int tipo, Sucursal sucursal,Cliente cliente) {
		super();
		this.tipo = tipo;
		this.sucursal = sucursal;
		this.productos = new ArrayList<Producto>();
		this.cliente = cliente;
	}
	
	public double calcularPrecioTotal() {
		double precioTotal  =0;
		for (int i = 0; i < this.productos.size(); i++) {
			Producto producto = this.productos.get(i);
			precioTotal += producto.getPrecio();
		}
		double dscto = (precioTotal += this.cliente.getDscto());
		double impuesto = this.sucursal.calcularImpuesto();
		return (precioTotal + dscto + impuesto);
	}

	public int getTipo() {
		return tipo;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
}

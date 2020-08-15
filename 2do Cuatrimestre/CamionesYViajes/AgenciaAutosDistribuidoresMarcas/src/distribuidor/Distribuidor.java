package distribuidor;

import java.util.ArrayList;

import agencia.Agencia;
import pedido.Pedido;

public class Distribuidor {
	
	private Agencia agencia;
	private String nombre;
	private double comision;
	private ArrayList<Pedido> pedidos;
	
	public Distribuidor(String nombre, Agencia agencia) {

		this.nombre = nombre;
		this.comision = 0.1;
		this.pedidos = new ArrayList<Pedido>();
		this.agencia = agencia;
	}
	
	public void crearPedido(int nro, int idMarca, String modeloAuto) {
		Pedido pedido = new Pedido(nro, this.getNombre(), idMarca, modeloAuto);
		this.pedidos.add(pedido);
	}
	public String getNombre() {
		return nombre;
	}

	public double devolverValorPedido(int nroPedido) {
		double precioDelPedido = -1;
		Pedido pedidoBuscado = devolverPedido(nroPedido);
		if(pedidoBuscado != null) {
			precioDelPedido = calcularTotal(pedidoBuscado);
		}
		return precioDelPedido;
	}
	public Pedido devolverPedido(int nroPedido) {
		Pedido pedidoBuscado = null;
		boolean encontrado = false;
		int i = 0;
		while(!encontrado && i < this.pedidos.size()) {
			if(this.pedidos.get(i).getNro() == nroPedido ) {
				pedidoBuscado = this.pedidos.get(i);
				encontrado =true;
			}
			i++;
		}
		return pedidoBuscado;
	}
	 public double calcularTotal(Pedido pedido) {
		 double total = 0;
		 double precioAccesorios = pedido.devolverPrecioAccesorios();
		 String modeloAuto = pedido.getModeloAuto();
		 double precioAuto = this.agencia.getPrecioAuto(modeloAuto);
		 total = precioAccesorios + precioAuto;
		 return total;
	 }
	
	public int getCantidadPedidos() {
		return this.pedidos.size();
	}
	
	public int[] getCantidadPedidosPorMarca() {
		int [] vector  = new int [5];
		for (int i = 0; i < this.pedidos.size(); i++) {
			int indexMarca = this.pedidos.get(i).devolverIndexMarca();
			vector[indexMarca]++;
		}
		return vector;
	}
	
}

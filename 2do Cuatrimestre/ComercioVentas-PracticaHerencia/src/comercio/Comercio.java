package comercio;

import java.lang.reflect.Array;
import java.util.ArrayList;

import cliente.Cliente;
import cliente.Mayorista;
import pedido.Pedido;
import producto.Producto;
import sucursal.Sucursal;

public class Comercio {

	private int cuit;
	private String razonSocial;
	private Sucursal[] sucursales;
	private ArrayList<Cliente> clientes;
	private ArrayList<Pedido> pedidos;
	
	public Comercio (int cuit, String razonSocial) {
		this.cuit = cuit;
		this.razonSocial =  razonSocial;
		this.sucursales = new Sucursal[10];
		this.clientes = new ArrayList<Cliente>();
		this.pedidos = new ArrayList<Pedido>();
	}
	
	public double calcularPrecioPedido(Pedido pedido) {
		double precioTotal = pedido.calcularPrecioTotal();
		return precioTotal;
	}
	 private ArrayList<Producto> devolverProdsPorAgotarDeTodasSucursales(){
		 ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		 for (int i = 0; i < this.sucursales.length; i++) {
			Sucursal sucursal = this.sucursales[i];
			if(sucursal != null) {
				ArrayList<Producto> prodsXAgotar = sucursal.devolverProductosPorAgotar();
				for (int x = 0; x < prodsXAgotar.size(); x++) {
					listaProductos.add(prodsXAgotar.get(x));
				}
			}
		}
		 return listaProductos;
	 }
	
	 public void mostrarProductosStockPorAgotar() {
		 ArrayList<Producto> listaProds  = devolverProdsPorAgotarDeTodasSucursales();
		 for (int i = 0; i < listaProds.size(); i++) {
			Producto producto = listaProds.get(i);
			String descripcionProd = producto.getDesc();
			System.out.println(descripcionProd);
		}
	 }
	 private ArrayList<Mayorista> devolverClientesMayoristas(){
		 ArrayList<Mayorista> listaMayoristas  = new ArrayList<Mayorista>();
		 for (int i = 0; i < this.clientes.size(); i++) {
			if(this.clientes.get(i) instanceof Mayorista) {
				listaMayoristas.add((Mayorista) this.clientes.get(i));
			}
		}
		 return listaMayoristas;
	 }
	 
	 public void mostrarPromedioComprasAnualDeMayoristas() {
		 ArrayList<Mayorista> listaMayoristas = devolverClientesMayoristas();
		 double promedioGlobal = 0;
		 double acumulado = 0;
		 int cantidadClientes  = listaMayoristas.size();
		 for (int i = 0; i < listaMayoristas.size(); i++) {
			double promedioCliente = listaMayoristas.get(i).getPromDeCompraAnual() ;
			acumulado += promedioCliente;
		}
		 if(cantidadClientes != 0) {
			 promedioGlobal  = acumulado / cantidadClientes;
		 }
		 System.out.println("el promedio global es " + promedioGlobal);
	 }
	
	 private int[][] devolverCantPedidosXTipoYSucursal() {
		 int[][] matriz = new int[10][2];
		 for (int i = 0; i < this.pedidos.size(); i++) {
			int indexSuc =devolverIndexSucursal(this.pedidos.get(i).getSucursal());
			if(indexSuc != -1) {
				int indexTipoPedido = this.pedidos.get(i).getTipo() - 1;
				matriz[indexSuc][indexTipoPedido]++;	
			}
		}
		 return matriz;
	 }
	 
	 private int devolverIndexSucursal(Sucursal sucursal) {
		 int indexSuc = -1;
		 int i = 0;
		 boolean encontrado  = false;
		 while(!encontrado && i < this.sucursales.length) {
			 if(this.sucursales[i] == sucursal) {
				 indexSuc = i;
				 encontrado = true;
			 }
			 i++;
		 }
		 return indexSuc;
	 }
	 public void mostrarCantPedidosXTipoYSucursal() {
		 int[][] matriz = devolverCantPedidosXTipoYSucursal();
		 for (int i = 0; i < matriz.length; i++) {
			if(matriz[i] != null) {
				Sucursal sucursal = devolverSucursal(i);
				if(sucursal != null) {
					String codigoSuc = sucursal.getCodigo();
					System.out.println("Para sucursal codigo " + codigoSuc );
					for (int x = 0; x < matriz[i].length; x++) {
						int tipoPedido = x+ 1;
						System.out.println("pedido tipo " + tipoPedido + " hay " + matriz[i][x] + " pedidos");
					}	
				}
			}
		}
	 }
	 private Sucursal devolverSucursal(int i) {
		 return this.sucursales[i];
	 }
	 
	 
	 
	 
	 
	 
	 
	 
}

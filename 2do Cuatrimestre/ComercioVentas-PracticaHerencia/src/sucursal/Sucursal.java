package sucursal;

import java.util.ArrayList;

import producto.Producto;

public abstract class Sucursal {

	private String codigo;
	private String desc;
	ArrayList<Producto> productos;
	
	public Sucursal(String codigo, String desc) {
		this.codigo = codigo;
		this.desc = desc;
		this.productos =  new ArrayList<Producto>();
	}
	
	//clase abstracta
	public abstract double calcularImpuesto();
	
	
	public ArrayList<Producto> devolverProductosPorAgotar() {
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		//agregar 
		return listaProductos;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDesc() {
		return desc;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}
	

	
	
	
	
}

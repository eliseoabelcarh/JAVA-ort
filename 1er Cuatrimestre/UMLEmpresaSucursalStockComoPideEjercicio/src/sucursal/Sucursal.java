package sucursal;
import java.util.ArrayList;
import producto.Producto;
import sucursal.Sucursal;


public class Sucursal {
	
	private String nombre;
	private ArrayList<Producto> productos;
	private ArrayList<Sucursal> sucursalesCercanas;
	

	public String vender(Producto producto , int cantidad){
		
		String result=" ";
		
		boolean hayStockSuficiente;
		hayStockSuficiente=hayStockSuficiente(producto,cantidad);
		
		if(!hayStockSuficiente) {
			
			Sucursal sucursalConStock;
			sucursalConStock=consultarporStockOtrasSucursales(producto, cantidad);
			
			if(sucursalConStock == null) {result= "no hay stock acá ni en alguna sucursal cercana";}
			else {result="El producto que desea adquirir se encuentra en la Sucursal " + sucursalConStock.getNombre();}
			
		}
		else {registrarVenta(producto, cantidad);result="Venta Realizada";}
		
		return result;
	}
	

	
	private boolean hayStockSuficiente(Producto producto, int cantidad) {
		boolean result=false;
		if(producto.getUnidadesEnStock() >= cantidad) {result=true;}
		return result;
	}
	
	
	
	private void registrarVenta(Producto producto, int cantidad) {
		producto.incrementarUnidadesVendidas(cantidad);
		producto.descontarDeStock(cantidad);
	}
	
	public Sucursal consultarporStockOtrasSucursales(Producto producto , int cant) {
		Sucursal sucursalBuscada=null;
		int i=0;
		boolean encontrado= false;
		
		while(i < this.sucursalesCercanas.size() && !encontrado) {
			if(sucursalesCercanas.get(i).hayStockSuficiente(producto, cant)) {
				sucursalBuscada=sucursalesCercanas.get(i);
				encontrado=true;
			}
		}
		return sucursalBuscada;
	}



	public String getNombre() {
		return nombre;
	}
	
	
}

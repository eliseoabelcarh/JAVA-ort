package auto;
import java.util.ArrayList;
import accesorio.Accesorio;

public class Auto {
	
	private int idMarca;
	private String modelo;
	private String descripcion;
	private int stock;
	private double precio;
	private ArrayList<Accesorio> accesorios;
	
	public Auto(int idMarca, String modelo, double precio) {
		
		this.idMarca = idMarca;
		this.modelo = modelo;
		this.descripcion = "";
		this.stock = 10;
		this.precio = precio;
		this.accesorios = new ArrayList<Accesorio>();
		
		
		accesorios.add(new Accesorio(1111, 450));
		accesorios.add(new Accesorio(2222, 600));
		accesorios.add(new Accesorio(3333, 100));
		accesorios.add(new Accesorio(4444, 350));
		
		
	}

	public double getPrecio() {
		return precio;
	}

	public String getModelo() {
		return modelo;
	}

}

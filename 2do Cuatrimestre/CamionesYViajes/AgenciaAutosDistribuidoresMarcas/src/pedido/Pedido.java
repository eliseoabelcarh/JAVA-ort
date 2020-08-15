package pedido;
import accesorio.Accesorio;
import java.util.ArrayList;

public class Pedido {
	
	private int nro;
	private String fecha;
	private String nombreDistribuidor;
	private int idMarca;
	private String modeloAuto;
	private ArrayList<Accesorio> accesorios;
	
		
	public Pedido(int nro, String nombreDistribuidor, int idMarca, String modeloAuto) {
		
		this.nro = nro;
		this.fecha = "fehcha";
		this.nombreDistribuidor = nombreDistribuidor;
		this.idMarca = idMarca;
		this.modeloAuto = modeloAuto;
		this.accesorios = new ArrayList<Accesorio>();
	}

	public int getNro() {
		return nro;
	}
	
	public String getNombreDistribuidor() {
		return nombreDistribuidor;
	}
	
	public int devolverIndexMarca() {
		return this.idMarca-1;
	}
	public int getIdMarca() {
		return idMarca;
	}
	
	public ArrayList<Accesorio> getAccesorios() {
		return accesorios;
	}
	 


	 public String getModeloAuto() {
		return modeloAuto;
	}

	public double devolverPrecioAccesorios() {
		 double total =0;
		 for (int i = 0; i < this.accesorios.size(); i++) {
			total += this.accesorios.get(i).getPrecio();
		}
		 return total;
	 }
	
	

}

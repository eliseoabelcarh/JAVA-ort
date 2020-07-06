package cliente;

public class Mayorista extends Cliente{
	
	private double promDeCompraAnual;

	public Mayorista(int id, String razonSocial, double dscto, double promCompraAnual) {
		super(id, razonSocial,dscto);
		this.promDeCompraAnual = promCompraAnual;
	
	}

	public double getPromDeCompraAnual() {
		return promDeCompraAnual;
	}
	
	

}

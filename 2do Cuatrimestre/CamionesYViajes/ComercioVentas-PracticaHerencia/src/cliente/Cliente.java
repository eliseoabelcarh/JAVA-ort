package cliente;

public class Cliente {
	
	private int id; 
	private String razonSocial;
	private double dscto;
	
	public Cliente(int id, String razonSocial, double dscto) {
	
		this.id = id;
		this.razonSocial = razonSocial;
		this.dscto = dscto;
	}

	public int getId() {
		return id;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public double getDscto() {
		return dscto;
	}

	
	
}

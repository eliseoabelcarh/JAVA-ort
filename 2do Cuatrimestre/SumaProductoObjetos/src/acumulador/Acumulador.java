package acumulador;

public class Acumulador {
	
	private Integer valorAcumulado;
	
	public Acumulador() {
		this.valorAcumulado = new Integer(0);
	}
	
	public void acumular(Integer numero) {
		this.valorAcumulado += numero;
	}

	public String mostrarValorAcumulado() {
		return this.valorAcumulado.toString();
	}
}

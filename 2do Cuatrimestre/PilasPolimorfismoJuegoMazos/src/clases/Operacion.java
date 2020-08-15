package clases;

public class Operacion {
	
	private int nc;//NUMERO DE CONJUNTO
	private Tipo tipo;//DERECHA IZQUIERDA O ELIMINA
	private int n; //CANTIDAD DE CARTAS A MOVER
	private boolean valido;
	
	
	
	
	
	public Operacion(int nc, Tipo tipo, int n) {
		this.nc = nc;
		this.tipo = tipo;
		this.n = n;
		valido = false;
	}
	public int getNc() {
		return nc;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public int getN() {
		return n;
	}
	public void setValido(boolean b) {
		this.valido = b;	
	}
	@Override
	public String toString() {
		return "Operacion [nc=" + nc + ", tipo=" + tipo + ", n=" + n + ", valido=" + valido + "]";
	}
	

}

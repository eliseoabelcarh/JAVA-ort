package variasTarjetaCreditoUnaPersona;


import java.util.ArrayList;

public class TarjetaCredito {
	
	private String numero;
	private Persona persona;
	private double limiteDeCompra;
	private double disponible;
	private ArrayList<Gastos> listaGastos = new ArrayList<Gastos>();
	
	
	
	//constructor
	public TarjetaCredito(String numero, double limiteCompra) {
		this.numero= numero;
		this.limiteDeCompra = limiteCompra;
	}
	
	
	//métodos
	public void addDuenio(Persona persona) {
		this.persona= persona;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public double getLimiteDeCompra() {
		return this.limiteDeCompra;
	}
	
	public double getGastosActuales() {
		double acum=0;
		for(int i=0; i<listaGastos.size();i++) {
			acum += listaGastos.get(i).getPrecio();
		}
		return acum;
	}
	
	private void actualizarDisponible() {
		if(getGastosActuales()>getLimiteDeCompra()) {
			this.disponible=0;
		}else {
		this.disponible=getLimiteDeCompra()-(getGastosActuales());}
	}
	public void cambiarLimiteDeCompra(double nuevoLimite) {
		this.limiteDeCompra= nuevoLimite;
	}
	
	public double getDisponible() {
		actualizarDisponible();
		return this.disponible;
	}
	
	public void addGasto(Gastos nuevoGasto) {
		listaGastos.add(nuevoGasto);
	}


	
	public String mostrarDatos() {
		String duenio=persona.getNombre();
		double limit=this.getLimiteDeCompra();
		double disp=this.getDisponible();
		double gast=this.getGastosActuales() ;
		return "TarjetaCredito [numero=" + numero + ", dueño=" + duenio + ", limiteDeCompra=" + limit
				+ ", disponible=" + disp + ", GastosTotal=" + gast + "]";
	}
	
	
	public void mostrarListaGastos() {
		for(int i=0; i<listaGastos.size();i++) {
			System.out.println( (i+1)+".- " + listaGastos.get(i).getConcepto()+ " - " + listaGastos.get(i).getPrecio());
		}
	}
	
	

}

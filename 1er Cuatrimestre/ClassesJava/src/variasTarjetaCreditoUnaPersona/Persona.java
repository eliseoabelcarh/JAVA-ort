package variasTarjetaCreditoUnaPersona;

import java.util.ArrayList;

public class Persona {
	
	private String nombre;
	private ArrayList <TarjetaCredito> tarjetas = new ArrayList<TarjetaCredito>();
	
	
	
	//constructor
	public Persona(String nombre){
		this.nombre=nombre;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void addTarjeta(TarjetaCredito nuevaTarjeta) {
		tarjetas.add(nuevaTarjeta);
	}
	
	public void mostrarTarjetas() {
		for(int i=0 ; i<tarjetas.size() ; i++ ) {
			System.out.println(tarjetas.get(i).getNumero());
		}
	}
	
	public void comprar(TarjetaCredito tarjeta, String concepto, double precio ) {
		Gastos gasto = new Gastos (concepto,precio);
		tarjeta.addGasto(gasto);
	}

}

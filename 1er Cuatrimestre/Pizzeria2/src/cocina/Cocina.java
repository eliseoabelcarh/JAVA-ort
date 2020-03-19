package cocina;

import java.util.ArrayList;
import pizza.Pizza;
import empanada.Empanada;
import carrito.Carrito;
import bolsa.Bolsa;

public class Cocina {

	ArrayList<Pizza> pizzas;
	ArrayList<Empanada> empanadas;
	Bolsa bolsa;
	

	
	public Cocina() {
		super();
		Bolsa bolsa = new Bolsa ();
		this.bolsa=bolsa;
		this.pizzas= new ArrayList<Pizza>();
		this.empanadas= new ArrayList<Empanada>();
	}
	
	public Bolsa cocinar(Carrito carrito) {
		String producto;
		int cant;
		String tipo;
		String gusto;
		
		for(int i=0; i<carrito.getPedidos().size();i++ ) {
		producto=carrito.getPedidos().get(i).getProducto();
		cant=carrito.getPedidos().get(i).getCant();
		tipo=carrito.getPedidos().get(i).getTipo();
		gusto= carrito.getPedidos().get(i).getGusto();
		
		switch(producto) {
		case "pizza" : for(int j=0; j<cant;j++) {
						Pizza pizza;
						pizza= this.prepararPizza(tipo, gusto);
						this.bolsa.addPizzas(pizza);
						}
			break;
		case "empanada" : for (int h =0; h<cant; h++) {
						Empanada empanada;
						empanada= this.prepararEmpanada(tipo, gusto);
						this.bolsa.addEmpanadas(empanada);
						}
			break;
			
		default: System.out.println("no coinciden productos");
		
						}
		
				}	
		
		return this.bolsa;
	}
	
	
	public Pizza prepararPizza(String tipo,String gusto) {
		Pizza pizza=new Pizza(tipo, gusto);		
		return pizza;
	}
	
	public Empanada prepararEmpanada(String tipo,String gusto) {
		Empanada empanada= new Empanada(tipo,gusto);
		return empanada;
	}

	public Bolsa getBolsa() {
		return bolsa;
	}

	public void setBolsaNueva() {
		Bolsa bolsa = new Bolsa();
		this.bolsa = bolsa;//verififcar si no tira error
	}
	
	
}

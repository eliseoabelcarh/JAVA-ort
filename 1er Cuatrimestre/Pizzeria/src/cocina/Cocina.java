package cocina;

import java.util.ArrayList;
import bolsa.Bolsa;
import carrito.Carrito;
import pizza.Pizza;
import empanada.Empanada;

public class Cocina {
	

	//ArrayList<Bolsa> bolsas;
	Bolsa bolsa;
	

	
	public Cocina(){
		bolsa = new Bolsa();
		//bolsas= new ArrayList<Bolsa>();
	}
	
	public void cocinar(Carrito carrito) {
		String producto;
		String tipo;
		String gusto;
		int cant;
		//Bolsa bolsa=null;
		
		System.out.println("entramos a cocinar");
		
		for(int i=0; i< carrito.getPedidos().size();i++ ) {
		producto= carrito.getPedidos().get(i).getProducto();
		tipo=carrito.getPedidos().get(i).getTipo();
		gusto= carrito.getPedidos().get(i).getGusto();
		cant= carrito.getPedidos().get(i).getCant();
		
		switch(producto) {
		case "pizza" :
			System.out.println("es pizzaa");
			for(int j=0; j<cant; j++) {
				Pizza pizza;
				pizza= prepararPizza(tipo, gusto);
				this.bolsa.addPizzas(pizza);
				System.out.println("pizza agregada a bolsa");
			}
			
			break;
			
		case "empanada" :
			System.out.println("es empanada");
			for(int h=0; h<cant; h++) {
				Empanada empanada;
				empanada=prepararEmpanada(tipo,gusto);
				this.bolsa.addEmpanada(empanada);
				System.out.println("empanada agregada a bolsa");
			}
			break;
			
		}
	}
	//return bolsa;	
	}
		
	
	public Pizza prepararPizza(String tipo, String gusto) {
		Pizza pizza = new Pizza(tipo,gusto);
		return pizza;
	}
	public Empanada prepararEmpanada(String tipo,String gusto) {
		Empanada empanada = new Empanada(tipo,gusto);
		return empanada;
	}

	public Bolsa getBolsa() {
		return bolsa;
	}
	
	
	
}

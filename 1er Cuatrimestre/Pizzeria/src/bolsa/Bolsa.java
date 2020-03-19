package bolsa;

import pizza.Pizza;
import empanada.Empanada;
import java.util.ArrayList; 


public class Bolsa {
	
	ArrayList<Pizza> pizzas;
	ArrayList<Empanada> empanadas;
	
	
	public Bolsa() {
		super();
		this.pizzas = new ArrayList<Pizza> ();
		this.empanadas = new ArrayList<Empanada> ();
	}
	public void addPizzas(Pizza pizza) {
		pizzas.add(pizza);
	}
	public void addEmpanada(Empanada empanada) {
		empanadas.add(empanada);
	}

	 public void mostrarContenido() {
		 System.out.println("Contenido de Bolsa:");
		 System.out.println("pizzasss:");
		 for(int i =0; i<pizzas.size();i++) {
			 System.out.println(pizzas.get(i).toString());
		 }
		 System.out.println("empanadasss:");
		 for(int i =0; i<empanadas.size();i++) {
			 System.out.println(empanadas.get(i).toString());
		 }
	 }
	
	

}

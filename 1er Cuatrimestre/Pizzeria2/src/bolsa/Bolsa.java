package bolsa;
import java.util.ArrayList;
import empanada.Empanada;
import pizza.Pizza;

public class Bolsa {
	
	
	ArrayList<Empanada>empanadas;
	ArrayList<Pizza> pizzas;

	
	public Bolsa() {
		
		empanadas= new ArrayList<Empanada>();
		pizzas= new ArrayList<Pizza>();
	}
	
	public void addPizzas(Pizza pizza) {
		this.pizzas.add(pizza);
	}
	public void addEmpanadas(Empanada empanada) {
		this.empanadas.add(empanada);
	}
	
	public void mostrarContenidoBolsa() {
		System.out.println("PIZZAS:");
		for(int i=0;i<pizzas.size();i++) {
			System.out.println(pizzas.get(i).toString());
		}
		System.out.println("EMPANADAS:");
		for(int j=0;j<empanadas.size();j++) {
			System.out.println(empanadas.get(j).toString());
		}
	}

	@Override
	public String toString() {
		return "Bolsa [empanadas=" + empanadas + ", pizzas=" + pizzas + "]";
	}
	
	
}

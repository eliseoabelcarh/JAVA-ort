package comida;
import pizza.Pizza;
import empanada.Empanada;
import java.util.ArrayList;

public class Comida {
	
	private ArrayList<Pizza> pizzas;
	private ArrayList<Empanada> empanadas;
	
	public Comida() {
		pizzas = new ArrayList<Pizza> ();
		empanadas = new ArrayList<Empanada> ();
	}

	public ArrayList<Pizza> getPizzas() {
		return pizzas;
	}

	public void setPizzas(ArrayList<Pizza> pizzas) {
		this.pizzas = pizzas;
	}

	public ArrayList<Empanada> getEmpanadas() {
		return empanadas;
	}

	public void setEmpanadas(ArrayList<Empanada> empanadas) {
		this.empanadas = empanadas;
	}

	@Override
	public String toString() {
		return "Comida [pizzas=" + pizzas + ", empanadas=" + empanadas + "]";
	}

	
	
	
}

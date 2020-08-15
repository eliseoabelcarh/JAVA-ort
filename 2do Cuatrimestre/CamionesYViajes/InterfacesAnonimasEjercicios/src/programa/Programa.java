package programa;

import interface1.Interface1;
import interface2.Interface2;

public class Programa {
	
	
	@FunctionalInterface
	public static interface Interface3{
		public int devolverSuma(int a, int b);
	}
	
	
	public static void main(String[] args) {
		
		
		Interface1 interface1 = new Interface1() {
			public String devolverSaludo(String nombre){
				return "hola " + nombre;
			}
		};
		
		
		Interface2 interface2 = (a, b) -> { return a+b;};
		
		
		Interface3 interface3 =  (a,b) -> a+b;
		
		
		
		System.out.println(interface3.devolverSuma(5, 4));
		
		
		
		
		
	}

}

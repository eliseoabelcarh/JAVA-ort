package programa;

import clases.Chef;
import clases.Cocinero;
import clases.Empleado;
import clases.Restaurante;

public class Programa {

	public static void main(String[] args) {


		
		
		 Restaurante r =  new Restaurante();
		 r.agregarEmpleadosSeed();
		 Cocinero[] cocineros = r.obtenerListaCocineros();
		 
		 int i = r.devolverIndexVacio(cocineros);
		 System.out.println(i);
		 
		
}
}

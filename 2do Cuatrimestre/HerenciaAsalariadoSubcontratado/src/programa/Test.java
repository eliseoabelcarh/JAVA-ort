package programa;

import clases.Asalariado;
import clases.Subcontratado;

public class Test {
	
	public static void main(String[] args) {
		
		Asalariado a = new Asalariado("José", 30, 10000);
		Subcontratado s = new Subcontratado ("Carlos", 23, 50, 100);
		
		System.out.println(a.toString());
		System.out.println(s.toString());
		
	}

}

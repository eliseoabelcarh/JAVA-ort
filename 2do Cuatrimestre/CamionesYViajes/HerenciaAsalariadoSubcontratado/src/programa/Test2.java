package programa;

import clases.Vendedor;

public class Test2 {
	
	public static void main(String[] args) {
		
		Vendedor v1 = new Vendedor("Pedro",25, 100,200,5 );
		Vendedor v2 = new Vendedor("Maria",30, 100,200,10 );

		System.out.println(v1.toString());
		System.out.println(v2.toString());
	}

}

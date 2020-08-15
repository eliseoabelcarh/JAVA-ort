package clases;

public class Programa {

	public static void main(String[] args) {
		
		
		
		Juego j = new Juego();
		
		Mazo m1 = new Mazo();
		m1.agregarCarta("S");
		m1.agregarCarta("R");
		m1.agregarCarta("F");
		m1.agregarCarta("E");
		m1.agregarCarta("A");
		Mazo m2 = new Mazo();
		m2.agregarCarta("L");
		m2.agregarCarta("F");
		m2.agregarCarta("T");
		m2.agregarCarta("D");
		Mazo m3 = new Mazo();
		m3.agregarCarta("U");
		m3.agregarCarta("N");
		m3.agregarCarta("R");
		m3.agregarCarta("B");
		m3.agregarCarta("H");
		Mazo m4 = new Mazo();
		m4.agregarCarta("G");
		m4.agregarCarta("Z");
		m4.agregarCarta("N");
		
		
		j.agregarMazo(m1);
		j.agregarMazo(m2);
		j.agregarMazo(m3);
		j.agregarMazo(m4);
		
		
		j.agregarOperacion(new Operacion(2,Tipo.E,1));
		j.agregarOperacion(new Operacion(1,Tipo.D,2));
		j.agregarOperacion(new Operacion(3,Tipo.I,6));
		
		j.realizarSimulacion();
		
		
		//ACA CAMBIAR EL NRO MAZO PARA VER COMO QUEDO ADENTRO
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		System.out.println(m4.toString());
		
		
		//DESCOMENTAR PARA VER CUAL ES LA CARTA QUE ESTA ARRIBA DE LA PILA
		//System.out.println(m1.getPila().pop());
	}
}

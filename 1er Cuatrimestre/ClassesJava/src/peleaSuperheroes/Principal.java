package peleaSuperheroes;

public class Principal {

	public static void main(String[] args) {
	
		
		Superheroe superman = new Superheroe("superman",95,60,70);
		Superheroe batman = new Superheroe("batman",90,70,0);
		
		
		
		System.out.println(superman.resultadoEnFuerza(superman, batman));
		System.out.println(superman.resultadoEnResistencia(superman, batman));
		System.out.println(superman.resultadoEnSuperpoderes(superman, batman));

		System.out.println(superman.jugar(batman));
		System.out.println(superman.resultadoEnString(superman.jugar(batman)));
		System.out.println(batman.resultadoEnString(batman.jugar(superman)));
		
	}

}

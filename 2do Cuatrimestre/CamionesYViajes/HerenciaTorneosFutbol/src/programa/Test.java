package programa;

import clases.Equipo;
import clases.Torneo5;
import clases.Torneo8;

public class Test {

	public static void main(String[] args) {
		
		
		Equipo boca = new Equipo("Boca", 8);
		Equipo river = new Equipo("River", 8);
		Equipo velez = new Equipo("Velez", 8);
		Equipo sanLorenzo = new Equipo("San Lorenzo", 8);
		Equipo racing = new Equipo("Racing", 8);
		Equipo independiente = new Equipo("Independiente", 8);
		
		
		Torneo8 torneo8 = new Torneo8();
		torneo8.registrarResultado(1, boca, sanLorenzo, 5, 4);
		torneo8.registrarResultado(1, river, racing, 1, 2);
		torneo8.registrarResultado(1, velez, independiente, 2, 6);
		torneo8.registrarResultado(2, boca, river, 4, 3);
		torneo8.registrarResultado(2, sanLorenzo, independiente, 3, 0);
		torneo8.registrarResultado(2, racing, velez, 5, 1);
		torneo8.registrarResultado(3, boca, velez, 6, 6);
		torneo8.registrarResultado(3, sanLorenzo, river, 3, 1);
		torneo8.registrarResultado(3, racing, independiente, 2, 4);
		torneo8.registrarResultado(4, boca, racing, 0, 0);
		torneo8.registrarResultado(4, river, independiente, 1, 2);
		torneo8.registrarResultado(4, sanLorenzo, velez, 4, 4);
		torneo8.registrarResultado(5, boca, independiente, 2, 1);
		torneo8.registrarResultado(5, river, velez, 2, 5);
		torneo8.registrarResultado(5, sanLorenzo, racing, 0, 3);
		
		torneo8.procesaryMostrarResultados();
		
		
		
		System.out.println("--------------------------------");
		
		
		
		Equipo boca5 = new Equipo("Boca", 5);
		Equipo river5= new Equipo("River", 5);
		Equipo velez5 = new Equipo("Velez", 5);
		Equipo sanLorenzo5 = new Equipo("San Lorenzo", 5);
		Equipo racing5 = new Equipo("Racing", 5);
		Equipo independiente5 = new Equipo("Independiente", 5);
		
		
		
		Torneo5 torneo5 = new Torneo5();
		torneo5.registrarResultado(1, boca5, sanLorenzo5, 5, 4);
		torneo5.registrarResultado(1, river5, racing5, 1, 2);
		torneo5.registrarResultado(1, velez5, independiente5, 2, 6);
		torneo5.registrarResultado(2, boca5, river5, 4, 3);
		torneo5.registrarResultado(2, sanLorenzo5, independiente5, 3, 0);
		torneo5.registrarResultado(2, racing5, velez5, 5, 1);
		torneo5.registrarResultado(3, boca5, velez5, 6, 6);
		torneo5.registrarResultado(3, sanLorenzo5, river5, 3, 1);
		torneo5.registrarResultado(3, racing5, independiente5, 2, 4);
		torneo5.registrarResultado(4, boca5, racing5, 0, 0);
		torneo5.registrarResultado(4, river5, independiente5, 1, 2);
		torneo5.registrarResultado(4, sanLorenzo5, velez5, 4, 4);

		torneo5.procesaryMostrarResultados();
		
		
		
		
		
		
		
	}
}

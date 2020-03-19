package test;

import clases.Instalador;


public class Test {

	public static void main(String[] args) {

		Instalador instalador = new Instalador(150);
		System.out.println(instalador);

		instalador.instalar("WhatsApp", 50,"2019-11-15 15:00:00");
		System.out.println(instalador);
		
		instalador.instalar("Instagram", 70, "2019-11-20 12:15:30");
		System.out.println(instalador);
		
		//cambié fecha a uma fecha mayor para actualizar pero no habrá espacio
		instalador.instalar("WhatsApp", 45, "2019-11-19 15:00:00");
		System.out.println(instalador);
		// es app nueva pero no habrá espacio
		instalador.instalar("Twitter", 100, "2019-11-13 12:00:00");
		System.out.println(instalador);
		
		

		
	}

}

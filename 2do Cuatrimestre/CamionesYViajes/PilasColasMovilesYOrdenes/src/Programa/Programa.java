package Programa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import Clases.Cliente;
import Clases.Empresa;
import Clases.Movil;
import Clases.Orden;

public class Programa {
	
	
	
	public static void main(String[] args) {
		
		

		
		//zonas
		String zona1 = "zona1";
		String zona2 = "zona2";
		String zona3 = "zona3";
		
		//clientes
		Cliente cliente1 = new Cliente(1, zona1);
		Cliente cliente2 = new Cliente(2, zona1);
		Cliente cliente3 = new Cliente(3, zona2);
		Cliente cliente4 = new Cliente(4, zona2);
		Cliente cliente5 = new Cliente(5, zona2);
		Cliente cliente6 = new Cliente(6, zona3);
		Cliente cliente7 = new Cliente(7, zona3);
		Cliente cliente8 = new Cliente(8, zona3);
		Cliente cliente9 = new Cliente(9, zona3);
		ArrayList<Cliente> clientes =  new ArrayList<Cliente>();
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);
		clientes.add(cliente5);
		clientes.add(cliente6);
		clientes.add(cliente7);
		clientes.add(cliente8);
		clientes.add(cliente9);
	
		
		//ordenes para asignar
		Orden orden1 = new Orden("sx1", cliente1 );
		Orden orden2 = new Orden("sx2", cliente2 );
		Orden orden3 = new Orden("sx3", cliente3 );
		Orden orden4 = new Orden("sx4", cliente4 );
		Orden orden5 = new Orden("sx5", cliente5 );
		Orden orden6 = new Orden("sx6", cliente6 );
		Orden orden7 = new Orden("sx7", cliente7 );
		Orden orden8 = new Orden("sx8", cliente8 );
		Orden orden9 = new Orden("sx9", cliente9 );
		//ordenes sin asignar
		Orden orden10 = new Orden("sx10", cliente9 );
		Orden orden11 = new Orden("sx11", cliente8 );
		Orden orden12 = new Orden("sx12", cliente7 );
		Orden orden13 = new Orden("sx13", cliente6 );
		Orden orden14 = new Orden("sx14", cliente5 );
		Orden orden15 = new Orden("sx15", cliente4 );
		Orden orden16 = new Orden("sx16", cliente3 );
		Orden orden17 = new Orden("sx17", cliente2 );
		Orden orden18 = new Orden("sx18", cliente1 );
		//listado de ordenes sin asignar
		Queue<Orden> ordenesSinAsignar = new LinkedList<Orden>();
		ordenesSinAsignar.add(orden10);
		ordenesSinAsignar.add(orden11);
		ordenesSinAsignar.add(orden12);
		ordenesSinAsignar.add(orden13);
		ordenesSinAsignar.add(orden14);
		ordenesSinAsignar.add(orden15);
		ordenesSinAsignar.add(orden16);
		ordenesSinAsignar.add(orden17);
		ordenesSinAsignar.add(orden18);
		
		//asignar ordenes
		Queue<Orden> ordenesAsignadasAMovil1 = new LinkedList<Orden>();
		ordenesAsignadasAMovil1.add(orden1);
		ordenesAsignadasAMovil1.add(orden2);
		ordenesAsignadasAMovil1.add(orden3);

		Queue<Orden> ordenesAsignadasAMovil2 = new LinkedList<Orden>();
		ordenesAsignadasAMovil2.add(orden4);
		ordenesAsignadasAMovil2.add(orden5);
		ordenesAsignadasAMovil2.add(orden6);
		ordenesAsignadasAMovil2.add(orden7);

		Queue<Orden> ordenesAsignadasAMovil3 = new LinkedList<Orden>();
		ordenesAsignadasAMovil3.add(orden8);
		ordenesAsignadasAMovil3.add(orden9);

		//moviles
		Movil movil1 =  new Movil(1,zona3,5,ordenesAsignadasAMovil1);
		Movil movil2 =  new Movil(2,zona3,5,ordenesAsignadasAMovil2);
		Movil movil3 =  new Movil(3,zona3,5,ordenesAsignadasAMovil3);
		
		ArrayList<Movil> moviles = new ArrayList<Movil>();
		moviles.add(movil1);
		moviles.add(movil2);
		moviles.add(movil3);
		//
		
		Empresa e = new Empresa(ordenesSinAsignar, moviles, clientes);

//		System.out.println(e.toString());

		movil1.mostrarInfo();
		movil2.mostrarInfo();
		movil3.mostrarInfo();
		System.out.println("--------------------------------------------------");
		
		System.out.println("se retira móvil");
		e.retirarMovil(1);
		System.out.println("--------------------------------------------------");
		movil1.mostrarInfo();
		movil2.mostrarInfo();
		movil3.mostrarInfo();
		
		System.out.println("--------------------------------------------------");
		System.out.println("se busca por Id de orden");
		e.buscarOT("sx6");
		
	}
	
	
	
	
}

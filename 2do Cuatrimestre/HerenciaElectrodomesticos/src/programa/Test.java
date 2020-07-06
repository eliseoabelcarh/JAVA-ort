package programa;

import java.util.Scanner;

import clases.Estado;
import clases.Heladera;
import clases.Lavarropa;
import clases.Licuadora;
import clases.Marca;
import clases.Nombre;
import clases.Producto;
import clases.Televisor;
import clases.Tipo;

public class Test {
	

	private static float precioTotal = 0;

	static Producto[] productos = new Producto[] {
			new Heladera(Nombre.HELADERA, Marca.WHIRLPOOL, "H2745", "XX", 25, Estado.APAGADO, 14999, 250,Tipo.FROST ),
			new Televisor(Nombre.TELEVISOR, Marca.PHILLIPS, "49pfgs", "xx", 25, Estado.APAGADO, 14370, 49, Tipo.SMART ),
			new Lavarropa(Nombre.LAVARROPA, Marca.DREAN, "concept", "xx", 25, Estado.APAGADO, 6799, 6, Tipo.SEMI_AUTOMATICO ),
			new Licuadora(Nombre.LICUADORA, Marca.PHILLIPS, "", "", 25, Estado.ENCENDIDO, 5000, 5000, 5)
		};
	

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("LISTA DE PRODUCTOS: ");
		System.out.println("--Presione '0' para terminar" );
		System.out.println("--Presione 'A' para agregar producto a su compra");
		System.out.println("--Presione 'N' para ver sgte producto sin agregarlo");
		
		
		
		for (Producto producto : productos) {
			System.out.println("***"+producto.toString());
			String x;
			do {
				System.out.println("seleccione acción");
				x = lector.next();
				x = x.toUpperCase();
				if(!accionValida(x)) {
					System.out.println("no es una acción");
				}		
			}
			while(!accionValida(x));
			
			if(x.equals("A")){
				sumarATotal(producto.getPrecio());
			}
		}
			lector.close();
		System.out.println("PRECIO TOTAL DE COMPRA: "  + precioTotal);
		
	}
	
	
	//METODOS QUE UTILIZA EL MAIN
	private static void sumarATotal(float precio) {
		precioTotal+=precio;
		System.out.println("acumulado "+ precioTotal);	
	}

	public static boolean accionValida(String x) {
		x = x.toUpperCase();
		return (x.equals("0") || x.equals("A") || x.equals("N"));
	}

}

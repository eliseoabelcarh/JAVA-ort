package parciales;

import java.util.Scanner;

public class ParcialNegocioRopa {
	
	public static Scanner lector = new Scanner  (System.in);
	
	
	public static void main (String [] args ) {
		
		
		int nroCliente;
		final int COD_FIN =0;
		String articulo;
		int cantidad;
		double subtotal;
		double dsctoAzar;
		double dsctoImporte;
		double importePagar;
		int contVentas=0;
		double totalDsctosImporte = 0;
		double maxImporteAPagar=0;
		int ganador=0;
	
		
		
		nroCliente=ingresarEnteroPositivo("ingresa código de cliente");
		while(nroCliente != COD_FIN) {
			
			articulo= ingresarArticulo("ingresa aartículo");
			cantidad= ingresarCantidad("ingresa cantidad");
			subtotal = obtenerSubTotal(articulo,cantidad);
			System.out.println("el subtotal es " + subtotal);
			
					
			
			dsctoAzar= obtenerDsctoAzar();
			System.out.println("el dsctoAzar es " + dsctoAzar);
			
			
			dsctoImporte = obtenerDsctoCompra(subtotal,dsctoAzar);
			System.out.println(" el dscto importe es " + dsctoImporte);
			importePagar= calcularTotal(subtotal,dsctoImporte);
			System.out.println(" el importe a pagar es " + importePagar);
			contVentas++;
			totalDsctosImporte +=dsctoImporte;
			System.out.println(" el acumulado de totalDsctosimportes es "+ totalDsctosImporte);
			
			if(importePagar > maxImporteAPagar) {maxImporteAPagar=importePagar; ganador=nroCliente;}//fin de if
			System.out.println(" el max importe a pagar es " + maxImporteAPagar);
			
			nroCliente= ingresarEnteroPositivo("ingresa nuevo número de cliente");
			
			
			
		}//fin de while
		
		if(contVentas>=1) {
			
			System.out.println("ventas totales " + contVentas);
			System.out.println("cliente que más facturó " + ganador);
			System.out.println("suma de dinero q se descontó" + totalDsctosImporte);
		} else  {System.out.println("no hay datos");} //fin de if
		
		
	}
	
	
	
	
	// funciones
	
	
	public static int ingresarNumero(String texto) {
		int num;
		System.out.println(texto);
		num=lector.nextInt();
		lector.nextLine();
		return num;
		
	}
	
	public static int ingresarEnteroPositivo(String texto) {
		
		int num;
		do {num = ingresarNumero (texto);} while(!(num>=0));
		return num;
	}

	public static String ingresarString (String texto) {
		String str;
		System.out.println(texto);
		str=lector.next();
		lector.nextLine();
		return str;
	}
	
	public static boolean estaEnCatalogo(String producto) {
		
		final String REMERA = "A1";
		final String BUZO= "A2";
		final String PANTALON="A3";
		
		return (producto.equals(REMERA) || producto.equals(BUZO) || producto.equals(PANTALON));
		
			
	}
	
		public static String ingresarArticulo(String texto) {
		String art;
		do {art=ingresarString(texto);}while(!estaEnCatalogo(art));
		return art;
	}
	
		public static int ingresarCantidad(String texto) {
			int cant;
			do {cant= ingresarNumero(texto);} while(!(cant>0));
			return cant;
	}
	
		private static int funcionAzar(int tope, int base) {
			
			int result;
			result= (int)((Math.random())*(tope-base +1))+base;
			return result;
			
			
		}
		
		public static double obtenerDsctoAzar() {
			final int TOPE = 5;
			final int BASE = 1;
			int nro;
			double dscto;
			
			nro= funcionAzar(TOPE, BASE);
			dscto= (double)nro/10;
			return dscto;
		}
		
		public static double obtenerSubTotal(String producto,int cantidad) {
			final double PRECIO_REMERA=200;
			final double PRECIO_BUZO = 300;
			final double PRECIO_PANTALON = 400;
			double costo=0;
			
			switch(producto) {
			case "A1" : costo = PRECIO_REMERA*cantidad;
				break;
			case "A2" :  costo = PRECIO_BUZO * cantidad;
				break;
			case "A3" :  costo = PRECIO_PANTALON * cantidad;
				break;
				
			
			}
			return costo;
			
		}
		
		public static double obtenerDsctoCompra(double subtotal,double dscto) {
			return (subtotal*dscto);
		}
		
		public static double calcularTotal (double subtotal, double dscto) {
			return (subtotal - dscto);
		}
		
}

package fundamentosTp1;
import java.util.Scanner;
public class EmpresasFacturaAcumYProm {
	
	public static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int i=1;
		int cantidadEmpresas =2;
	//	int libres;
		double cantViajAd;
		double abonoMes;
		double precViajeAdic;
		double precioFact;
		double promedio;
		String empresa;
		double dscto = 0.1;
		double mayorFact=0;
		double suma=0;
		
		
		//libres=viajesLibresXMes("ingrese cant viajes libres x mes");
		abonoMes=precioAbonoMensual("ingrese precio de abono fijo mensual");
		precViajeAdic= costoViajeAdic("ingrese precio x cada viaje adicional");
		while(i<=cantidadEmpresas) {
			
			empresa=ingNombre("ingrese nombre de empresa:");
			cantViajAd=ingViajeRango("ingrese cantidad de viajes adicionales: ");
			System.out.println(cantViajAd);
			precioFact= procesarFactura(cantViajAd,precViajeAdic,abonoMes,dscto);
			mostrarFactura(empresa,precioFact);
			
			mayorFact=pedirMayor(precioFact,mayorFact);
			System.out.println("factura mayor es.." + mayorFact);
			suma= suma + precioFact;
			i++;
			
		}
		promedio=promedio(suma,cantidadEmpresas);
		System.out.println("promedio facturación mensual fue " + promedio + " y la mayor factura es: "+ mayorFact);
		
		
		
	}//fin de main
	
	
	//	INICIO DE FUNCIONES
	
	
	public static String ingNombre(String texto) {
		String nombre;
		System.out.println(texto);
		nombre=lector.next();
		lector.nextLine();
		return nombre;
	}
	
	public static double ingViajeAdic(String texto) {
		double adic;
		System.out.println(texto);
		adic= (lector.nextDouble());
		return adic;
	}
	
	public static double ingViajeRango(String mensaje) {
		double viaj;
		viaj=(ingViajeAdic(mensaje));
		while(!(viaj >= 0 && viaj<1000)) {
			viaj=(ingViajeAdic("debe ser entre 0 y 1000"));
		}
		return viaj;
		
	}
	
	public static double viajesLibresXMes(String texto) {
		
		double lib;
		lib=(ingViajeRango(texto));
		return lib;
	}
	
	public static boolean aplicaDscto(double nro) {
		boolean aplica;
		if(nro>30) {
			aplica=true;
		}else {aplica=false;}
		return aplica;
	}

	public static double ingPrecio(String texto) {
		
		double precio;
		System.out.println(texto);
		precio=lector.nextDouble();
		return precio;
	}
	
	
	public static double costoViajeAdic(String texto) {
		double res;
		res=ingPrecio(texto);
		return res;
		
	}
	
	public static double precioAbonoMensual(String texto) {
		
		double prec;
		prec=ingPrecio(texto);
		return prec;
	}
	
	public static void mostrarFactura(String texto,double total) {
		System.out.println("la empresa: " + texto + "debe abonar: "+ total);
		
	}
	
	public static double descontar(double precio, double dscto) {
		
		double res;
		res=(precio-(precio*dscto));
		return res;
	}
	
	
	public static double procesarFactura(double cantViaj, double precViaj, double abonoMes, double dscto) {
		double res;
		res= ((cantViaj*precViaj)+abonoMes);
		if(aplicaDscto(cantViaj)){res=descontar(res,dscto);}
		return res;
	}
	
	public static double pedirMayor(double n1, double n2) {
		double mayor;
		if(n1>=n2) {mayor = n1;}else {mayor=n2;}
		return mayor;
	}
	
	public static double promedio (double n1, int n2) {
		double prom;
		prom= (n1/n2);
		return prom;
		
	}
	
	
	

}//fin clase

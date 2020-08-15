package programa;
import java.util.Scanner;
import multiplicador.Multiplicador;
import acumulador.Acumulador;

public class Programa {

	private static final int CANTIDAD_DE_NROS = 5;
	public static final int NRO_DE_CONTROL = 5;
	public static Scanner input = new Scanner(System.in);

	static Acumulador acumulador = new Acumulador();
	static Multiplicador multiplicador = new Multiplicador();
	
	public static void main(String[] args) {
		
		Integer numeroIngresado;
		
		
		for(int i = 0; i < CANTIDAD_DE_NROS ; i++) {
			numeroIngresado = pedirNumero();
			evaluarNros(numeroIngresado);
			
			
		}
		
		mostrarResultados();
		
		
		
		
		input.close();
	}

	
	public static Integer pedirNumero() {
		System.out.println("ingrese un número");
		return input.nextInt();
	}
	public static void evaluarNros(Integer numeroIngresado) {
		if(numeroIngresado < NRO_DE_CONTROL) {
			acumulador.acumular(numeroIngresado);
		}else {
			multiplicador.acumularProducto(numeroIngresado);
		}
	}
	
	public static void mostrarResultados() {
		System.out.println("suma de nros menores a 5 es: " + acumulador.mostrarValorAcumulado());
		System.out.println("producto de nros mayores a 5 es: " + multiplicador.mostrarProductoAcumulado());
		
	}
	
	
	
	
}

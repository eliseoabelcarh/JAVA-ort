package ar.edu.ort.tp1.segundoparcial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2Par {

	private static final int MIN_CLIENTE = 1;
	private static final int MAX_CLIENTE = 1000;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nroCliente;
		DataCenter datacenter = null;
		String nombreDatacenter;
		// completadoParcial Abel
		
			nroCliente = cargarNroDeCliente(input);
			
			try {
				nombreDatacenter = "Centro Data";
				datacenter = new DataCenter(nombreDatacenter, nroCliente);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
		
		
		
		if (datacenter != null) {
			// TODO - Resolver los puntos que te pida el cuestionario.
			
			try {
				Servidor s1 = new Servidor(1,"Win Server");
				Servidor s2 = new Servidor(2,"Linux");
				datacenter.addServidor(s1);
				datacenter.addServidor(s2);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
			// El siguiente metodo genera datos de prueba para testear los
			// puntos pedidos. No quitar ni modificar.
			datacenter.generarDatos();
			// procesamiento - No modificar
			System.out.println("--Mostrando todas las actividades--");
			datacenter.mostrarActividades();
			System.out.println("--Mostrando los resultados--");
			datacenter.generarResultados();
			System.out.println("--Mostrando las actualizaciones--");
			datacenter.mostrarActualizaciones(1);
		} else
			System.out.println("no se creo el Centro de datos");
		input.close();
	}

	// 1-a completar para que capture la excepcion de tipo no numerico
	//COMLETADOaBEL
	private static int cargarNroDeCliente(Scanner scanner){
		int codigo = 0;
			
			do {
				try {
					System.out.println("Ingrese el numero de cliente ("+ MIN_CLIENTE + " a " + MAX_CLIENTE +")");
					codigo = scanner.nextInt();
					
				} catch (InputMismatchException e) {
					System.out.println("el dato no es un número");
					scanner.nextLine();
				}
			}
			while(!(codigo >= MIN_CLIENTE && codigo <= MAX_CLIENTE) );
	
		return codigo;
	}

	
	
	// 1-b completar el nombre para que capture la excepcion de constructor
	private static DataCenter crearDataCenter(String nombre) {
		DataCenter dc = null;
		// TODO (solo si es tu tema)
		return dc;
	}
}

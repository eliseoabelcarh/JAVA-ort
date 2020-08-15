package ar.edu.ort.tp1.segundoparcial;

import java.util.ArrayList;
import java.util.Scanner;

public class DataCenter {
	private String nombre;
	private ArrayList<Servidor> servidores;
	private int clienteActual;

	// 1- Completar el constructor
	public DataCenter(String nombre, int clienteActual) {
		setNombre(nombre);
		this.servidores = new ArrayList<Servidor>();
		setClienteActual(clienteActual);
	}

	
	public void addServidor(Servidor ser) {
		servidores.add(ser);
	}

	public Servidor getServidor(int nro) {
		if (nro > -1 && nro < servidores.size())
			return servidores.get(nro);
		else
			return null;
	}

	// Carga los datos de las actividades a los servidores
	// Este metodo esta a fines de prueba y no debe tocarse
	public void generarDatos() {
		Actividad[] logDiario = new Actividad[10];
		// datos para servidor 1
		logDiario[0] = new Analisis("20200506", "1002", 'E', "archivo.docx", Analisis.Resultado.INFECTADO);
		logDiario[1] = new Analisis("20200507", "1003", 'E', "anaway.mp3", Analisis.Resultado.OK);
		logDiario[2] = new EnvioAnalisis("20200506", "1430", 'S', "Virus", 1505, "Win32Bagle");
		logDiario[3] = new Actualizacion("20200506", "1100", 'E', "nod32", "ver1.2");
		logDiario[4] = new Actualizacion("20200507", "1100", 'E', "nod32", "ver1.3");
		logDiario[5] = new Actualizacion("20200508", "1100", 'E', "nod32", "ver1.4");
		// datos para servidor 2
		logDiario[6] = new Analisis("20200506", "1902", 'E', "enunciado.doc", Analisis.Resultado.INFECTADO);
		logDiario[7] = new Analisis("20200507", "1903", 'E', "datos.dat", Analisis.Resultado.INFECTADO);
		logDiario[8] = new EnvioAnalisis("20200506", "1904", 'S', "Virus", 2055, "Win32Bagle");
		logDiario[9] = new EnvioAnalisis("20200506", "1905", 'S', "Virus", 5002, "Win32Ext");

		if (servidores.size() == 1) {
			for (int i = 0; i < 6; i++)
				servidores.get(0).agregarActividad(logDiario[i]);
		}
		if (servidores.size() == 2) {
			for (int i = 0; i < 10; i++)
				if (i < 6)
					servidores.get(0).agregarActividad(logDiario[i]);
				else
					servidores.get(1).agregarActividad(logDiario[i]);
		}
	}

	public void mostrarActividades() {
		System.out.println("dataCenter:" + nombre + " - Cliente: " + clienteActual);
		for (Servidor servidor : servidores) {
			servidor.mostrarActividad();
		}
		System.out.println("--------------------------");
	}

	public void generarResultados() {
		for (Servidor servidor : servidores) {
			System.out.println("-Estadistica servidor nro:" + servidor.getNumero());
			// TODO - completar con lo que te haya tocado
			servidor.correrEstadisticaN();
			System.out.println("--------------------------");
		}
		System.out.println("--------------------------");
	}

	public void mostrarActualizaciones(int nro) {
		Servidor s = getServidor(nro - 1);
		if (s != null) {
			System.out.println("-Actualizaciones servidor nro:" + s.getNumero());
			// TODO - completar con lo que te haya tocado
			
			//ComplteadoAbel
			System.out.println("Todas las actualizaciones del Servidor: "+s.getNumero()+", "+ " S.O. "+ s.getSO());
			s.mostrarActualizacionesN();
			
			
		}
		System.out.println("--------------------------");
	}

	public void accederACuenta(int nroCliente) {
		this.clienteActual = nroCliente;
	}

	private void setNombre(String nombre) throws IllegalArgumentException {
		if(nombre == null) {
			throw new IllegalArgumentException("El nombre del data center no puede estar vacio ni ser null");
		}else {
			this.nombre = nombre;
		}
		
	}

	private void setClienteActual(int clienteActual) throws IllegalArgumentException{
		// ya viene validado en el main, pero igual valido si es null
		if(nombre == null) {
			throw new IllegalArgumentException("El nro cliente no puede estar vacio ni ser null");
		}else {
			this.clienteActual = clienteActual;
		}
		
	}
	
	
	
	
}
package clases;

import java.util.ArrayList;

public class Restaurante {
	
	public final String SIN_DATOS ="Sin datos";
	public final int CANTIDAD_DE_MESAS = 26;
	public final int CANTIDAD_COCINEROS = 20;
	
	private ArrayList<Producto> menu;
	private Mesa[] mesas;
	private ArrayList<Pedido> pedidos;
	private ArrayList<Empleado> empleados;
	
	

	public Restaurante() {
		this.menu = new ArrayList<Producto>();
		this.mesas = new Mesa[CANTIDAD_DE_MESAS];
		this.pedidos = new ArrayList<Pedido>();
		this.empleados  = new ArrayList<Empleado>();
	}

	public void agregarEmpleadosSeed() {
		this.empleados.add(new Cocinero("cocinero1",1));
		this.empleados.add(new Chef("chef1",2));
		this.empleados.add(new Cocinero("cocinero2",3));
		this.empleados.add(new Cocinero("cocinero3",4));
		this.empleados.add(new Gerente("gerente1",5));
		this.empleados.add(new Cocinero("cocinero4",6));
		
		
	}


	public void registrarPedido(int nroPedido, Mesa mesa, Mozo mozo, Cocinero cocinero, ArrayList<Producto> productos) {
		Pedido pedido = new Pedido(nroPedido, mesa, mozo,cocinero,productos);
		this.pedidos.add(pedido);
	}
	
	public Cocinero calcularCocineroMasProductivo() {
		Cocinero mejorCocinero;
		int indexCocineroMayor;
		Cocinero[] listaCocineros = obtenerListaCocineros();
		int[] pedidosXCocinero = new int[listaCocineros.length];
		for (int i = 0; i < this.pedidos.size(); i++) {
			if(this.pedidos.get(i).estaCerrado()) {
				Cocinero cocinero = this.pedidos.get(i).getCocinero();
				int indexCocinero = devolverIndexCocinero(cocinero, listaCocineros);
				pedidosXCocinero[indexCocinero]++;
				
			}
		}
		indexCocineroMayor = devolverIndexConMayorElemento(pedidosXCocinero);
		mejorCocinero = devolverCocinero(indexCocineroMayor, listaCocineros );
		return mejorCocinero;
	}

	public void informarPlan(int nroLegajo) {
		String planMedico = SIN_DATOS;
		Empleado empleado = buscarEmpleadoPorLegajo(nroLegajo);
		if(empleado instanceof Chef){
			Chef chef = (Chef) empleado;
			planMedico = chef.devolverPlanMedico();
		}else {
			if(empleado instanceof Gerente) {
				Gerente gerente = (Gerente)empleado;
				planMedico = gerente.devolverPlanMedico();
			}
		}
		if(planMedico != SIN_DATOS) {
			System.out.println("el plan q corresponde es "+ planMedico);
		}
		else {
			System.out.println("no es gerente ni chef");
		}
	}


	public void liberarMesa(int nroMesa) {
		double importe = 0;
		boolean mesaEncontrada = false;
		int i = 0;
		while(i < pedidos.size() && !mesaEncontrada) {
			if(! this.pedidos.get(i).estaCerrado()) {
				if(this.pedidos.get(i).getNroMesa() == nroMesa) {
					importe = this.pedidos.get(i).calcularImportePagar();
					mesaEncontrada = true;
					Mesa mesa = this.pedidos.get(i).getMesa();
					mesa.setEstadoMesa(EstadoMesa.LIBRE);
					this.pedidos.get(i).setEstadoPedido(EstadoPedido.CERRADO);
				}
				i++;
			}
		}
		if(mesaEncontrada) {
			System.out.println("importe a pagar es " +importe);
		}else {
			System.out.println("no hay pedido abierto para esta mesa");
		}
	}
	public Cocinero[] obtenerListaCocineros() {
		Cocinero[] vector = new Cocinero[CANTIDAD_COCINEROS];
		System.out.println(CANTIDAD_COCINEROS);
		for (int i = 0; i < empleados.size(); i++) {
			if(empleados.get(i) instanceof Cocinero){
				int indexVacio = devolverIndexVacio(vector);
				System.out.println("index vacio es" + indexVacio);
				vector[indexVacio] = (Cocinero) this.empleados.get(i);
			}
		}
		
		for (int x = 0; x < vector.length; x++) {
			if(vector[x] != null) {
				System.out.println(vector[x].toString());
			}
			
			
		}
		
		System.out.println("toto bien");
		return vector;
	}
	
	
	public Cocinero[] obtenerListaCocineros2() {
		int cont = 0;
		Cocinero[] vector = new Cocinero[CANTIDAD_COCINEROS];
		for (int i = 0; i < empleados.size(); i++) {
			if(empleados.get(i) instanceof Cocinero){
				
				vector[cont] = (Cocinero) this.empleados.get(i);
				cont++;
			}
		}
		return vector;
	}

	public int devolverIndexVacio(Empleado[] vector) {
	int i = 0;
	int indexVacio = -1;
	//boolean encontrado = false;
	while(indexVacio==-1 && i < vector.length) {
		if(vector[i] == null) {
			//encontrado = true;
			indexVacio = i;
		}
		i++;
	}
	return indexVacio;
	}



	private Empleado buscarEmpleadoPorLegajo(int nroLegajo) {
		Empleado empleado = null;
		int i = 0;
		boolean  encontrado = false;
		while(!encontrado && i < this.empleados.size()) {
			if(nroLegajo == this.empleados.get(i).getNroLegajo()) {
				empleado = this.empleados.get(i);
				encontrado = true;
			}
			i++;
		}
		return empleado;
	}



	private Cocinero devolverCocinero(int indexCocinero, Cocinero[] vector) {
		Cocinero cocinero = null;
		if(indexCocinero != -1 && vector != null) {
			cocinero = vector[indexCocinero];
		}
		
		return cocinero;
	}



	private int devolverIndexConMayorElemento(int[] vector) {
		int indexMayor = -1;
		int max = -99999;
		for (int i = 0; i < vector.length; i++) {
			if(vector[i] > max) {
				indexMayor = i;
			}
		}
		return indexMayor;
	}



	private int devolverIndexCocinero(Cocinero cocinero, Cocinero[] vector) {
		int indexEncontrado = -1;
		int  i= 0;
		boolean encontrado = false;
		while(!encontrado && i < vector.length) {
			if(cocinero ==  vector[i]) {
				indexEncontrado = i;
				encontrado=true;
			}
			i++;
		}
		return indexEncontrado;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}



	
}

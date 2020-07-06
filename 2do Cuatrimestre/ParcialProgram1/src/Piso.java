import java.util.LinkedList;
import java.util.Queue;

public class Piso implements Estacionamiento{
	
	private Queue<Vehiculo> colaVehiculos;
	private int capacidadMaxDeVehiculos;

	public Piso(int cantMaximaCocheras) {

		this.colaVehiculos =  new LinkedList<Vehiculo>();
		this.capacidadMaxDeVehiculos = cantMaximaCocheras; 
	}

	@Override
	public boolean estacionar(Vehiculo vehiculo) {
		boolean resultado = false;
		if(hayLugar()) {
			resultado = true;
			colaVehiculos.add(vehiculo);
		}
		return resultado;
	}

	@Override
	public Vehiculo retirar(String patente) {

		Vehiculo centinela = new Vehiculo("***");
		Vehiculo vehiculoEcnontrado = null;
		Vehiculo vehiculo;
		colaVehiculos.add(centinela);
		vehiculo = colaVehiculos.remove();
		while(vehiculo != centinela) {
			if(vehiculo.getPatente() == patente ) {
				vehiculoEcnontrado = vehiculo;
			}else {
				colaVehiculos.add(vehiculo);
			}
			vehiculo = colaVehiculos.remove();
			
		}
		return vehiculoEcnontrado;
	}

	@Override
	public boolean hayLugar() {
	
		return getCantidadActualDeVehiculos() < this.capacidadMaxDeVehiculos;
	}

	public boolean existePatente(String patente) {
		Vehiculo centinela = new Vehiculo("***");
		Vehiculo vehiculo;
		boolean encontrado = false;
		colaVehiculos.add(centinela);
		vehiculo = colaVehiculos.remove();
		while(vehiculo != centinela) {
			if(vehiculo.getPatente() == patente ) {
				encontrado = true;
			}
			colaVehiculos.add(vehiculo);
			vehiculo = colaVehiculos.remove();
		}
		return encontrado;
	}
	
	public int getCantidadActualDeVehiculos() {
		Vehiculo centinela = new Vehiculo("***");
		Vehiculo vehiculo;
		int cont = 0;
		
		colaVehiculos.add(centinela);
		vehiculo = colaVehiculos.remove();
		while(vehiculo != centinela) {
			cont++;
			colaVehiculos.add(vehiculo);
			vehiculo = colaVehiculos.remove();
		}
		return cont;
	}
	

}

/**
 * 
 */
package ar.edu.ort.tp1.parcial2.entidades;

import ar.edu.ort.tp1.parcial2.entidades.tad.Pila;
import ar.edu.ort.tp1.parcial2.entidades.tad.PilaAL;
import exception.EstacionamientoException;

/**
 * Entidad que engloba el funcionamiento de un estacionamiento de autos y
 * motocicletas. cada tipo de vehículo será estacionado de la forma determinada
 * y en base a su capacidad asignada al momento de la creación del
 * estacionamiento.
 * 
 * Se debe tene en cuenta que el funcionamiento del estacionamiento para cada
 * tipo de vehículo es del tipo LIFO Utilizar la implementación de TAD que
 * corresponda
 */
public class Estacionamiento {

	//completado
	
	/**
	 * TAD para alojar las motocicletas estacionadas.
	 */
	private Pila<Vehiculo> tadMotos;
	/**
	 * TAD para alojar los autos estacionados.
	 */
	private Pila<Vehiculo> tadAutos;

	/**
	 * Precio de la hora completa para motocicletas
	 */
	private float precioMotocicletasPorHora;
	/**
	 * Precio de la hora completa para autos
	 */
	private float precioAutosPorHora;

	/**
	 * Constructor del estacionamiento, recibe las capacidades de autos y motos y
	 * los precios por hora completas.
	 * 
	 * @param capacidadAutos
	 * @param capacidadMotocicletas
	 * @param precioAutosPorHora
	 * @param precioMotocicletasPorHora
	 */
	public Estacionamiento(int capacidadAutos, int capacidadMotocicletas, float precioAutosPorHora,
			float precioMotocicletasPorHora) throws EstacionamientoException {
		// COMPLETAdo
		
		setPrecioAutosPorHora(precioAutosPorHora);
		setPrecioMotocicletasPorHora(precioMotocicletasPorHora);
		this.tadAutos = new PilaAL<Vehiculo>(capacidadAutos);
		this.tadMotos = new PilaAL<Vehiculo>(capacidadMotocicletas);
		
	}

	/**
	 * Setea el precio de la hora de auto, debe ser mayor a 0
	 * 
	 * @param precioAutos the precioAutos to set
	 */
	private void setPrecioAutosPorHora(float precioAutosPorHora) throws EstacionamientoException {
		
		//completadoAbel
		if(precioAutosPorHora < 0 ) {
			throw new EstacionamientoException("precio de auto por hora inválido");
		}else {
			this.precioAutosPorHora = precioAutosPorHora;
		}
		
	}

	/**
	 * Setea el precio de la hora de la motocicleta , debe ser mayor a 0
	 * 
	 * @param precioMotocicletas the precioMotocicletas to set
	 */
	private void setPrecioMotocicletasPorHora(float precioMotocicletasPorHora) {
		//completadoAbel
				if(precioMotocicletasPorHora < 0 ) {
					throw new EstacionamientoException("precio de motocicleta por hora inválido");
				}else {
					this.precioMotocicletasPorHora = precioMotocicletasPorHora;
				}
	}

	/**
	 * Permite estacionar un vehículo en el estacionamiento. La patente debe ser
	 * válida segun el tipo de vehículo el horario de ingreso debe ser válido
	 * 
	 * @param tipo
	 * @param patente
	 * @param horaIngreso
	 * @param minutosIngreso
	 */
	public void estacionar(TipoVehiculo tipo, String patente, int horaIngreso, int minutosIngreso) throws EstacionamientoException {

		// completadoAbel
		
		if(tipo == TipoVehiculo.MOTOCICLETA) {
			
			estacionarMoto(patente, horaIngreso, minutosIngreso);
		}
		else {
			
			estacionarAuto(patente, horaIngreso, minutosIngreso);
		}
	}

	/**
	 * Permite estacionar una motocicleta.
	 * 
	 * @param patente
	 * @param horaIngreso
	 * @param minutosIngreso
	 */
	private void estacionarMoto(String patente, int horaIngreso, int minutosIngreso) throws EstacionamientoException {
		// completadoAbel
		Motocicleta motocicleta = new Motocicleta(patente, horaIngreso, minutosIngreso, this.precioMotocicletasPorHora);
		try {
			this.tadMotos.push(motocicleta);
			System.out.println("Se estacionó correctamente la motocicleta patente: " + patente);
		} catch (Exception e) {
			throw new EstacionamientoException("estacionamiento de motos lleno");
		}
	}

	/**
	 * permite estacionar un auto
	 * 
	 * @param patente
	 * @param horaIngreso
	 * @param minutosIngreso
	 */
	private void estacionarAuto(String patente, int horaIngreso, int minutosIngreso) throws RuntimeException {
		// completadoAbel
				Auto auto= new Auto(patente, horaIngreso, minutosIngreso, this.precioAutosPorHora);
				try {
					this.tadAutos.push(auto);
					System.out.println("Se estacionó correctamente el auto patente: " + patente);
				} catch (Exception e) {
					throw new EstacionamientoException("estacionamiento de autos lleno");
				}

	}

	/**
	 * Retira un vehículo del estacionamiento. debe detectar el tipo de vehículo en
	 * base a su patente (ver diferencias entre la patente de los autos y las motos)
	 * el horario de egreso debe ser válido si el vehículo no está estacionado debe
	 * lanzar una excepción.
	 * 
	 * @param patente
	 * @param horaEgreso
	 * @param minutosEgreso
	 * @return
	 */
	public float retirar(String patente, int horaEgreso, int minutosEgreso) throws EstacionamientoException {

		float importe = 0;
		Vehiculo vehiculo;
		// completadoAbel
		//veo si es auto
		if(patente.matches(Vehiculo.getRegexAuto())) {
			vehiculo = retirar(patente, this.tadAutos);
		}else {
			vehiculo = retirar(patente, this.tadMotos);
		}
		if(vehiculo==null) {
			throw new EstacionamientoException("Vehículo con patente "+ patente + " No encontrado");
		}
		if(vehiculo != null && (vehiculo.getHoraIngreso() > horaEgreso)) {
			throw new EstacionamientoException("Horario de egreso anterior al de ingreso");
		}
		//calcular importe
		importe = vehiculo.calcularImporte(horaEgreso, minutosEgreso);
		return importe;
	}

	/**
	 * Retira el vehículo de la TAD especificada
	 * 
	 * @param patente
	 * @param horaIngreso
	 * @param minutosIngreso
	 */
	private Vehiculo retirar(String patente, Pila<Vehiculo> tad) {
		Vehiculo encontrado = null;
		Pila<Vehiculo> pilaAux  = new PilaAL<Vehiculo>();
		Vehiculo vehiculo;
		
		while(!tad.isEmpty() && encontrado == null) {
			vehiculo = tad.pop();
			if(!(vehiculo.getPatente().equalsIgnoreCase(patente))) {
				pilaAux.push(vehiculo);
			}else {
				encontrado = vehiculo;
			}
			
		}
		while(!pilaAux.isEmpty()) {
			vehiculo = pilaAux.pop();
			tad.push(vehiculo);
		}

		return encontrado;
	}
}

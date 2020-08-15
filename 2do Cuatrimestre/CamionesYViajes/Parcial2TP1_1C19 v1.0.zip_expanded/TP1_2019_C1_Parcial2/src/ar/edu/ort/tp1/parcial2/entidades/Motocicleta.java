/**
 * 
 */
package ar.edu.ort.tp1.parcial2.entidades;

import exception.EstacionamientoException;

/**
 * Representa una motocicleta a ser estacionada. el precio de los autos se fracciona
 * cada 5 minutos.
 */
public class Motocicleta extends Vehiculo {
	//completadoAbel
	private float precioPorHora;

	/**
	 * Constructor de motocicleta
	 * 
	 * @param patente       patente de la motocicleta
	 * @param horaIngreso   hora del ingreso
	 * @param minutoIngreso minutos del ingreso
	 * @param precioPorHora precio de la hora completa de las motocicletas
	 */
	public Motocicleta(String patente, int horaIngreso, int minutoIngreso, float precioPorHora) {
		//completadoAbel
		super(patente, horaIngreso, minutoIngreso);
		this.precioPorHora = precioPorHora;
	}

	/**
	 * Valida que una patente sea válida para el tipo de vehiculo auto. debe tener
	 * formato de tres números y tres letas por ejemplo '182ABC'.
	 */
	public void validarPatente(String patente) throws IllegalArgumentException {

		//completadoAbel
			/*	if(!(patente.matches(getRegexSolo3Numeros()+getRegexSoloLetras()))) {
					throw new EstacionamientoException("patente de motocicleta errónea");
				}*/
		if(!(patente.matches(getRegexMoto()))) {
			throw new EstacionamientoException("patente de auto errónea");
		}
	}

	/**
	 * Calcula el importe de la estadia dela moto, recibiendo la hora y minutos de
	 * salida. Debe redondearse a 5 minutos la cantidad de minutos de la estadía,
	 * si la duración da 12 minutos, se deben cobrar 15.
	 * si la duración da 7 minutos, se deben cobrar 10.
	 */

	@Override
	public float calcularImporte(int horasEgreso, int minutosEgreso) throws IllegalArgumentException {
		//completadoAbel
		Hora tiempo = this.calcularTiempoEstadia(horasEgreso, redondear(minutosEgreso, CINCO));
		float importe = 0;
		float precioPorcada5Mins = getPrecioPorHora()/12; 
		int horasEnMins = tiempo.getHora()*60;
		int minutos = tiempo.getMinuto();
		int totalMins = horasEnMins+minutos;
		importe = (totalMins/5)*precioPorcada5Mins;
		return importe;
	}

	public float getPrecioPorHora() {
		return precioPorHora;
	}

}

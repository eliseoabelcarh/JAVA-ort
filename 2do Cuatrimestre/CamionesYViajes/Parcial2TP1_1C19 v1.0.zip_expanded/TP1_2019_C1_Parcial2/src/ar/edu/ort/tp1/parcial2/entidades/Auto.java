/**
 * 
 */
package ar.edu.ort.tp1.parcial2.entidades;

import exception.EstacionamientoException;

/**
 * Representa un auto a ser estacionado. el precio de los autos se fracciona
 * cada 10 minutos.
 */
public class Auto extends Vehiculo {

	// Completar
	private float precioPorHora;

	/**
	 * Constructor de auto
	 * 
	 * @param patente       patente del auto
	 * @param horaIngreso   hora del ingreso
	 * @param minutoIngreso minutos del ingreso
	 * @param precioPorHora precio de la hora completa de los autos
	 */
	public Auto(String patente, int horaIngreso, int minutoIngreso, float precioPorHora) {
		//CompletadoAbel
		super(patente, horaIngreso, minutoIngreso);
		this.precioPorHora = precioPorHora;
	}

	/**
	 * Valida que una patente sea válida para el tipo de vehiculo auto. debe tener
	 * formato de tres letras y tres números por ejemplo 'DSA182'.
	 */
	public void validarPatente(String patente) throws IllegalArgumentException {

		//completadoAbel
		/*if(!(patente.matches(getRegexSoloLetras()+getRegexSolo3Numeros()))) {
			throw new EstacionamientoException("patente de auto errónea");
		}*/
		
		if(!(patente.matches(getRegexAuto()))) {
			throw new EstacionamientoException("patente de auto errónea");
		}
		
	}

	/**
	 * Calcula el importe de la estadia del auto, recibiendo la hora y minutos de
	 * salida. Debe redondearse a 10 minutos la cantidad de minutos de la estadía,
	 * si la duración da 7 minutos, se deben cobrar 10.
	 */
	@Override
	public float calcularImporte(int horasEgreso, int minutosEgreso) throws IllegalArgumentException {
		//CompletadoAbel
		Hora tiempo = this.calcularTiempoEstadia(horasEgreso, redondear(minutosEgreso, DIEZ));
		float importe = 0;
		float precioPorcada10Mins = getPrecioPorHora()/6; 
		int horasEnMins = tiempo.getHora()*60;
		int minutos = tiempo.getMinuto();
		int totalMins = horasEnMins+minutos;
		importe = (totalMins/10)*precioPorcada10Mins;
		return importe;
	}

	public float getPrecioPorHora() {
		return precioPorHora;
	}

}

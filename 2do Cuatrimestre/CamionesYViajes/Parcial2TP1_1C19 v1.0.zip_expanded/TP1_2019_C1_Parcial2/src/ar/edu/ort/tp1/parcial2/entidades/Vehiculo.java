/**
 * 
 */
package ar.edu.ort.tp1.parcial2.entidades;

import java.time.Duration;
import java.time.LocalTime;

import exception.EstacionamientoException;

/**
 * Veh�culos estacionables en un estacionamiento
 */
public abstract class Vehiculo {

	protected static final int HORA = 60;
	protected static final int MEDIA_HORA = 30;
	protected static final int CINCO = 5;
	protected static final int CINCO_MINUTOS_POR_HORA = 12;
	protected static final int DIEZ = 10;
	protected static final int DIEZ_MINUTOS_POR_HORA = 6;
	protected static final String REGEX_SOLO_3_NUMEROS = "^\\d{3}$";
	protected static final String REGEX_SOLO_LETRAS = "^[a-zA-Z]+$";

	public static final String REGEX_AUTO = "[a-zA-Z]{2,2}[0-9]{3,3}[a-zA-Z]{2,2}|[a-zA-Z]{3,3}[0-9]{3,3}";
	public static final String REGEX_MOTO = "[0-9]{3,3}[a-zA-Z]{3,3}|[a-zA-Z]{1,1}[0-9]{3,3}[a-zA-Z]{3,3}";
	/**
	 * Patente del veh�culo
	 */
	private String patente;
	/**
	 * Hora de ingreso al estacionamiento
	 */
	private int horaIngreso;
	/**
	 * Minutos de ingreso al estacionamiento
	 */
	private int minutoIngreso;

	/**
	 * Constructor del veh�culo
	 * 
	 * @param patente       Patente
	 * @param horaIngreso   Hora del horario de ingreso
	 * @param minutoIngreso minutos del horario de ingreso
	 */
	public Vehiculo(String patente, int horaIngreso, int minutoIngreso) {
		setPatente(patente);
		setHoraIngreso(horaIngreso);
		setMinutoIngreso(minutoIngreso);
	}

	/**
	 * Valida que los minutos sean v�lidos (de 0 a 59 inclusive) debe lanzar una
	 * excepci�n {@link IllegalArgumentException} si no es v�lido
	 * 
	 * @param minutoIngreso
	 */
	private void setMinutoIngreso(int minutoIngreso) throws EstacionamientoException {
		//completadoAbel
		if(minutoIngreso > 59 || minutoIngreso < 0) {
			throw new EstacionamientoException("Minutos de ingreso inv�lidos");
		}
		else{
			this.minutoIngreso = minutoIngreso;
		}
	}

	/**
	 * Valida que los minutos sean v�lidos (de 0 a 23 inclusive) debe lanzar una
	 * excepci�n {@link IllegalArgumentException} si no es v�lido
	 * 
	 * @param horaIngreso
	 */
	private void setHoraIngreso(int horaIngreso) {
		//completadoAbel
		if(horaIngreso < 0 || horaIngreso > 23) {
			throw new IllegalArgumentException("Hora de Ingreso inv�lidos");
		}else {
			this.horaIngreso = horaIngreso;
		}

	}

	/**
	 * Setter de patente, que debe ser validada segun cada tipo de veh�culo
	 * 
	 * @param patente
	 */
	private void setPatente(String patente) throws EstacionamientoException{
		//completdoAbel
		try {
			validarPatente(patente);
			this.patente= patente;
		} catch (EstacionamientoException e) {
			throw new EstacionamientoException("Patente de veh�culo err�nea");
		}
		
	}

	/**
	 * Devuelve la patente
	 * 
	 * @return
	 */
	public String getPatente() {
		return this.patente;
	}

	/**
	 * Valida la patente en forma especifica para cada tipo de veh�culo. Para
	 * realizar la validaci�n pueden utilizar el m�todo
	 * <code>String.matches(regex)</code> utilizando las regex provistas como
	 * constantes REGEX_SOLO_3_NUMEROS y REGEX_SOLO_3_NUMEROS REGEX_SOLO_LETRAS
	 * 
	 * @param patente
	 * @throws IllegalArgumentException si la patente es inv�lida
	 */
	protected abstract void validarPatente(String patente) throws IllegalArgumentException;

	/**
	 * Calcula el importe que debe abonar el veh�culo en base a su tipo, el horario
	 * de ingreso que posee y el horario de egreso indicado Cada veh�culo debe
	 * poseer su algoritmo de calculo en base al fraccionamiento de minutos
	 * 
	 * @param horaEgreso
	 * @param minutosEgreso
	 * @return
	 * @throws IllegalArgumentException
	 */
	protected abstract float calcularImporte(int horaEgreso, int minutosEgreso) throws IllegalArgumentException;

	/**
	 * @return the horaIngreso
	 */
	public int getHoraIngreso() {
		return horaIngreso;
	}

	/**
	 * @return the minutoIngreso
	 */
	public int getMinutoIngreso() {
		return minutoIngreso;
	}

	/**
	 * Metodo helper que calcula el tiempo de la estadia, siendo devuelto en un
	 * objeto del tipo {@link Hora}
	 * 
	 * @param horaSalida
	 * @param minutoSalida
	 * @return
	 */
	public Hora calcularTiempoEstadia(int horaSalida, int minutoSalida) {

		LocalTime horarioIngreso = LocalTime.of(this.horaIngreso, this.minutoIngreso);
		LocalTime horarioEgreso = LocalTime.of(horaSalida, minutoSalida);
		Duration duration = Duration.between(horarioIngreso, horarioEgreso);

		return new Hora((int) duration.toHours(), (int) duration.toMinutes() % 60);

	}

	/**
	 * Redondea el n�mero de minutos de egreso a una base, si la base es 5, y el nro
	 * de minutos es 2 devolver� 5, si el nro de minutos es 7 devolvera 10
	 * 
	 * @param minutosEgreso
	 * @param i
	 * @return
	 */
	protected int redondear(int minutosEgreso, int base) {
		return minutosEgreso + (base - minutosEgreso % base);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [patente=" + patente + ", horaIngreso=" + horaIngreso
				+ ", minutoIngreso=" + minutoIngreso + "]";
	}

	public static String getRegexSolo3Numeros() {
		return REGEX_SOLO_3_NUMEROS;
	}

	public static String getRegexSoloLetras() {
		return REGEX_SOLO_LETRAS;
	}

	public static String getRegexAuto() {
		return REGEX_AUTO;
	}

	public static String getRegexMoto() {
		return REGEX_MOTO;
	}

	
	
	
	
}

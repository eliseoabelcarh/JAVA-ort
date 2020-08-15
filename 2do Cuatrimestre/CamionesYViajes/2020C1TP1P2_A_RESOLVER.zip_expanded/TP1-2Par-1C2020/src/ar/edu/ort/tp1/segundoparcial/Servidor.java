package ar.edu.ort.tp1.segundoparcial;

import ar.edu.ort.tp1.segundoparcial.Analisis.Resultado;

public class Servidor {
	private int numero;
	private String SO;
	private Cola<Actividad> actividades;
	private Pila<Actividad> actualizaciones;

	// 2 - Completar el constructor
	public Servidor(int numero, String SO) {
		setNumero(numero);
		setSO(SO);
		this.actividades = new Cola<Actividad>();
		this.actualizaciones = new Pila<Actividad>();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) throws IllegalArgumentException {
		if (numero < 0 || numero > 1000) {
			throw new IllegalArgumentException("El numero del Sistema Operativo no puede ser menor a 0 o mayor a 1000");
		}
		this.numero = numero;
	}

	public String getSO() {
		return SO;
	}

	private void setSO(String sO) {
		SO = sO;
	}

	public void agregarActividad(Actividad act) {
		actividades.add(act);
		if (act instanceof Actualizacion)
			actualizaciones.push(act);
	}

	// 5 - Mostrar todas las Actividades para cada servidor
	//completadoAbel
	public void mostrarActividad() {
		Actividad centinela = new Analisis("***");
		Actividad actividad;
		
		this.actividades.add(centinela);
		actividad = actividades.pool();
		
		while(actividad != centinela) {
			actividad.mostrar();
			this.actividades.add(actividad);
			actividad = actividades.pool();
		}		
	}

	// 6 - Desarrolla el mostrar actualizaciones que te haya tocado
	public void mostrarActualizacionesN() {
		
		//completadoAbel
		Pila<Actividad> pilaAux = new Pila<Actividad>();
		Actividad actualizacion;
		
		while(!this.actualizaciones.isEmpty()) {
			actualizacion = actualizaciones.pop();
			pilaAux.push(actualizacion);
		}
		while(!pilaAux.isEmpty()){
			actualizacion = pilaAux.pop();
			actualizacion.mostrar();
			this.actualizaciones.push(actualizacion);
		}
	}

	// 7 - Desarrolla el metodo estadistico que te haya sido requerido.
	public void correrEstadisticaN() {
		//completadoAbel	
		Actividad centinela = new Analisis("***");
		Actividad actividad;
		int cont = 0;
		this.actividades.add(centinela);
		actividad = actividades.pool();
		while(actividad != centinela) {
			if(actividad instanceof Analisis) {
				if(((Analisis) actividad).getResultAnalisis() == Resultado.INFECTADO) {
					cont++;
					String desc = actividad.getDesc();
					String estado = Resultado.INFECTADO.name();
					System.out.println("Análisis archivo infectado: " + desc + " " + estado);
				}
			}
			this.actividades.add(actividad);
			actividad = actividades.pool();
		}
		System.out.println("Cantidad de archivoss infectados: " + cont);
	}

	@Override
	public String toString() {
		return "Servidor:" + numero + ", S.O. " + SO;
	}

}
package hito;

import java.util.ArrayList;
import java.util.Date;

import persona.Persona;

public class Hito {
	
	private Date fecha;
	private String descripcion;
	private ArrayList<Persona> personas;

	public Hito(String descripcion) {
		this.fecha = new Date() ;
		this.descripcion = descripcion;
		this.personas = new ArrayList<Persona>();
	}
}

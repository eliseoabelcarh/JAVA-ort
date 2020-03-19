package cursada;
import profesor.Profesor;

import java.util.ArrayList;
import alumno.Alumno;
import curso.Curso;

public class Cursada {
	
	private String fechaDeApertura;
	private int cupoInscriptos;
	private Profesor profesor;
	private Curso curso;
	private ArrayList<Alumno> alumnos;
	
	
	
	public Cursada(String fechaDeApertura, int cupoInscriptos, Profesor profesor, Curso curso) {
		super();
		this.alumnos= new ArrayList<Alumno>();
		this.fechaDeApertura = fechaDeApertura;
		this.cupoInscriptos = cupoInscriptos;
		this.profesor = profesor;
		this.curso = curso;
	}
	public String getFechaDeApertura() {
		return fechaDeApertura;
	}
	public void setFechaDeApertura(String fechaDeApertura) {
		this.fechaDeApertura = fechaDeApertura;
	}
	public int getCupoInscriptos() {
		return cupoInscriptos;
	}
	public void setCupoInscriptos(int cupoInscriptos) {
		this.cupoInscriptos = cupoInscriptos;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	@Override
	public String toString() {
		return "Cursada [fechaDeApertura=" + fechaDeApertura + ", cupoInscriptos=" + cupoInscriptos + ", profesor="
				+ profesor + ", curso=" + curso + ", alumnos=" + alumnos + "]";
	}


	
}

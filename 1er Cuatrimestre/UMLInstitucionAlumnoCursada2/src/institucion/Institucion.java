package institucion;
import alumno.Alumno;
import cursada.Cursada;
import curso.Curso;

import java.util.ArrayList;
import escolaridad.Escolaridad;
import profesor.Profesor;

public class Institucion {
	
	private String nombre;
	private ArrayList<Alumno> alumnos;
	private ArrayList<Profesor> profesores;
	
	
	
	public Institucion(String nombre) {
		super();
		this.nombre = nombre;
		this.alumnos = new ArrayList<Alumno>();
		this.profesores = new ArrayList<Profesor>();
	}


	public Alumno buscarAlumnoPorDocumento(String dniAlumno) {
		Alumno alumnoBuscado=null;
		boolean alumnoEncontrado= false;
		int i=0;
		while(i< this.alumnos.size() && !alumnoEncontrado) {
			
			if(this.alumnos.get(i).getDni().equals(dniAlumno)) {
				alumnoBuscado= this.alumnos.get(i);
				alumnoEncontrado=true;
			}
			
			i++;
		}
				
		return alumnoBuscado;
	}
	
	
	public boolean registrarAlumno(String dni, String nombre, String apellido, Escolaridad escolaridad) {
		boolean result= false;
		
		if(buscarAlumnoPorDocumento(dni) == null  ) {
			
			this.alumnos.add(new Alumno(dni, nombre, apellido, escolaridad));
			result= true;
		}
		
		return result;	
		
	}
	
	
	public boolean inscribirAlumnoEnCurso(String dniAlumno, Cursada cursada) {
		boolean result= false;
		Escolaridad escolaridadMinima;
		escolaridadMinima=cursada.getCurso().getEscolaridad();
		int cuposDisponible;
		cuposDisponible=cursada.getCupoInscriptos();
		
		Alumno alumno;
		alumno=buscarAlumnoPorDocumento(dniAlumno);
		if(    alumno !=null && (alumno.getEscolaridad() == escolaridadMinima  ) && (cuposDisponible >0) ) {
			
			cursada.getAlumnos().add(alumno);
			cursada.setCupoInscriptos(cuposDisponible - 1);
			result=true;
		}
				
		return result;
		
	}
	
	public Cursada crearCursada(String fechaDeApertura, int cupoInscriptos, Profesor profesor, Curso curso) {
		Cursada cursada = new Cursada(fechaDeApertura, cupoInscriptos, profesor, curso);
		return cursada;
	}


	public Profesor buscarProfesor	(String nombre) {
		
		Profesor profesorBuscado= null;
		boolean encontrado=false;
		for(Profesor profesor : profesores) {
			if(profesor.getNombre().equals(nombre) && !encontrado) {
				profesorBuscado=profesor;
				encontrado= true;
			}
		}
		return profesorBuscado;
		
	}
	
	public boolean registrarProfesor(String nombre) {
		boolean result=false;
		if(buscarProfesor(nombre) ==null) {
			Profesor profesor = new Profesor(nombre);
			this.profesores.add(profesor);
			result=true;
			
		}		
		return result;
	}
	
	public Curso crearCurso(String nombre, Escolaridad escolaridad) {
		Curso curso = new Curso(nombre, escolaridad);
		return curso;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}



	
	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}


	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}


	@Override
	public String toString() {
		return "Institucion [nombre=" + nombre + ", alumnos=" + alumnos + ", profesores=" + profesores + "]";
	}



}

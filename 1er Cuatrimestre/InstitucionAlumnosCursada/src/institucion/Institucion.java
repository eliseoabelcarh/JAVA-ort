package institucion;
import alumno.Alumno;
import java.util.ArrayList;
import cursada.Cursada;
public class Institucion {
	
	String nombre;
	ArrayList<Alumno> alumnos;

	
	
	
	
	public Institucion(String nombre) {
		super();
		this.nombre = nombre;
		this.alumnos = new ArrayList<Alumno>();
	}

	public Alumno buscarAlumnoPorDni(String dni) {
		Alumno alumnoBuscado=null;
		for(int i= 0; i< alumnos.size();i++) {
			if(dni.equals(alumnos.get(i).getDni())) {
				alumnoBuscado=alumnos.get(i);
			}
		}
		return alumnoBuscado;
	}
	
	public boolean registrarAlumno(String dni,String nombre, String apellido, boolean escolaridad){
		boolean result= false;
		if(buscarAlumnoPorDni(dni)==null) {
			this.alumnos.add(new Alumno(dni,nombre,apellido,escolaridad));
			result=true;
		}
		return result;
	}
	
	public boolean inscribirAlumnoEnCurso(String dni, Cursada cursada) {
		boolean result=false;
			Alumno alumno;
			alumno=buscarAlumnoPorDni(dni);
		if(cursada.hayEspacio() && !(cursada.yaEstaInscripto(alumno))) {
			
			cursada.getAlumnos().add(alumno);
			result = true;
		}
		return result;
	}

	@Override
	public String toString() {
		return "Institucion [nombre=" + nombre + ", alumnos=" + alumnos + "]";
	}
	
	
	
	
	
}

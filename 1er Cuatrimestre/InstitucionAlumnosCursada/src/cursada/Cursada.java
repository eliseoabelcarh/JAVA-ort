package cursada;
import alumno.Alumno;
import profesor.Profesor;
import java.util.ArrayList;

public class Cursada {
	
	
	String fechaApertura;
	int cupoInscriptos;
	Profesor profesor;
	ArrayList<Alumno> alumnos;
	
	
	public Cursada(String fechaApertura, int cupoInscriptos, Profesor profesor) {
		super();
		this.fechaApertura = fechaApertura;
		this.cupoInscriptos = cupoInscriptos;
		this.profesor = profesor;
		this.alumnos= new ArrayList<Alumno>();
	}
	
	
	public boolean hayEspacio(){
		boolean result= true;
		
		if(this.alumnos.size()>=this.cupoInscriptos) {
			result= false;
							}
		return result;
	}


	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	
	public boolean yaEstaInscripto(Alumno alumno) {
		boolean result=false;
		for(int i=0; i<alumnos.size();i++) {
			if(alumno == alumnos.get(i)) {result = true;}
		}
		return result;
	}


	@Override
	public String toString() {
		return "Cursada [fechaApertura=" + fechaApertura + ", cupoInscriptos=" + cupoInscriptos + ", profesor="
				+ profesor + ", alumnos=" + alumnos + "]";
	}
	
	

}

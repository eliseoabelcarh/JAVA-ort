package principal;
import alumno.Alumno;
import cursada.Cursada;
import institucion.Institucion;
import profesor.Profesor;

public class Principal {

	public static void main(String[] args) {

		
		Institucion institucion = new Institucion("UBA");
		Profesor profesor = new Profesor(" jose");
		Cursada cursada = new Cursada ("15-15-15",1 , profesor);
		
		//TODO agregar arraylist  de Cursadas a classe insitucion
		
		System.out.println(institucion);
		System.out.println(cursada);
		
		boolean resultado;
		resultado= institucion.registrarAlumno("111", "carlos","gonzals", true);
		System.out.println(resultado);
		
		boolean resultado1;
		resultado1= institucion.registrarAlumno("222", "jose","solano", true);
		System.out.println(resultado1);
		
		
		boolean resultado2;
		resultado2= institucion.inscribirAlumnoEnCurso("111", cursada);
		System.out.println(resultado2);
		
		boolean resultado3;
		resultado3= institucion.inscribirAlumnoEnCurso("222", cursada);
		System.out.println(resultado3);
		
		System.out.println(institucion);
		System.out.println(cursada);
		
		
	}

}

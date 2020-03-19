package test;
import institucion.Institucion;
import escolaridad.Escolaridad;
import curso.Curso;
import profesor.Profesor;
import cursada.Cursada;


public class Test {

	public static void main(String[] args) {


		Institucion institucion = new Institucion("ORT");
		
		boolean registroExitoso;
		registroExitoso=institucion.registrarAlumno("1111","jose","messi",Escolaridad.SECUNDARIO);
		System.out.println(registroExitoso);
		
		boolean registroProfe;
		registroProfe=institucion.registrarProfesor("martin");
		Profesor profesor;
		profesor= institucion.buscarProfesor("martin");
		System.out.println(registroProfe);
		
		Curso curso;
		curso=institucion.crearCurso("THP",Escolaridad.SECUNDARIO);
		System.out.println(curso);
		
		Cursada cursada;
		cursada=institucion.crearCursada("15/02/2019", 5, profesor, curso);
		System.out.println(cursada);
		
		boolean inscripto;
		inscripto=institucion.inscribirAlumnoEnCurso("1111", cursada);
		System.out.println(inscripto);
		
		
		System.out.println(cursada);
		
		System.out.println(institucion);
	}

}

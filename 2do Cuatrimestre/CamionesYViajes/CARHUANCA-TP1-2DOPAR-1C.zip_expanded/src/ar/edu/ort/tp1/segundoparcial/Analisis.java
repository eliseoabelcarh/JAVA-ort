package ar.edu.ort.tp1.segundoparcial;

public class Analisis extends Actividad {
	
	public enum Resultado { OK, INFECTADO };
	
	private Resultado resultAnalisis;

	// 3 - Complear el constructor
	//completadoAbel
	//constructor de analisis
	public Analisis(String fecha, String hora, char es, String desc, Resultado resultAnalisis) {
		super(fecha, hora, es, desc);
		setResultAnalisis(resultAnalisis);
	}

	//constructor opcional para centinelas
	public Analisis(String fecha) {
		super(fecha);
	}
	

	public Resultado getResultAnalisis() {
		return resultAnalisis;
	}

	public void setResultAnalisis(Resultado resultAnalisis) {
		this.resultAnalisis = resultAnalisis;
	}

	// 4 - Completar
	public void mostrar() {
		super.mostrar();
		System.out.println(": " + getResultAnalisis());
	}

	@Override
	public String showTipo() {
		return "Analisis";
	}
}

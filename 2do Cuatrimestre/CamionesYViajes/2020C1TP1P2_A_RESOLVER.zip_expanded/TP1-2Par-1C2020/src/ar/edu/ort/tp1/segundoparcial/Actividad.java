package ar.edu.ort.tp1.segundoparcial;

public abstract class Actividad {
	private static int _ultimo = 0;
	private int nro;
	private FechaHora fechahora;
	private String desc;
	private char e_o_s;

	public Actividad(String fecha, String hora, char es) {
		this(fecha, hora, es, "sin desc");
	}

	public Actividad(String fecha, String hora, char es, String desc) {
		asignarNro();
		fechahora = new FechaHora(fecha, hora);
		this.desc = desc;
		e_o_s = es;
	}
	public Actividad(String fecha) {
		//constructor opcional para usar centinelas
		this.fechahora = new FechaHora(fecha, "");
	}

	public String getNomarch() {
		return desc;
	}

	void setNomarch(String desc) {
		this.desc = desc;
	}

	public FechaHora getFechaHora() {
		return fechahora;
	}

	protected int getNumero() {
		return nro;
	}

	public char getE_S() {
		return e_o_s;
	}

	public void mostrarFechaYHora() {
		String hora = fechahora.getHora();
		String fecha = fechahora.getFecha();
		System.out.print(fecha.substring(0, 4) + "/" + fecha.substring(4, 6) + "/" + fecha.substring(6, 8) + " ");
		System.out.print(hora.substring(0, 2) + ":" + hora.substring(2, 4));
	}

	protected void mostrar() {
		System.out.print(getNumero() + " - " + showTipo() + ' ');
		mostrarFechaYHora();
		System.out.print(" [" + e_o_s + "] ");
		System.out.print(desc);
	}

	private void asignarNro() {
		nro = ++_ultimo;
	}

	public static int getCantidad() {
		return _ultimo;
	}

	public abstract String showTipo();

	protected String getDesc() {
		return desc;
	}
	
	
	
	
}
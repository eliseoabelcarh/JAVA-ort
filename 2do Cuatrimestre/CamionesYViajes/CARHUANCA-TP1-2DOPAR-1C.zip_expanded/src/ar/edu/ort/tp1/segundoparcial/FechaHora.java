package ar.edu.ort.tp1.segundoparcial;

public class FechaHora {
	private String fecha;
	private String hora;

	public FechaHora(String fecha, String hora) {
		this.fecha = fecha;
		this.hora = hora;
	}
	public String getFecha() {
		return fecha;
	}
	public String getHora() {
		return hora;
	}
	public void Mostrar() {
		System.out.println(fecha+"-"+hora);
	}
}

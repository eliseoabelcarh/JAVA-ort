package programa;


public class Tamagotchi implements IJuego {

	private Estado estadoActual;
	private RespuestaGenerator respuestaGenerator;
	private EstadoGenerator estadoGenerator;
	
	public Tamagotchi() {
		this.respuestaGenerator = new RespuestaGenerator();
		this.estadoGenerator = new EstadoGenerator();
		this.estadoActual = this.estadoGenerator.solicitar();//devuelve random
	}
	public Tamagotchi(Estado estado) {
		this.respuestaGenerator = new RespuestaGenerator();
		this.estadoGenerator = new EstadoGenerator();
		this.estadoActual = estado;
	}
	
	@Override
	public void ejecutar(Accion accion) {
		Respuesta respuesta = this.respuestaGenerator.solicitar(accion, this.estadoActual);
		System.out.println("se ejecutó "+ accion + ", la respuesta es: " + respuesta);
	}
	
	
	
	@Override
	public void mostrarMiEstado() {
		System.out.println("estado actual es: " + this.estadoActual);
	}
}

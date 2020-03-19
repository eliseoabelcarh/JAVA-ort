package reserva;
import cancha.Cancha;
import arbitro.Arbitro;


public class Reserva {
	
	Cancha cancha;
	int dia;
	int hora;
	Arbitro arbitro;
	String nombreReserva;
	double senia;
	
	
	
	
	
	
	
	public Reserva(Cancha cancha, int dia, int hora, Arbitro arbitro, String nombreReserva, double senia) {
		super();
		this.cancha = cancha;
		this.dia = dia;
		this.hora = hora;
		this.arbitro = arbitro;
		this.nombreReserva = nombreReserva;
		this.senia = senia;
	}
	
	
	
	public void setArbitro(Arbitro arbitro) {
		this.arbitro = arbitro;
	}
	
	public void setNombreReserva(String nombreReserva) {
		this.nombreReserva = nombreReserva;
	}

	public void setSenia(double senia) {
		this.senia = senia;
	}
	
	

}

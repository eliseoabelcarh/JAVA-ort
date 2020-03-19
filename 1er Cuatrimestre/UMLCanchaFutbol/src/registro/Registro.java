package registro;

import java.util.ArrayList;
import dia.Dia;
import horario.Horario;
import cancha.Cancha;
import reserva.Reserva;
import arbitro.Arbitro;


public class Registro {
	
	private ArrayList<Reserva> reservas;
	private ArrayList<Cancha> canchas;
	private ArrayList<Arbitro> arbitros;
	
	
	
	public Registro() {
		
		this.canchas = new ArrayList<Cancha>();
		this.reservas= new ArrayList<Reserva> ();
		this.arbitros = new ArrayList<Arbitro>();
	}

	
	public Cancha buscarCanchaDisponible(int dia, int hora) {
		Cancha canchaDisponible = null;
		boolean encontrado = false;
		int i=0;
		
		while(i<this.canchas.size() && !encontrado) {
			
			Cancha cancha;
			cancha= this.canchas.get(i);
			Dia diaAux;
			diaAux=cancha.getDia(dia);
			Horario horario;
			horario=diaAux.getHorario(hora);
			
			if(horario.getEstado().equals("libre")) {
				canchaDisponible = cancha;
				encontrado=true;
			}
			i++;
		}		
		return canchaDisponible;
		
	}
	
	
	
	
	public Arbitro buscarArbitroDisponible(int dia, int hora) {
		Arbitro arbitroDisponible=null;

		boolean encontrado = false;
		int i = 0;

		while (i < this.arbitros.size() && !encontrado) {

			Arbitro arbitroAux;
			arbitroAux = this.arbitros.get(i);
			Dia diaAux;
			diaAux = arbitroAux.getDia(dia);
			Horario horarioAux;
			horarioAux = diaAux.getHorario(hora);

			if (horarioAux.getEstado().equals("libre")) {
				arbitroDisponible = arbitroAux;
				encontrado = true;
			}
			i++;

		}

		return arbitroDisponible;
		
	}
	
	
	public Reserva crearReserva(Cancha cancha, Arbitro arbitro, int dia, int hora, String nombreReserva, double senia) {
		
		cancha.getDia(dia).getHorario(hora).setEstado("reservado");
		arbitro.getDia(dia).getHorario(hora).setEstado("reservado");
		
		Reserva reserva = new Reserva(cancha, dia, hora, arbitro, nombreReserva, senia);
		
		return reserva;
	}
	
	
	
	
	
	
}

package empresa;
import java.util.Scanner;
import java.util.ArrayList;
import cancha.Cancha;
import registro.Registro;//
import arbitro.Arbitro;
import reserva.Reserva;



public class Empresa {
	
	private Registro registro;
	
	
	public Empresa (){
		this.registro = new Registro();
	}
	
	
	Scanner lector = new Scanner (System.in);
	
	
	
	
	public boolean reservarCancha() {
		
		boolean result=false;
		
		int dia;
		int hora;
		
		//TODO validar hora y dia
		//mostrar mensaje por pantalla
		dia=lector.nextInt();
	    lector.nextLine();
		hora=lector.nextInt();
	    lector.nextLine();
	    
		Cancha cancha;
		cancha=this.registro.buscarCanchaDisponible(dia, hora);
		
		if(cancha==null) {
			System.out.println("informar cliente no hay cancha para ese horario y dia");
		}
		
		Arbitro arbitro;
		arbitro=this.registro.buscarArbitroDisponible(dia, hora);
	
		if(arbitro==null){
			System.out.println("informar cliente no hay arbitro para ese horario y dia");
		}
		
		
		if(cancha != null && arbitro != null) {
			String nombreReserva;
			double senia;
			//mostrar mensaje por pantalla
			nombreReserva= lector.next();
		    senia= lector.nextDouble();
		    lector.nextLine();
			Reserva reserva;
			reserva=this.registro.crearReserva(cancha, arbitro, dia, hora, nombreReserva, senia);
			System.out.println(reserva);
			result=true;
			
		}
		
		return result;
	}
	


	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

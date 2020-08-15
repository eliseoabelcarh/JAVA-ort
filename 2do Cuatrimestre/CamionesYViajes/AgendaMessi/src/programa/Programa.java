package programa;


import duenioMascota.DuenioMascota;
import email.Email;
import mascota.Mascota;
import numeroTelefonico.NumeroTelefonico;
import persona.Persona;
import tipoDeLinea.TipoDeLinea;

public class Programa {
	
	
	
	
	public static void main(String[] args) {
		
	

		DuenioMascota p = new DuenioMascota("Lionel","Messi");
		NumeroTelefonico nro = new NumeroTelefonico(011,4411,54,TipoDeLinea.FIJO);
		Email email = new Email("lio@messi.com");
		p.agregarEmail(email);
		p.agregarTelefono(nro);
		
		Mascota mascota = new Mascota("firulais", "perro");
		p.adoptar(mascota);
		
		
		p.mostrarTodo();
		
		
				
	}

}

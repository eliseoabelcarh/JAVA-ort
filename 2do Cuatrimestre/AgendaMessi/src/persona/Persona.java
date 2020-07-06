package persona;

import java.util.ArrayList;

import email.Email;
import hito.Hito;
import numeroTelefonico.NumeroTelefonico;

public class Persona {
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> emails;
	private ArrayList<Hito> hitos;

	public Persona(String nombre, String apellido) {
		this.nombre =  nombre;
		this.apellido = apellido;
		this.telefonos = new ArrayList<NumeroTelefonico>();
		this.emails = new ArrayList<Email>();
		this.hitos = new ArrayList<Hito>();
		
	}
	
	public void mostrarTodo() {
		System.out.println(this.toString());
	}
	public void agregarTelefono(NumeroTelefonico nroTelefonico) {
		this.telefonos.add(nroTelefonico);
	}
	public void agregarEmail(Email email) {
		this.emails.add(email);
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", telefonos=" + telefonos + ", emails="
				+ emails + "]";
	}
	
	
	
	
}
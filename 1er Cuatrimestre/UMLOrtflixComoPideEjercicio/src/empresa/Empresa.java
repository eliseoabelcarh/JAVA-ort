package empresa;
import resultado.Resultado;
import cliente.Cliente;
import capitulo.Capitulo;
import contenido.Contenido;
import java.util.ArrayList;
import pelicula.Pelicula;

public class Empresa {

	String nombre;
	Contenido contenido;
	ArrayList<Cliente> clientes;
	
	
	
	public Resultado verPelicula(String dni, String nombrePelicula) {
		Resultado resultado=null;
		
		Cliente cliente;
		cliente=buscarPorDni(dni);
		Pelicula pelicula;
		pelicula=this.contenido.buscarPelicula(nombrePelicula);
		boolean tieneDeuda;
		tieneDeuda=cliente.tieneDeuda();
		boolean puedeVer;
		puedeVer=puedeVerPelicula(cliente,pelicula);
		
		if(cliente !=null) {
			if(pelicula != null) {
				if(!tieneDeuda) {
					if(puedeVer) {
						
						cliente.agregarPeliculaAlHistorial(pelicula);
						
						resultado= Resultado.ALQUILER_OK;
						
					} else {resultado= Resultado.CONTENIDO_NO_DISPONIBLE;}
				} else {resultado= Resultado.CLIENTE_DEUDOR;}
			} else {resultado=Resultado.CONTENIDO_INEXISTENTE;}
		} else {resultado = Resultado.CLIENTE_INEXISTENTE;}
		
		
		return resultado;
	}
	
	public Resultado verSerie (Cliente cliente, Capitulo capitulo) {
		Resultado resultado=null;
		
		boolean tieneDeuda;
		tieneDeuda=cliente.tieneDeuda();
		boolean puedeVer;
		puedeVer=puedeVerCapitulo(cliente,capitulo);
		
		if(cliente !=null) {
			if(capitulo != null) {
				if(!tieneDeuda) {
					if(puedeVer) {
						
						cliente.agregarCapituloAlHistorial(capitulo);
						
						resultado= Resultado.ALQUILER_OK;
						
					} else {resultado= Resultado.CONTENIDO_NO_DISPONIBLE;}
				} else {resultado= Resultado.CLIENTE_DEUDOR;}
			} else {resultado=Resultado.CONTENIDO_INEXISTENTE;}
		} else {resultado = Resultado.CLIENTE_INEXISTENTE;}
		
		return resultado;
	}
	
	
	public Cliente buscarPorDni(String dni) {
		Cliente cliente= null;
		boolean encontrado= false;
		int i=0;
		
		while(i< this.clientes.size() && !encontrado) {
			if(this.clientes.get(i).getDni().equals(dni)) {
				encontrado=true;
				cliente=this.clientes.get(i);
			}
		}
		
		return cliente;
	}
	
	public boolean puedeVerPelicula(Cliente cliente, Pelicula pelicula) {
		boolean result=false;
		
		if(pelicula.esPremium()) {
			if(cliente.esPremium()) {result= true;} else {result= false;}
		} else {result= true;}
				
		return result;
	}
	
	public boolean puedeVerCapitulo(Cliente cliente, Capitulo capitulo) {
		boolean result=false;
		
		if(capitulo.esPremium()) {
			if(cliente.esPremium()) {result= true;} else {result= false;}
		} else {result= true;}
				
		return result;
	}
	
}

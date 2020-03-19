package agencia;
import java.util.ArrayList;
import paquete.Paquete;
import cliente.Cliente;
import ciudad.Ciudad;

public class Agencia {
	
	private String nombre;
	private ArrayList<Paquete> paquetes;
	private ArrayList<Cliente> clientes;
	
	
	
	public ArrayList<Paquete> obtenerPaquetesPorCiudad(Ciudad ciudad){
		
		ArrayList<Paquete> paquetesPorCiudad = new ArrayList<Paquete>(); 
		
		for(Paquete paquete: this.paquetes) {
			if(paquete.getCiudad() == ciudad) {
				paquetesPorCiudad.add(paquete);
			}
		}
		
		return paquetesPorCiudad;
	}

	
	
	public void mostrarPaquetesPorCiudad(Ciudad ciudad) {
		
		ArrayList<Paquete> paquetesLeidos;
		paquetesLeidos=obtenerPaquetesPorCiudad(ciudad);
		
		if(paquetesLeidos !=null) {
		
		for(Paquete paquete: paquetesLeidos) {
			System.out.println(paquete.toString());
		}
		} else {System.out.println("No existen ofertas de paquetes para la ciudad deseada en la actualidad  ");}
		
		
	}
	
	
	
	
	
}

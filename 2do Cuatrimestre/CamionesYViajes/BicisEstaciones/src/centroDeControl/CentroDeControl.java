package centroDeControl;

import java.util.ArrayList;

import bici.Bici;
import estacionDeBicis.EstacionDeBicis;

public class CentroDeControl {

	public final static int CANTIDAD_INICIAL_BICIS = 3;
	public static int proximoIdBici;
	public static int proximoIdEstacion;
	
	
	public static void main(String[] args) {
		proximoIdBici= 0;
		proximoIdEstacion= 0;
		
		EstacionDeBicis estacion1 = crearEstacionDeBicis(proximoIdEstacion,"Parque Centenario" );
		EstacionDeBicis estacion2 = crearEstacionDeBicis(proximoIdEstacion,"Parque Rivadavia" );

		Bici bici = estacion1.retirarBici();
		bici.notificarAveria();
		estacion1.anclar(bici);
		System.out.println(" ");
		
		Bici bici2 = estacion1.retirarBici();
		estacion2.anclar(bici2);
		System.out.println(" ");
		
		estacion1.mostrarBicisDisponibles();
		estacion1.mostrarAnclajesLibres();
		System.out.println(" ");
		
		mostrarBicisAveriadas(estacion1);
		System.out.println(" ");
		mostrarBicisAveriadas(estacion2);
		
	}
	
	
	
	
	/**
	 * Crea una instancia de EstacionDeBicis con el id recibido y la devuelve
	 * llena con la cantidad inicial de bicis definida.
	 * 
	 * @param id
	 *            Id de la estacion.
	 * @return la instancia de EstacionDeBicis
	 */
	public static EstacionDeBicis crearEstacionDeBicis(int id, String ubicacion) {
		proximoIdEstacion++;
		EstacionDeBicis nuevaEstacion = new EstacionDeBicis(proximoIdEstacion, ubicacion);
		System.out.println("se ha creado la estación " + nuevaEstacion.getUbicacion() + " (" + nuevaEstacion.getId() + ")");
		boolean existoso = agregarBicis(CANTIDAD_INICIAL_BICIS, nuevaEstacion);
		if(existoso) {
			System.out.println(" ");
		}
		return nuevaEstacion;
	}
	
	/**
	 * Extrae las bicis averiadas de la estacion y las muestra.
	 * 
	 * @param estacion
	 */
	public static void mostrarBicisAveriadas(EstacionDeBicis estacion) {
		ArrayList<Bici> bicisAveriadas  = estacion.listaBicisAveriadas();
		
		if(bicisAveriadas.size() != 0) {
			for (int i = 0; i < bicisAveriadas.size(); i++) {
				System.out.println("Bicis averiadas en la estación " + estacion.getId() +":");
				System.out.println("Bici " + bicisAveriadas.get(i).getId());
				bicisAveriadas.get(i).mostrarBitacora();
			}
		}
		else {
			System.out.println("No se encontraron bicis averiadas en la estación "+ estacion.getId());
		}
	}
	
	
	
	
	public static boolean agregarBicis(int cantidad, EstacionDeBicis estacion) {
		boolean resultado = false; 
		int cantidadLibres = estacion.devolverCantidadAnclajesLibres();
		if(cantidadLibres >= cantidad) {
			for (int i = 0; i < cantidad; i++) {
				Bici biciNueva = new Bici(proximoIdBici+1);
				if(estacion.anclar(biciNueva)) {
					proximoIdBici++;
					resultado = true;
				}
			}	
		}
		else
		{
			System.out.println("no se pudo agregar, la cantidad de anclajes libres es "+ cantidadLibres);
		}
		return resultado;
	}
	
	
}

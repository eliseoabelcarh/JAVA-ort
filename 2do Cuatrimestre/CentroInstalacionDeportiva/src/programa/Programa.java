package programa;
import centro.Centro;
import socio.Socio;
import tipoArticulo.TipoArticulo;
import tipoInstalacion.TipoInstalacion;
import articulo.Articulo;
import instalacion.Instalacion;
import reserva.Reserva;

public class Programa {

	public static void main(String[] args) {

		Socio socio1;
		Reserva reserva1;
	
		Instalacion gimnasio = new Instalacion(TipoInstalacion.GIMNASIO);
		Instalacion piscina = new Instalacion(TipoInstalacion.PISCINA);
		Articulo pelota = new Articulo(TipoArticulo.PELOTA);
		Articulo raqueta = new Articulo(TipoArticulo.RAQUETA);
		
		
		Centro centro = new Centro();
		centro.addInstalacion(gimnasio);
		centro.addInstalacion(piscina);
		centro.addArticulo(pelota);
		centro.addArticulo(raqueta);
		socio1 = centro.registrarSocio("socioJose");
		reserva1 = centro.crearReserva(socio1, piscina);
		centro.addArticuloAReserva(reserva1, pelota);
		
		System.out.println(centro.toString());
		

	}

	
	
}

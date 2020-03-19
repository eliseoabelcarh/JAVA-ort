package reserva;
import instalacion.Instalacion;

import java.util.Arrays;

import articulo.Articulo;

import socio.Socio;


public class Reserva {
	
	private String fecha;
	private String horaInicio;
	private String horaFin;
	private Instalacion instalacion;
	private Socio socio;
	private Articulo[] articulos;
	
	public Reserva(Socio socio, Instalacion instalacion) {
		this.fecha = "";
		this.horaInicio = "";
		this.horaFin = "";
		this.instalacion = instalacion;
		this.socio = socio;
		this.articulos = new Articulo[5];
	}
	
	public boolean addArticulo(Articulo articulo) {
		
		boolean nullEncontrado = false;
		int i = 0;
		while(!nullEncontrado && i < this.articulos.length) {
			if(articulo != null) {
				this.articulos[i] = articulo;
				nullEncontrado = true;
			}
			i++;
		}
		
		return nullEncontrado;
		
	}

	@Override
	public String toString() {
		return "Reserva [fecha=" + fecha + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", instalacion="
				+ instalacion + ", socio=" + socio + ", articulos=" + Arrays.toString(articulos) + "]";
	}

	
}

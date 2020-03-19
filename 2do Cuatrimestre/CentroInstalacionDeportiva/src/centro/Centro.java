package centro;
import socio.Socio;
import instalacion.Instalacion;
import reserva.Reserva;

import java.util.Arrays;

import articulo.Articulo;
import estado.Estado;

//practicando vectores con cantidad limitada de elementos
public class Centro {
	
	private Socio[] socios;
	private Instalacion[] instalaciones;
	private Reserva[] reservas;
	private Articulo[] articulos;
	
	public Centro(){
		this.socios = new Socio[5];
		this.instalaciones = new Instalacion[5];
		this.reservas = new Reserva[5];
		this.articulos = new Articulo[5];
	}
	
	public void addSocio(int index, Socio socio) {
		if(socio != null) {
			this.socios[index] = socio;
		}
		
	}
	
	public Socio registrarSocio(String nombre) {
		Socio socio = null;
		boolean nullEncontrado =  false;
		int i =0;
		while(!nullEncontrado && i < this.socios.length) {
			
			if(this.socios[i] == null) {
				socio = new Socio(nombre);
				this.addSocio(i, socio);
				nullEncontrado = true;
			}
			
			i++;
		}
		return socio;
		
	}
	
	public void addInstalacion(Instalacion instalacion) {
		int i = 0;
		boolean nullEncontrado = false;
		while(!nullEncontrado && i < this.instalaciones.length) {
			if(this.instalaciones[i] == null) {
				this.instalaciones[i] = instalacion;
				nullEncontrado = true;
			}
			i++;
		}
		
	}
	
	public void addReserva(Reserva reserva) {
		boolean nullEncontrado = false;
		int i = 0;
		while(!nullEncontrado && i < this.reservas.length && reserva != null ) {
			if(this.reservas[i] == null) {
				this.reservas[i]  =  reserva;
				nullEncontrado = true;
			}
			i++;
		}
		
		
	}
	
	public void addArticulo(Articulo articulo) {
		int i = 0;
		boolean nullEncontrado = false;
		while(!nullEncontrado && i < this.articulos.length) {
			if(this.articulos[i] == null) {
				this.articulos[i] = articulo;
				nullEncontrado = true;
			}
			i++;
		}
		
	}

	public Reserva crearReserva(Socio socio, Instalacion instalacion) {
		
		Reserva nuevaReserva = null;
		
		
		
		
		if(socio !=null && instalacion != null) {
			Boolean aprobado;
			aprobado = this.evaluarSocio(socio);
			if(aprobado) {
				nuevaReserva = new Reserva(socio, instalacion);
				this.addReserva(nuevaReserva);
			}
		}
		return nuevaReserva;
	}
	
	public boolean evaluarSocio(Socio socio) {
		boolean aprobado =  false;
		Estado estado;
		estado = socio.getEstado();
		if(estado == Estado.AL_DIA) {
			aprobado = true;
		}
		return aprobado;
	}
	
	public boolean addArticuloAReserva(Reserva reserva, Articulo articulo) {
		boolean resultado;		
		resultado = reserva.addArticulo(articulo);
		return resultado;
	}

	@Override
	public String toString() {
		return "Centro [socios=" + Arrays.toString(socios) + ", instalaciones=" + Arrays.toString(instalaciones)
				+ ", reservas=" + Arrays.toString(reservas) + ", articulos=" + Arrays.toString(articulos) + "]";
	}
	
}

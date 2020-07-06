package bici;

import java.util.ArrayList;
import entrada.Entrada;

public class Bici {
	//COMPLETAR ATRIBUTOS
			private int id;
			private boolean averiada;
			private ArrayList<Entrada> bitacora;
			
			public Bici(int id) {
				this.id = id;
				this.averiada = false;
				this.bitacora =  new ArrayList<Entrada>();
			}

			
			
			@Override
			public String toString() {
				return "Bici [id=" + id + ", averiada=" + averiada + "]";
			}



			public int getId() {
				return id;
			}

			public boolean estaAveriada() {
				return this.averiada;
			}
			public void notificarAveria() {
				this.averiada= true;
				System.out.println("La bici #" + this.getId() + " está averiada");
			}
			public void registrarMovimiento(int idEstacion ,int nroAnclaje ) {
				Entrada nuevaEntrada = new Entrada(idEstacion, nroAnclaje, this.averiada);
				this.bitacora.add(nuevaEntrada);

			}
			public void reparar() {
				this.averiada = false;
			}
			public void mostrarBitacora() {
				for (int i = 0; i < this.bitacora.size(); i++) {
					System.out.println(this.bitacora.get(i).toString());
				}
			}
			
			
			
			
	
	
	
}

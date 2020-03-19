package inmobiliaria;
import barrio.Barrio;
import java.util.ArrayList;

public class Inmobiliaria {
	
	private ArrayList<Barrio> barrios;
	
	
	
	public ArrayList<Barrio> obtenerBarrioMaxProp(){
		
		ArrayList<Barrio> barriosMax= new ArrayList<Barrio>();
		
		//busco 1 candidato a máximo
		Barrio barrioMax=null;
		int nroMax=0;
		//leo  el arraylist completo  "this.barrios", busco el que tiene mayor cant de propiedades
		for(Barrio barrio: this.barrios) {
			if(barrio.getCantidadPropiedades() > nroMax) {
				nroMax=barrio.getCantidadPropiedades();
				barrioMax = barrio;
			}
		}
		//agrego el primer candidato encontrado a una nueva lista
		barriosMax.add(barrioMax);
		
		//busco otros barrios con igual nro de propiedades en caso exista y agrego a lista
		for(Barrio barrio: this.barrios) {
			if(barrio.getCantidadPropiedades() == nroMax) {
				barriosMax.add(barrio);
			}
		}
		
		
		
		return barriosMax;
		
		
	}
	
	public void mostrarPropiedades() {
		
		for(Barrio barrio: this.barrios) {
			barrio.getPrecioDireccionPropiedades();
		}
	}

	@Override
	public String toString() {
		return "Inmobiliaria [barrios=" + barrios + "]";
	}
	
	
	
	
	
	
}

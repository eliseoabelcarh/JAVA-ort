package clases;
import java.util.ArrayList;

public class Dispositivo {
	
	private int memoriaDisponible;
	private ArrayList <App> apps;

	//constructor
		public Dispositivo(int memoriaDisponible) {
			super();
			this.memoriaDisponible = memoriaDisponible;
			this.apps = new ArrayList<App>(); 
		}
		
		
		
	private int getMemoriaDisponible(){
		return this.memoriaDisponible;
	}

	
	
	public App buscarApp(String nombre){
		App appBuscada = null;
		int i=0;
		while(i<this.apps.size() && appBuscada ==null){
			App appAux;
			appAux=this.apps.get(i);
			if(appAux.getNombre().equals(nombre)){
				appBuscada=appAux;
			}
			
			i++;
		}
		
		return appBuscada;
	}
	
	public void actualizarApp(App app, int tamanioEnMb, String fecha){
		
		int tamanioAnterior;
		tamanioAnterior=app.getTamanioEnMb();
		
		app.setTamanioEnMb(tamanioEnMb);
		app.setFecha(fecha);
		
		int i;
		i=(tamanioEnMb-tamanioAnterior);
		
		this.memoriaDisponible = this.memoriaDisponible - i;
				
	}
	
	public boolean hayEspacioEnDispositivo(int tamanio){
		int memoriaActual;
		memoriaActual=this.getMemoriaDisponible();
		return memoriaActual>=tamanio;
		
	}
	public void agregarApp(App app){
		this.apps.add(app);
		int tamanioActual;
		tamanioActual=app.getTamanioEnMb();
		this.memoriaDisponible= this.memoriaDisponible - tamanioActual;
	}



	@Override
	public String toString() {
		return "Dispositivo [memoriaDisponible=" + memoriaDisponible + ", apps=" + apps + "]";
	}
	
}

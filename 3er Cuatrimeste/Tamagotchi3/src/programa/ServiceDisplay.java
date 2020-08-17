package programa;

import java.util.ArrayList;

public class ServiceDisplay {
	
	public static ServiceDisplay instancia;
	public ArrayList<IDisplay> idisplays;
	
	//tiene q ser privado para no poder instanciarse
	private ServiceDisplay() {
		this.idisplays = new ArrayList<IDisplay>();
		this.idisplays.add(DisplayPorConsola.getInstancia());
	}
	
	public static ServiceDisplay getInstancia() {
		if(instancia == null) {
			instancia = new ServiceDisplay();
		}
		return instancia;
	}
	
	public IDisplay getDefault() {
		return this.idisplays.get(0);
	}
	

	public void mostrar(String mensaje) {
		getDefault().mostrar(mensaje);
	}

	
}

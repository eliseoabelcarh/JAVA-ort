package instalacion;
import tipoInstalacion.TipoInstalacion;


public class Instalacion {

	private TipoInstalacion tipoInstalacion;
	
	public Instalacion(TipoInstalacion tipoInstalacion){
		this.tipoInstalacion = tipoInstalacion;
	}
	
	public TipoInstalacion getTipoInstalacion() {
		return this.tipoInstalacion;
	}

	@Override
	public String toString() {
		return "Instalacion [tipoInstalacion=" + tipoInstalacion + "]";
	}
	
}

package programa;

public class BotonTomar implements IBoton{

	@Override
	public Accion devuelveAccion() {
		return Accion.Tomar;
	}

}
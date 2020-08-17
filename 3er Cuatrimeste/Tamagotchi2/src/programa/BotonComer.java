package programa;

public class BotonComer implements IBoton{

	@Override
	public Accion devuelveAccion() {
		return Accion.Comer;
	}

}

public class Garage implements Estacionamiento {

	private final int CANT_PISOS= 2;
	private final int CANT_COCHERAS= 2;
	private Piso[] pisos;
	
	public Garage() {
		this.pisos = new Piso[CANT_PISOS];
		crearPisos();
		
	}
	@Override
	public boolean estacionar(Vehiculo vehiculo) {
		boolean resultado = false;
		if(hayLugar()) {
			resultado = estacionarEnPisoMasCercano(vehiculo);
			if(resultado) {
				System.out.println("estacionado el vehic patengte "+ vehiculo.getPatente());
			}
		}else {
			System.out.println("no hay lugar para esatacionar");
		}
		return resultado;
	}
	public boolean estacionarEnPisoMasCercano(Vehiculo vehiculo) {
		int i = 0;
		boolean  encontrado = false;
		Piso pisoActual;
		boolean resultado = false;
		while(!encontrado && i < this.pisos.length ) {
			pisoActual = this.pisos[i];
			if(pisoActual != null) {
				if(pisoActual.hayLugar()) {
					encontrado = true;
					resultado = pisoActual.estacionar(vehiculo);
				}
			}
			
			i++;
		}
		
		return resultado;
	}
	@Override
	public Vehiculo retirar(String patente) {
		int i = 0;
		boolean encontrado =  false;
		boolean existe;
		Piso pisoActual;
		Vehiculo vehiculo = null;
		while(!encontrado && i < this.pisos.length) {
			pisoActual = this.pisos[i];
			existe = pisoActual.existePatente(patente);
			if(existe) {
				encontrado = true;
				vehiculo = pisoActual.retirar(patente);
			}else {i++;}
			if(encontrado) {
				System.out.println("vehiculo eliminado de la estructura");
			}else {
				System.out.println("no se encontró patente en la estructura");
			}
		}
		return vehiculo;
	}
	@Override
	public boolean hayLugar() {
		int i = 0;
		boolean encontrado = false;
		Piso pisoActual;
		
		while(!encontrado && i < this.pisos.length) {
			pisoActual = this.pisos[i];
			if(pisoActual.hayLugar()) {
				encontrado = true;
			}else {i++;}
		
		}
		
		return encontrado;
	}
	
	private void crearPisos() {
		Piso pisoNuevo;
		
		for(int i = 0; i < this.pisos.length; i++) {
			pisoNuevo = new Piso(CANT_COCHERAS);
			this.pisos[i] = pisoNuevo;
		}
	}
	
}

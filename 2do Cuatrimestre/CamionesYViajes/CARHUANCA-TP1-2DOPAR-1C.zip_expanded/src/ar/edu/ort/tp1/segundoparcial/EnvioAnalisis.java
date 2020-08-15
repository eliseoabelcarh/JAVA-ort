package ar.edu.ort.tp1.segundoparcial;

public class EnvioAnalisis extends Actividad {
	private float tamanio;
	private String tipoVirus;

	// 3 - Completar el constructor
	//completadoAbel
	//constructor de EnvioAnalisis
	public EnvioAnalisis(String fecha, String hora, char es, String desc, float tamanio, String tipoVirus) {
		super(fecha, hora, es, desc);
		setTamanio(tamanio);
		setTipoVirus(tipoVirus);
	}

	public float getTamanio() {
		return tamanio;
	}

	public String getTipoVirus() {
		return tipoVirus;
	}
	
	
	private void setTamanio(float tamanio) {
		this.tamanio = tamanio;
	}

	private void setTipoVirus(String tipoVirus) {
		this.tipoVirus = tipoVirus;
	}

	// 4 - Completar
	public void mostrar() {
		super.mostrar();
		System.out.println(" Tamaño: " + getTamanio() + " kBytes - Tipo: " + getTipoVirus());
	}

	@Override
	public String showTipo() {
		return "EnvioAnalisis";
	}
}
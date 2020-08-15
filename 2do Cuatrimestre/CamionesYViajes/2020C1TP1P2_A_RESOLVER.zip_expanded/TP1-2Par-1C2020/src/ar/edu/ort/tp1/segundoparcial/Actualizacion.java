package ar.edu.ort.tp1.segundoparcial;

public class Actualizacion extends Actividad {
	
	private String versionFirmaVirus;// actualizacion firma virus

	

	// 3 - completar el constructor
	//COMPLETADO ABEL
	//constructor de Actualizacion
	public Actualizacion(String fecha, String hora, char es, String desc, String versionFirmaVirus) {
		super(fecha, hora, es, desc);
		setVersionFirmaVirus(versionFirmaVirus);
	}

	public void setVersionFirmaVirus(String valor) {
		this.versionFirmaVirus = valor;
	}

	public String getVersionFirmaVirus() {
		return versionFirmaVirus;
	}

	// 4 - Completar
	public void mostrar() {
		super.mostrar();
		System.out.println(" " +getVersionFirmaVirus());
	}

	@Override
	public String showTipo() {
		return "Actualizacion";
	}
}
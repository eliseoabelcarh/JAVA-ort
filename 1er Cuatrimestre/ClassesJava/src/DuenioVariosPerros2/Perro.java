package DuenioVariosPerros2;

public class Perro {
	
	private String nombre;
	boolean contento = false;;
	boolean ladra = false;;
	Duenio duenio;
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	private void ladrar() {
		this.ladra = true;
	}
	
	private void contentar() {
		this.contento = true;
		
	}
	
	public void setDuenio(Duenio duenio) {
		this.duenio = duenio;
	}
	
	public Duenio getDuenioTipoDuenio() {
		return duenio;
	}
	
	public String getNombreDuenioTipostring() {
		return duenio.getNombre();
	}
	
	public void recibirCollar(Duenio duenio) {
		if(this.duenio == duenio) {
			contentar();
			System.out.println(this.getNombre() +" está contento");
		}else {
			ladrar();
			System.out.println("perro ladra, porq no reconoce al dueño");
			}
	}
	
	
	
	
}



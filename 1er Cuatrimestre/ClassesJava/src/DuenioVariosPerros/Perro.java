package DuenioVariosPerros;

public class Perro {
	//declaro variables SIN PRIVATE PARA PROBAR FUNCIONAMIENTO
	String nombre;
	String colorPelaje;
	Duenio duenio;
	boolean contento;
	boolean ladra;
	
	//constructor
	public Perro( String nombre, String colorPelaje) {
		this.nombre= nombre;
		this.colorPelaje= colorPelaje;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColorPelaje() {
		return colorPelaje;
	}
	public void setColorPelaje(String colorPelaje) {
		this.colorPelaje = colorPelaje;
	}
		
	public void setDuenio (Duenio duenio) {
		this.duenio=duenio;
	}
	
	public void moverCola() {
		if(contento==true) {
			System.out.println("perro alegre y moviendo cola");
		}
	}
	
	public void perroLadra() {
		if(ladra==true) {
			System.out.println("perro ladra");
		}
	}
}



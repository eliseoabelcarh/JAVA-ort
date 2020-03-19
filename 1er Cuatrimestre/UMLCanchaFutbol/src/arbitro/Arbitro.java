package arbitro;
import java.util.ArrayList;
import dia.Dia;

public class Arbitro {
	private String nombre;
	private String telefono;
	ArrayList<Dia> dias;
	
	public Arbitro(String nombre, String telefono){
		this.nombre=nombre;
		this.telefono=telefono;
		this.dias = new ArrayList<Dia>();
		int i=0;
		while(i<31) {
			Dia dia = new Dia(i+1);
		}
	}

	public Dia getDia( int nroDia) {
		Dia dia = null;
		
		
		if(nroDia <=31 && nroDia > 0) {
			
			dia= this.dias.get(nroDia);
		}
		return dia; 
	}
	
	
	

	
}

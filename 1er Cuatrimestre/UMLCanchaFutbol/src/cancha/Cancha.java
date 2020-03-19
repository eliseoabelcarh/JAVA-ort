package cancha;
import dia.Dia;
import java.util.ArrayList;

public class Cancha {
	
	private int id;
	private	ArrayList<Dia> dias;

	
	
	
	public Cancha(int id) {
		
		this.id=id;
		this.dias = new ArrayList<Dia>();
		int i=0;
		while(i<31) {
			Dia dia = new Dia(i+1);
		}
	}

	
	public Dia getDia(int nroDia) {
		Dia dia = null;
		
		if(nroDia <= 31 && nroDia > 0 ) {
		dia=this.dias.get(nroDia);
		}
		
		return dia;
		
	}	
	
}

package peleaSuperheroes;

public class Superheroe {
	
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;
	
	
	public Superheroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		this.nombre= nombre;
		this.fuerza= fuerza;
		this.resistencia= resistencia;
		this.superpoderes= superpoderes;
	}

	
	


	public String toString() {
		return "Superheroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", superpoderes=" + superpoderes + "]";
	}
	
	public int resultadoEnFuerza(Superheroe s1, Superheroe s2) {
		int result;
		if( s1.fuerza > s2.fuerza ) {result = 1;}
		else { 
			if(s1.fuerza < s2.fuerza) { result=2;}else {result=3;}
		}
		return result;
	}
	
	public int resultadoEnResistencia(Superheroe s1, Superheroe s2) {
		int result;
		if( s1.resistencia > s2.resistencia ) {result = 1;}
		else { 
			if(s1.resistencia < s2.resistencia) { result=2;}else {result=3;}
		}
		return result;
	}
	public int resultadoEnSuperpoderes(Superheroe s1, Superheroe s2) {
		int result;
		if( s1.superpoderes > s2.superpoderes ) {result = 1;}
		else { 
			if(s1.superpoderes < s2.superpoderes) { result=2;}else {result=3;}
		}
		return result;
	}
	
	public int jugar(Superheroe this , Superheroe s2) {
		int rf;
		int rr;
		int rs;
		int resultado = 0;
		
		rf = resultadoEnFuerza(this, s2);
		rr = resultadoEnResistencia(this, s2);
		rs = resultadoEnSuperpoderes(this, s2);

		if (rf + rr ==2 || rf + rs == 2 || rr+rs ==2) {
			resultado = 1;
		} else {
			if (rf ==3 &&  rr==3 && rs == 3) {
				resultado = 3;
			} else {
				resultado = 2;
			}
		}
		return resultado;
	}
	
	public String resultadoEnString(int result) {
		String r="";
		switch(result) {
		case 1 : r="ganó";
			break;
		case 2 : r="perdió";
			break;
		case 3 : r="empató";
			break;
		}
			
		return r;
	}
	
	
	

}

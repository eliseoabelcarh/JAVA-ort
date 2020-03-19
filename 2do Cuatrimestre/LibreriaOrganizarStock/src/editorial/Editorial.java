package editorial;
import ficha.Ficha;


public class Editorial {
	
	private Ficha ficha;
	
	public Editorial(String razonSocial) {
		
		this.ficha = new Ficha(razonSocial);
		
	}
	
	public Ficha getFicha() {
		return ficha;
	}

	
	@Override
	public String toString() {
		return "Editorial [ficha=" + ficha + "]";
	}
	

}

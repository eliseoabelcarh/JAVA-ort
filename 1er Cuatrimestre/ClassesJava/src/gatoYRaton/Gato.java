package gatoYRaton;

public class Gato {
	
	int energia;
	
	public Gato(int energia) {
		this.energia=energia;
	}
	
	public void correr() {
		energia-=1;
	}
	
	public int getEnergia() {
		return this.energia;
	}

	public boolean alcanzar(Raton raton, int distancia) {
		boolean loAlcanzo;
		for(int i =0; i<distancia; i++ ) {
			this.correr();
			raton.correr();
			System.out.println(i+1);
			System.out.println("energia gato " + this.getEnergia());
			System.out.println("energia raton " + raton.getEnergia());
			
			}
		
		if (raton.getEnergia()<=0 && this.getEnergia()>=0) {loAlcanzo= true;}else {loAlcanzo=false;}
		return loAlcanzo;
		
	}
	
	
	
}

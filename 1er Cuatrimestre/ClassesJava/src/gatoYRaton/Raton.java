package gatoYRaton;

public class Raton {

	int energia;
	
	public Raton(int energia) {
		this.energia=energia;
	}
	
	public void correr() {
		energia-=2;
	}
	
	public int getEnergia() {
		return this.energia;
	}
	
}

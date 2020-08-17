package programa;

public class Programa {
	
	public static void main(String[] args) {
		
		Tamagotchi t  = new Tamagotchi(Triste.getInstancia());
	
		t.interactuar(Mimo.getInstancia());
		
		
	}

}

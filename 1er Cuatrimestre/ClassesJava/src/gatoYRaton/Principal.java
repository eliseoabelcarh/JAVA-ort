package gatoYRaton;

public class Principal {

	public static void main(String[] args) {

		Gato gato1= new Gato(100);
		Raton raton1= new Raton(100);
		
		
		//JUGAR!!
		
		jugar(gato1, raton1, 51);
		
		

	}
	
	
	
	public static void jugar(Gato gato,Raton raton, int distancia){
		System.out.println("LO ALCANZÓ ????? : "+ gato.alcanzar(raton, distancia));
	}
	

}

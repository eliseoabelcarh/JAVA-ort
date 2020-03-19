package PajaroYDuenio;

public class Principal {
	
	

	public static void main(String[] args) {
		
		final int SEG_ESPERA = 5;


		//instancio duenio y pajaro
		
		Duenio duenio = new Duenio("José");
		Pajaro gorrion = new Pajaro(6,28,14,20 );
		
		
		//asignación mutua entre classes
		duenio.setPajaro(gorrion);
		gorrion.setDuenio(duenio);

		//duenio alimenta al gorrion
		duenio.alimentarPajaro("semillas y frutas");
		duenio.darDeBeberAPajaro();
		
		gorrion.mostrarAtributos();
		
		System.out.println("\nEspere " + SEG_ESPERA + " segundos\n");

		//función interesante para esperar un lapso de tiempo
		try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(5*1000);
            
            gorrion.hambriento=true;
            gorrion.sediento = true;
            
         } catch (Exception e) {
            System.out.println(e);
         }
		gorrion.mostrarAtributos();
		
		
		/*
		
		//lo alimento dsps con otra cosa
		duenio.alimentarPajaro("jamón");
		
		duenio.darDeBeberAPajaro();
		
		gorrion.mostrarAtributos();     */

	}

}

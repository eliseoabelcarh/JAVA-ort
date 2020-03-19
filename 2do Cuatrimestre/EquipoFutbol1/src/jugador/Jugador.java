package jugador;

public class Jugador {
	
	private String nombre;
	private String dni;
	private int edad;
	
	public Jugador(String nombre, String dni, int edad) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int[] darMisVocales() {
		
		int[] array = new int[5];
		array[0]= 0;//guarda cantidad de vocales "a"
		array[1]= 0;
		array[2]= 0;
		array[3]= 0;
		array[4]= 0;
		
		char[] vocales = new char[5] ;
		vocales[0] = 'a';
		vocales[1] = 'e';
		vocales[2] = 'i';
		vocales[3] = 'o';
		vocales[4] = 'u';
		
				
		String nombreJugador = this.getNombre().toLowerCase();
		
		for(int i = 0 ; i < nombreJugador.length() ; i++) {
			
			for(int j = 0; j < vocales.length; j++) {
				
				if(vocales[j] == nombreJugador.charAt(i)) {
					array[j]++;
				}
			}
			
		}
		
		return array;
	} 
	
	public int convertirVocalEnLetra(char letra) {
		int nro = -1;
		
		switch (letra) {
		case 'a':
			nro = 0;
			break;
		case 'e':
			nro = 1;
			break;
		case 'i':
			nro = 2;
			break;
		case 'o':
			nro = 3;
			break;
		case 'u':
			nro = 4;
			break;
				
		}
		
		return nro;
	}
	
	public int[] darMisVocales1() {
		int[] array = new int[5];
		
		char[] arrayDeLetras;
		
		arrayDeLetras = this.getNombre().toCharArray();
		
		for(int i = 0; i < arrayDeLetras.length ; i++) {
			int nro = convertirVocalEnLetra(arrayDeLetras[i]);
			if(nro != -1) {
				array[nro]++;
			}
		}
		
		
		return array;
	}
	
	
	
	

	public void mostrarDatos() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Dni: " + this.dni);
		System.out.println("Edad: " + this.edad);
	}
	
}

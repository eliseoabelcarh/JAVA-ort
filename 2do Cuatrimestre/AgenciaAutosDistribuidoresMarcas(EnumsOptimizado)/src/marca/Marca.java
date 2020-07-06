package marca;

public enum Marca {
	
	AUDI		(	1,	"Audi",		new String[] {"Allroad", "Cabrio"}	),
	FORD		(	2,	"Ford",		new String[] {"Aerostar", "Bronco"}	),
	PEUGEOT		(	3,	"Peugeot",	new String[] {"Feline", "Allure"}	),
	CHEVROLET	(	4,	"Chevrolet",new String[] {"Prisma", "Onix"}	),
	JEEP		(	5,	"Jeep",		new String[] {"Patriot", "Renegade"});
	
	//atributos de cada valor enum
	private int id;
	private String nombre;
	private String[] modelos;
	//constructor
	private Marca(int id, String nombre, String[] modelos){
		this.id = id;
		this.nombre = nombre;
		this.modelos = modelos;
	}
	//métodos de cada valor enum
	public int getId(){
		return this.id;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String[] getModelos() {
		return this.modelos;
	}
	public String getModelo(int i) {
		String modelo = "";
		if(i == 1) {
			modelo = modelos[0];
		}else if(i == 2) {
			modelo = modelos[1];
		}
		return modelo;
	}
}

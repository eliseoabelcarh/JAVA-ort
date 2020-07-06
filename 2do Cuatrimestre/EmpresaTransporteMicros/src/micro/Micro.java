package micro;

public class Micro {
	
	private String patente;
	private int nroInterno;
	private int anioFabricacion;
	private double kilometrajeDeUltimoMantenimiento;
	private double kilometrajeTotal;
	
	public Micro(String patente, int nroInterno, int anioFabricacion, double kilometrajeDeUltimoMantenimiento,
			double kilometrajeTotal) {
		
		this.patente = patente;
		this.nroInterno = nroInterno;
		this.anioFabricacion = anioFabricacion;
		this.kilometrajeDeUltimoMantenimiento = kilometrajeDeUltimoMantenimiento;
		this.kilometrajeTotal = kilometrajeTotal;
	}
	
	
	public boolean necesitaMantenimiento(int anioActual) {
		boolean result =  false;
		int antiguedadMicro = (anioActual - anioFabricacion); 
		double ultimosKmsRecorridos = (kilometrajeTotal-kilometrajeDeUltimoMantenimiento);
		if((antiguedadMicro >= 2 && ultimosKmsRecorridos >= 15000)
			|| (antiguedadMicro <= 6 && antiguedadMicro>=2 && ultimosKmsRecorridos >=10000)
			|| (antiguedadMicro >= 6 && ultimosKmsRecorridos >=8000 )
				) {
			result= true;
		}
		
		return result;
	}


	public String getPatente() {
		return this.patente;
	}
	
	

}

package anio;

public class Anio {
	
	private String[] meses = {"enero, febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
	private int[] dias = {30,28,31,30,31,30,31,31,30,31,30,31};
	
	
	public static int nroMesAIndexMes(int numeroMes) {
		int indexMes= -1;
		if(numeroMes >= 1 && numeroMes <=12) {
			indexMes = numeroMes-1;
		}
		return indexMes;
	}
	
	public String getNombreDelMes(int numeroMes) {
		String resultado = null;
		int indexMes = nroMesAIndexMes(numeroMes);
		if(indexMes != -1) {
			String mes = devolverMes(indexMes);
			if(mes != null) {
				resultado = mes;
			}
		}		
		return resultado;
	}
	
	public int diasTranscurridos(int numeroMes) {
		int[] dias = {30,58,89,119,150,180,211,242,272,303,333,364};
		int diasTranscurridos = 0;
		int indexMes =nroMesAIndexMes(numeroMes);
		if(indexMes > 0){
			diasTranscurridos = dias[indexMes-1];
		}
		
		/*
		 * int diasTranscurridos = 0; 
		 * int ciclarHastaIndex = -1;
		 * int indexMes = nroMesAIndexMes(numeroMes); 
		 * if(indexMes != -1) { 
		 * ciclarHastaIndex = indexMes;
		 * for (int i = 0; i < ciclarHastaIndex; i++) {
		 *  diasTranscurridos +=  this.dias[i]; }
		 * }
		 */
		
		return diasTranscurridos;
		
	}
	
	public int diasTranscurridosPrincipioDeAnioHastaDiaTal(int nroDia, int nroMes) {
		int diasTranscurridos = 0;
		int diasHastaInicioDeMes = diasTranscurridos(nroMes);
		diasTranscurridos = diasHastaInicioDeMes + (nroDia-1); 
		return diasTranscurridos;
		
	}
	
	public String devolverMes(int index) {
		String mes = null;
		if(index != -1) {
			mes = this.meses[index];
		}
		return mes;
	}
	
}

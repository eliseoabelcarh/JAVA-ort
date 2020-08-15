package anioV2;
import anio.Anio;
import mes.Mes;

public class AnioV2 {

	Mes enero = Mes.ENERO;
	Mes febrero = Mes.FEBRERO;
	Mes marzo = Mes.MARZO;
	Mes abril = Mes.ABRIL;
	Mes mayo = Mes.MAYO;
	Mes junio = Mes.JUNIO;
	Mes julio = Mes.JULIO;
	Mes agosto = Mes.AGOSTO;
	Mes septiembre = Mes.SEPTIEMBRE;
	Mes octubre = Mes.OCTUBRE;
	Mes noviembre = Mes.NOVIEMBRE;
	Mes diciembre = Mes.DICIEMBRE;
	
	private int[] dias = {30,58,89,119,150,180,211,242,272,303,333,364};
	private Mes[] meses = {enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre};
	

	public int diasTranscurridos2(int nroMes) {
		int diasTranscurridos = 0;
		int indexMes = Anio.nroMesAIndexMes(nroMes);
		if(indexMes != -1 && indexMes > 0) {
			diasTranscurridos = dias[indexMes-1];
		}
		return diasTranscurridos;
	}

	
	public int diasTranscurridosPrincipioDeAnioHastaDiaTal2(int nroDia, int nroMes) {
		int diasTranscurridos = 0;
		int diasHastaInicioDeMes = diasTranscurridos2(nroMes);
		diasTranscurridos = diasHastaInicioDeMes + (nroDia-1); 
		return diasTranscurridos;
		
	}
	
	
}

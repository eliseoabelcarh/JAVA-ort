package mes;

public enum Mes {
	ENERO, FEBRERO, MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE;
	
	
	
	public static Mes getMes(int indexMes) {
		Mes mes = null;
		Mes[] array =  Mes.values();
		if(array != null) {
			mes = array[indexMes];
		}
		return mes;
	}
	
	
	
}

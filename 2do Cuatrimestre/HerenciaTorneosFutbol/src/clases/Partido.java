package clases;

public class Partido {
	
	private Equipo eLocal;
	private Equipo eVisitante;
	private int golesLocal;
	private int golesVisitante;
	
	public Partido(Equipo eLocal, Equipo eVisitante, int golesLocal, int golesVisitante) {
		this.eLocal = eLocal;
		this.eVisitante = eVisitante;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
	}
	
	public Equipo devolverRival(Equipo equipo) {
		Equipo rival = null;
		if(equipo != null) {
			if(this.eLocal == equipo) {
				rival = this.eVisitante;
			}else {
				rival = this.eLocal;
			}
		}
		return rival;
	}
	
	public int getGolesDeEquipo(Equipo e) {
		int goles;
		if(e == this.eLocal) {
			goles = this.golesLocal;
		}else {
			goles = this.golesVisitante;
		}
		return goles;
	}
	
	/**
	 * devuelve true si ambos equipos empataron
	 * @return boolean
	 */
	public boolean empataron() {
		return this.golesLocal==this.golesVisitante;
	}
	public boolean empateConMasDe3GolesCadaUno() {
		boolean result = false;
		if(empataron() && this.golesLocal >= 3 && this.golesVisitante>=3) {
			result = true;
		}
		return result;
	}
	
	public boolean ganadorHizoMasDe4Goles() {
		boolean result = false;
		int diferencia = this.golesLocal - this.golesVisitante;
		int difPositivo = Math.abs(diferencia);
		if(difPositivo >= 4) {
			result = true;
		}
		return result;
	}
	
	
	
	public boolean tieneVallaInvicta(Equipo equipo) {
		boolean result = false;
		Equipo rival = devolverRival(equipo);
		int cantGolesRecibidos = getGolesDeEquipo(rival);
		if(cantGolesRecibidos == 0) {
			result= true;
		}
		return result;
	}
	
	public Equipo getEquipoGanador() {
		Equipo eGanador = null;
		if(this.golesLocal < this.golesVisitante) {
			eGanador = this.eVisitante;
		}
		if(this.golesLocal > this.golesVisitante) {
			eGanador = this.eLocal;
		}
		return eGanador;
	}

	public Equipo getEquipoPerdedor() {
		return devolverRival(getEquipoGanador());
	}

	public Equipo getELocal() {
		return eLocal;
	}

	public Equipo getEVisitante() {
		return eVisitante;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}
	
}

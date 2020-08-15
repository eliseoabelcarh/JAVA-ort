package clases;

import java.util.ArrayList;

public abstract class Torneo {
	
	private int cantMaxJugadoresPermitidos;
	private ArrayList<Jornada> jornadas;
	private ArrayList<Equipo> equipos;
	private int ptosPorEmpate;
	private int ptosPorGanar;
	private int ptosPorGanarConMasDe4Goles;
	private int ptosPorPerder;
	private int ptosPorVallaInvicta;
	private int ptosPorEmpateConMasDe3Goles;

	
	public Torneo(int cantMaxJugadoresPermitidos, int ptosPorEmpate, int ptosPorGanar, int ptosPorGanarConMasDe4Goles,
		int ptosPorPerder, int ptosPorVallaInvicta, int ptosPorEmpateConMasDe3Goles) {
		setCantMaxJugadoresPermitidos(cantMaxJugadoresPermitidos);
		this.jornadas = new ArrayList<Jornada>();
		this.equipos =  new ArrayList<Equipo>();
		this.ptosPorEmpate = ptosPorEmpate;
		this.ptosPorGanar = ptosPorGanar;
		this.ptosPorGanarConMasDe4Goles = ptosPorGanarConMasDe4Goles;
		this.ptosPorPerder = ptosPorPerder;
		this.ptosPorVallaInvicta = ptosPorVallaInvicta;
		this.ptosPorEmpateConMasDe3Goles = ptosPorEmpateConMasDe3Goles;
	}

	
	public void procesaryMostrarResultados() {
		Equipo[] equipos = devolverEquiposOrdenados();
		int[] puntajes = devolverVectorDePuntajes();
		System.out.println("Torneo de Futbol " + this.cantMaxJugadoresPermitidos );
		System.out.println("Tabla de posiciones al cabo de "+ getJornadas().size() + " fechas");
		for(int i = 0 ; i < equipos.length; i++) {
			String nombreEquipo = equipos[i].getNombre();
			int puntajeDelEquipo = puntajes[i];
			System.out.println(nombreEquipo + ": " + puntajeDelEquipo + " puntos");
		}
	}
	
	private int[] devolverVectorDePuntajes() {
		int[] puntaje = new int[getEquipos().size()];
		
		for (Jornada jornada : getJornadas()) {
			for (Partido partido : jornada.getPartidos()) {
				if(partido.empataron()) {//hubo empate
					Equipo e1 = partido.getELocal();
					Equipo e2 = partido.getEVisitante();
					int indexEquipo1 = getIndexDeEquipo(e1);
					int indexEquipo2 = getIndexDeEquipo(e2);
					if(indexEquipo1 != -1 && indexEquipo2 != -1) {
						//ptos por empatar
						puntaje[indexEquipo1]+=ptosPorEmpate;
						puntaje[indexEquipo2]+=ptosPorEmpate;
						boolean empateConMasDe3Goles = partido.empateConMasDe3GolesCadaUno();		
						if(empateConMasDe3Goles) {
							puntaje[indexEquipo1]+=ptosPorEmpateConMasDe3Goles;
							puntaje[indexEquipo2]+=ptosPorEmpateConMasDe3Goles;
						}
					}					
				}else {//existe ganador
					Equipo eGanador =partido.getEquipoGanador();
					Equipo ePerdedor= partido.getEquipoPerdedor();
					int indexEGanador = getIndexDeEquipo(eGanador);
					int indexEPerdedor = getIndexDeEquipo(ePerdedor);
					if(indexEGanador != -1 && indexEPerdedor != -1) {
						puntaje[indexEGanador]+=ptosPorGanar;//ptos por ganar
						puntaje[indexEPerdedor]+=ptosPorPerder;//ptos por perder
						boolean eGanadorEstaInvicto = partido.tieneVallaInvicta(eGanador);
						if(eGanadorEstaInvicto) {
							puntaje[indexEGanador]+=ptosPorVallaInvicta;//ptos por valla invicta
						}
						boolean eGanoPorMasDe4Goles = partido.ganadorHizoMasDe4Goles();
						if(eGanoPorMasDe4Goles) {
							puntaje[indexEGanador]+=ptosPorGanarConMasDe4Goles;//ptos por ganar con más de 4 goles
						}
					}
				}
			}
		}
		return puntaje;
	}

	private int getIndexDeEquipo(Equipo e) {
		int index = -1;
		Equipo[] equipos = devolverEquiposOrdenados();
		int i = 0;
		boolean encontrado = false;
		while(!encontrado && i < equipos.length) {
			if(equipos[i] == e) {
				encontrado= true;
				index= i;
			}
			i++;
		}
		return index;
	}
	
	
	private Equipo[] devolverEquiposOrdenados() {
		int cantEquipos = getEquipos().size();
		Equipo[] equipos = new Equipo[cantEquipos];
		for (int i = 0; i < getEquipos().size(); i++) {
			equipos[i]= getEquipos().get(i);
		}
		return equipos;
	}
	
	public void registrarResultado(int nroJornada, Equipo eLocal, Equipo eVisitante,int golesLocal,  int golesVisitante) {
		if(golesLocal >=0 && golesVisitante >=0) {
			Jornada jornada = buscarJornadaNro(nroJornada);
			if(!existeEquipoEnLista(eLocal)) {
				inscribirEquipo(eLocal);
			}
			if(!existeEquipoEnLista(eVisitante)) {
				inscribirEquipo(eVisitante);
			}
			if(jornada != null) {
				jornada.agregarPartido(eLocal, eVisitante, golesLocal, golesVisitante);
			}else {
				Jornada jornadaAux = crearJornadaYAgregarla(nroJornada);
				jornadaAux.agregarPartido(eLocal, eVisitante, golesLocal, golesVisitante);
			}
		}else {
			System.out.println("Error: revise la cantidad de goles");
		}		
	}
	
	private boolean existeEquipoEnLista(Equipo e) {
		boolean encontrado = false;
		int i = 0;
		while(!encontrado && i < getEquipos().size()) {
			if(e == getEquipos().get(i)) {
				encontrado= true;
			}
			i++;
		}
		return encontrado;
	}
	
	private Jornada buscarJornadaNro(int nro) {
		Jornada jornada = null;
		int i= 0;
		boolean encontrado = false;
		while(!encontrado && i < getJornadas().size()) {
			if(getJornadas().get(i).getNro() == nro) {
				encontrado = true;
				jornada = getJornadas().get(i);
			}
			i++;
		}
		return jornada;
	}
	
	private boolean inscribirEquipo(Equipo equipo) {
		boolean result = false;
		int cantJugLocal = equipo.getCantJugadores();
		if(cantJugLocal == getCantMaxJugadoresPermitidos()) {
			getEquipos().add(equipo);
			result =true;
		}else {
			System.out.println(equipo.getNombre() +": cantidad de jugadores no permitido");
		}
		return result;
	}
	
	private Jornada crearJornadaYAgregarla(int nro) {
		Jornada jornadaNueva = new Jornada(nro);
		getJornadas().add(jornadaNueva);
		return jornadaNueva;
	}
	

	private int getCantMaxJugadoresPermitidos() {
		return cantMaxJugadoresPermitidos;
	}

	private void setCantMaxJugadoresPermitidos(int cant) {
		
		this.cantMaxJugadoresPermitidos = cant;
		
	}

	private ArrayList<Jornada> getJornadas() {
		return jornadas;
	}

	
	private ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	
	
	
}

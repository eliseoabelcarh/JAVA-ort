package clases;

import java.util.ArrayList;

public class Jornada {
	
	private int nro;
	private ArrayList<Partido> partidos;
	
	public Jornada(int nro) {
		setNro(nro);
		this.partidos = new ArrayList<Partido>();
	}

	public void agregarPartido(Equipo eLocal, Equipo eVisitante, int golesLocal, int golesVisitante) {
		Partido partido = new Partido(eLocal, eVisitante, golesLocal,golesVisitante);
		getPartidos().add(partido);
	}

	public int getNro() {
		return nro;
	}

	private void setNro(int nro) {
		this.nro = nro;
	}

	public ArrayList<Partido> getPartidos() {
		return partidos;
	}

	
	
	
	
}

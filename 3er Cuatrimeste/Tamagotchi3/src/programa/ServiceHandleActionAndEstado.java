package programa;

import java.util.ArrayList;

public class ServiceHandleActionAndEstado implements IHandleActionsAndEstados {
	
	public ArrayList<IRespuesta> irespuestas;
	public ArrayList<IAction> iactions;
	public ArrayList<IEstado> iestados;
	
	
	public ServiceHandleActionAndEstado() {
		this.irespuestas = new ArrayList<IRespuesta>();
		this.iactions = new ArrayList<IAction>();
		this.iestados = new ArrayList<IEstado>();
		this.irespuestas.add(SosBoludo.getInstancia());
		this.irespuestas.add(FelizRspta.getInstancia());
		this.iactions.add(Mimo.getInstancia());
		this.iestados.add(TristeEstado.getInstancia());
		this.iestados.add(FelizEstado.getInstancia());
		
	}



	@Override
	public IRespuesta handleAction(IEstado iestado, IAction iaction) {
		// if action exits, según el estado --elegir alguna rspta del array
		IRespuesta irespuesta;
		if(iestado == FelizEstado.getInstancia() && iaction == Mimo.getInstancia()) {
			irespuesta = this.irespuestas.get(0);
		}else {
			irespuesta = this.irespuestas.get(1);
		}
		return irespuesta;
	}



	@Override
	public IEstado getRandomEstado() {
		int x = (int)(Math.random() * (this.iestados.size() - 0) + 0);
		return this.iestados.get(x);
	}

}

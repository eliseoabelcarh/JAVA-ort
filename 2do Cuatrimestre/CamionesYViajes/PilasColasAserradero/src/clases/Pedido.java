package clases;

public class Pedido {

	private int nroPedido;
	private String fecha;
	private int cantPedidaCedro;
	private int cantPedidaPino;
	private int cantConfirmadaCedro;
	private int cantConfirmadaPino;
	private Estado estado;
	
	public Pedido(int i) {
		this.nroPedido = i;
	}

	public Pedido(int nroPedido, int cantPedidaCedro, int cantPedidaPino) {
		this.nroPedido = nroPedido;
		this.fecha = "";
		this.cantPedidaCedro = cantPedidaCedro;
		this.cantPedidaPino = cantPedidaPino;
		this.cantConfirmadaCedro = 0;
		this.cantConfirmadaPino = 0;
		this.estado = Estado.E;
	}

	public Estado getEstado() {
		return estado;
	}

	public int procesarYDevolverSobranteDePinos(int cantPinos) {
		int sobranteDePinos = 0;
		int cantPedida;
		
		sobranteDePinos = cantPinos;
		cantPedida= getCantPedidaPino();
		 if(cantPedida <= sobranteDePinos) {
			 pinoPedidoIgualAConfirmado();
			 sobranteDePinos -= cantPedida;
		 }else {
			 if(sobranteDePinos > 0) {
				 pinoPedidoDiferenteAConfirmado(sobranteDePinos);
				 sobranteDePinos = 0;
			 }
		 }
		 actualizarEstado();
		return sobranteDePinos;
	}

	private void actualizarEstado() {
		int cantCedrosConfir = 0;
		int cantPinosConfir = 0;
		int cantCedrosPedidos = 0;
		int cantPinosPedidos = 0;
		cantCedrosConfir = getCantConfirmadaCedro();
		cantCedrosPedidos = getCantPedidaCedro();
		cantPinosConfir = getCantConfirmadaPino();
		cantPinosPedidos = getCantPedidaPino();
		if(cantCedrosConfir == cantCedrosPedidos && cantPinosConfir == cantPinosPedidos) {
			this.estado = Estado.C;
		}else {
			this.estado = Estado.P;
		}
		
	}

	public int getCantPedidaCedro() {
		return cantPedidaCedro;
	}

	public int getCantPedidaPino() {
		return cantPedidaPino;
	}

	public int getCantConfirmadaCedro() {
		return cantConfirmadaCedro;
	}

	public int getCantConfirmadaPino() {
		return cantConfirmadaPino;
	}

	private void pinoPedidoDiferenteAConfirmado(int cantDisponible) {
		this.cantConfirmadaPino = cantDisponible;		
	}

	private void pinoPedidoIgualAConfirmado() {
		int cantPedida; 
		cantPedida = getCantPedidaPino();
		this.cantConfirmadaPino = cantPedida;
	}

	

	public int procesarYDevolverSobranteDeCedros(int cantCedros) {
		int cantPedida = 0;
		int sobranteCedros = 0;
		sobranteCedros = cantCedros;
		 cantPedida= getCantPedidaCedro();
		 if(cantPedida <= sobranteCedros) {
			 cedroPedidoIgualAConfirmado();
			 sobranteCedros -= cantPedida;
		 }else {
			 if(sobranteCedros > 0) {
				 cedroPedidoDiferenteAConfirmado(sobranteCedros);
				 sobranteCedros= 0;
			 }
		 }
		 actualizarEstado();
		return sobranteCedros;
	}

	private void cedroPedidoDiferenteAConfirmado(int cantDisponible) {
		this.cantConfirmadaCedro = cantDisponible;		
	}

	private void cedroPedidoIgualAConfirmado() {
		int cantPedida = getCantPedidaCedro();
		this.cantConfirmadaCedro = cantPedida;
	}


	public void infomarEstado() {
		System.out.println("Nro Pedido " + getNroPedido());
		System.out.println( "Estado de Pedido " + getEstado());
		
	}

	private int getNroPedido() {
		return this.nroPedido;
	}

	@Override
	public String toString() {
		return "Pedido [nroPedido=" + nroPedido + ", cantPedidaCedro=" + cantPedidaCedro + ", cantPedidaPino="
				+ cantPedidaPino + ", cantConfirmadaCedro=" + cantConfirmadaCedro + ", cantConfirmadaPino="
				+ cantConfirmadaPino + ", estado=" + estado + "]";
	}
	
	

	
}

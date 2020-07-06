package Clases;

import java.util.Date;

public class Cliente {

	private int nroCliente;
	private String zona;
	private Date fechaUltimoServicio;
	
	public Cliente(int nroCliente, String zona) {

		this.nroCliente = nroCliente;
		this.zona = zona;
		this.fechaUltimoServicio = new Date();
	}

	@Override
	public String toString() {
		return "Cliente [nroCliente=" + nroCliente + ", zona=" + zona + ", fechaUltimoServicio=" + fechaUltimoServicio
				+ "]";
	}
	
	
	
}

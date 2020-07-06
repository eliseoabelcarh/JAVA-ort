package clases;

public abstract  class Producto {
	
	private Nombre nombre;
	private Marca marca;
	private String modelo;
	private String nroSerie;
	private float voltaje;
	private Estado estado;
	private float precio;
	
	public Producto(Nombre nombre, Marca marca, String modelo, String nroSerie, float voltaje, Estado estado,
			float precio) {
		setNombre(nombre);
		setMarca(marca);
		setModelo(modelo);
		setNroSerie(nroSerie);
		setVoltaje(voltaje);
		setEstado(estado);
		setPrecio(precio);
	}

	public Nombre getNombre() {
		return nombre;
	}

	private void setNombre(Nombre nombre) {
		this.nombre = nombre;
	}

	public Marca getMarca() {
		return marca;
	}

	private void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNroSerie() {
		return nroSerie;
	}

	private void setNroSerie(String nroSerie) {
		this.nroSerie = nroSerie;
	}

	public float getVoltaje() {
		return voltaje;
	}

	private void setVoltaje(float voltaje) {
		this.voltaje = voltaje;
	}

	public Estado getEstado() {
		return estado;
	}

	private void setEstado(Estado estado) {
		this.estado = estado;
	}

	public float getPrecio() {
		return precio;
	}

	private void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getNombreString() {
		return this.nombre.getNombreLeible();
	}
	
	@Override
	public String toString() {
		return "nombre= " + getNombreString() + ", marca= " + getMarca() + ", modelo= " + getModelo() + ", precio=" + getPrecio() + " ";
	}
	
	
	

}

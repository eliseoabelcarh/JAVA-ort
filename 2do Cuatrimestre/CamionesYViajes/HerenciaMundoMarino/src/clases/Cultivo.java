package clases;

public abstract class Cultivo {
    private String nombre;
    public Cultivo(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    abstract double calcularRendimiento(int kilos, int altura, int humedad);
    @Override
    public String toString() {
        return getNombre();
    }
}
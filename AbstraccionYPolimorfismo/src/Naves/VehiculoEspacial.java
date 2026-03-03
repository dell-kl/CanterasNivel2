package Naves;

public abstract class VehiculoEspacial {
    protected double peso;
    protected String nombre;
    protected double velocidad;

    public abstract String Despegue();
    public abstract void Propulsion();


    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return this.peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public double getVelocidad() {
        return this.velocidad;
    }
}

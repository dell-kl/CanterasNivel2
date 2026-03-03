package Naves;

public abstract class VehiculoEspacial {
    protected double peso;
    protected String nombre;
    protected double velocidad;

    public abstract void Despegue();
    public abstract void Propulsion();


    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
}

package Naves;

public class Robotica extends VehiculoEspacial{

    @Override
    public String Despegue() {
        return "La nava no tripulada " + this.getNombre() + "Ha comenzado con el despegue";
    }


    @Override
    public void Propulsion() {

    }
}

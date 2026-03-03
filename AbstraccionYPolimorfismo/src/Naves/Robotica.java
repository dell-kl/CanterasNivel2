package Naves;

public class Robotica extends VehiculoEspacial{

    @Override
    public String Despegue() {
        return "La nave" + this.getNombre() + "Ha comenzado con el despegue";
    }


    @Override
    public void Propulsion() {

    }
}

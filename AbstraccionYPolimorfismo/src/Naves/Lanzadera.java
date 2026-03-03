package Naves;

public class Lanzadera extends VehiculoEspacial{



    @Override
    public String Despegue() {
        return "La nave lanzadera" + this.getNombre() + "Ha comenzado con el despegue";
    }

    @Override
    public void Propulsion() {

    }
}

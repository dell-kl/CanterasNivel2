import java.util.Date;

/**
 * Car es tu clase padre para definir datos comunes en un auto, numero de placa, color, su año.
 * Para poder setear y obtener la matricula tienes que usar sus metodos setter y getter correspondientes.
 * @author Dennis Ponce
 * @version 1.0
 * */
public class Car {

    /**
     * Setea aqui el numero de la cuenta bancaria.
     * */
    private String licensePlate;

    /**
     * Setear el color del auto.
     * */
    public String color;

    /**
     * Cual es el año del carro.
     * */
    public Date year;

    /**
     * @param licensePlate ingresa el numero de la placa del auto. por ejemplo: AE9309
     * */
    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }

    /**
     * @return String verifica el numero de la placa.
     * */
    public String getLicensePlate(){
        return this.licensePlate;
    }
}

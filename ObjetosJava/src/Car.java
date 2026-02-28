import java.util.Date;

public class Car {
    private String licensePlate;
    public String color;
    public Date year;

    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }
    public String getLicensePlate(){
        return this.licensePlate;
    }
}

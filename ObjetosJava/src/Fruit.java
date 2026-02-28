import java.util.ArrayList;

public class Fruit {
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    public void setColor(String color){
        this.colors.add(color);
    }

    public ArrayList<String> getColors(){
        return this.colors;
    }
}

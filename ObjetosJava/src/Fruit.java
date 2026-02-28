import java.util.ArrayList;

/**
 * Esta clase padre Fruit nos permite definir metods genericos para diferentes objetos que comparten caracteristicas comunes.
 * @author Dennis Ponce
 * @version 1.0
 * */
public class Fruit {

    /**
     * Setea el nombre de la fruta.
     * */
    public String name;

    /**
     * Setea el ancho de la fruta.
     * */
    private float averageWeight;

    /**
     * Listado de colores que posee la fruta.
     * */
    public ArrayList<String> colors;

    /**
     * @param color Define uno de los colores que puede tener la fruta. Este color se ira agregando
     *              a una lista que podras ir a consultar.
     * */
    public void setColor(String color){
        this.colors.add(color);
    }

    /**
     * @return ArrayList<String> Listado de los colores que definiste que tiene la fruta.
     * */
    public ArrayList<String> getColors(){
        return this.colors;
    }
}

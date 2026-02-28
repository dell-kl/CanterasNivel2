
import java.util.Date;

/**
 * Usa esta clase comun para definir datos comunes para tus usuarios.
 * @author Dennis Ponce
 * @version 1.0
 * */
public class Person {

    /**
     * name: Definir el nombre de la persona actual.
     * */
    public String name;

    /**
     * lastName1: Setear el primer apellido de la persona.
     * */
    public String lastName1;

    /**
     * lastName2: Setear el segundo apellido de la persona.
     * */
    public String lastName2;

    /**
     * dateBirth: define la fecha de cumpleaños de la persona.
     * */
    public Date dateBirth;

    /**
     * height: define la altura que tiene la persona.
     * */
    public float height;

    /**
     * Si quieres un mayor control usa este metodo para definir el nombre de la persona.
     * @param name Define el nombre de la persona. Usando este metodo Setter.
     * */
    public void setName(String name){
        this.name = name;
    }

    /**
     * @return retorna el nombre de la persona que acabaste de setear.
     * */
    public String getName(){
        return this.name;
    }
}

/**
 * Esta clase representaria una clase padre, todos estos atributos y metodos pueden llegar a ser reutilizados
 * por clases hijas, por ejemplo: clase Perror, clase Gato. Todas comparte estas mismas propiedades y no habria
 * necesidad de reescribirlas en cada una de las clases.
 * @author Dennis Ponce
 * @version 1.0
 * */
public class Animal {

    /**
     * paws: Define el numero de patas que tiene el animal respectivo.
     * */
    public int paws;

    /**
     * Que color tiene el animal.
     * */
    public String color;

    /**
     * Define el habitat del animal.
     * */
    public String habitat;

    /**
     * Este valor tendras que controlar. Si el animal esta considerado en peligro de extincion o esta extinto, definelo en TRUE.
     * El valor no esta disponible de manera publica por posibles modificaciones externas, solamente clases que hereden de ella pueden
     * realizar modificaciones respectivas. Si quieres tener acceso al valor usa su metodo Getter.
     *
     * */
    protected boolean extinct = false;

    /**
     * Si quieres un mayor control usa este metodo para definir el estado del animal.
     * @param extinct Controla con TRUE o FALSE, si el animal que tienes actualmente esta en peligro de extincion o ya se encuentra extinto.
     * */
    public void setExtinct(boolean extinct){
        this.extinct = extinct;
    }

    /**
     * @return boolean Verifica el estado del animal. Si esta extinto o en peligro tendras un valor TRUE, caso contrario FALSE.
     * */
    public boolean getExtinct() {
        return this.extinct;
    }
}

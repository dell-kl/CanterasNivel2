/**
 * Esta clase puede ser extentida por tu clase hija, para setear valores genericos y comunes que se ven en cuentas bancarias.
 * accountNumber y activated puedes usarla sin necesidad de que tenga que definirlas tu mismo en tu clase.
 * @author Dennis Ponce
 * @version 1.0
 * */
public class BankAccount {

    /**
     * Setea aqui el numero de la cuenta bancaria.
     * */
    private int accountNumber;

    /**
     * Verifica el estado en que esta la cuenta bancaria.
     * */
    protected boolean activated;

    /**
     * @param activated Modifica el estado de activacion de la cuenta.
     * */
    public void setActivated(boolean activated)
    {
        this.activated = activated;
    }

    /**
     * @return obten informacion sobre el estado de la cuenta en que se encuentra actualmente.
     * */
    public boolean getActivated() {
        return this.activated;
    }
}

public class BankAccount {
    private int accountNumber;
    protected boolean activated;

    public void setActivated(boolean activated)
    {
        this.activated = activated;
    }

    public boolean getActivated() {
        return this.activated;
    }
}

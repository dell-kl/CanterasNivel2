public class Animal {
    public int paws;
    public String color;
    public String habitat;
    protected boolean extinct = false;

    public void setExtinct(boolean extinct){
        this.extinct = extinct;
    }

    public boolean getExtinct() {
        return this.extinct;
    }
}

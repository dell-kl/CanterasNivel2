import java.util.Date;

public class Product {
    public String name;
    public double price;
    private boolean discount;
    private double percentageDiscount;
    public int stock;

    public boolean ExistStock() {
        if(this.stock == 0)
            return false;

        return true;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public void setPercentageDiscount(double percentageDiscount)
    {
        this.percentageDiscount = percentageDiscount;
    }
}

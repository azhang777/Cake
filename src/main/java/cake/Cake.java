package cake;

public class Cake {
    private String flavor;
    private double price;

    public Cake(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void getDescription() {
        System.out.println("Flavor: " + getFlavor() + ", Price: $" + getPrice());
    }
}

package cake;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake birthdayCake = new BirthdayCake("chocolate");
        WeddingCake weddingCake = new WeddingCake("vanilla");
        Cake cake = new Cake("pineapple");

        birthdayCake.setPrice(24.00);
        weddingCake.setPrice(500.00);
        cake.setPrice(30.00);

        birthdayCake.getDescription();
        weddingCake.getDescription();
        cake.getDescription();
    }
}

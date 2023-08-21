package training_ground;

public class Petroleum {
    private String location;
    private String petrolType;
    private int quantity;
    private double pricePerLitre;
    private double discount;

    public static void main(String[] args) {
        Petroleum petroleum = new Petroleum("sabo","pms",20,200,20);
        System.out.println(petroleum.getPurchaseAmount());
    }

    public Petroleum(String location, String petrolType, int quantity, double pricePerLitre, double discount) {
        this.location = location;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.pricePerLitre = pricePerLitre;
        this.discount = discount;
    }

    public String getLocation() {
        return location;
    }
    public double getPurchaseAmount(){
        double discounted = quantity * pricePerLitre * getDiscount();

        return quantity * pricePerLitre - discounted;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public double getDiscount() {
        return discount/ 100;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}

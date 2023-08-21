package deltel_deltel.chapter_3;

public class PetrolPurchase {
    private String location;
    private String PetrolType;
    private int quantity;
    private double PricePerLiter;
    private double discount;

    public static void main(String[] args) {
        PetrolPurchase petrol = new PetrolPurchase("Igbosere", "Oando", 20, 200, 20);
        System.out.println(petrol.getPricePerLiter());
    }


    public PetrolPurchase(String location, String petrolType, int quantity, double pricePerLiter, double discount) {
        this.location = location;
        this.PetrolType = petrolType;
        this.quantity = quantity;
        this.PricePerLiter = pricePerLiter;
        this.discount = discount;
    }

    public String getLocation() {
        return location;
    }

    public double getPurchaseAmount(){
        double discounted = quantity * getPricePerLiter() * getDiscount();
        return quantity * getPricePerLiter() - discounted;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPetrolType() {
        return PetrolType;
    }

    public void setPetrolType(String petrolType) {
        PetrolType = petrolType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerLiter() {
        return PricePerLiter;
    }

    public void setPricePerLiter(double pricePerLiter) {
        PricePerLiter = pricePerLiter;
    }

    public double getDiscount() {
        return discount / 100;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


}

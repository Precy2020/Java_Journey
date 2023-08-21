package deltel_deltel.chapter_3;

public class Car {
    private String model;
    private String year;
    private double price;
    private double discount;

    public double getDiscount() {
        discount = discount / price * 100;
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Car(double price, double discount) {
        this.price = price;
        this.discount = discount;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice(double value) {
        if (price < 0){
            return 0;
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class Mobile {
    private String brand; // APPLE, SAMSUNG
    private int ramSize;
    private double price;

    public Mobile() {
        this.price = -50;
    }

    public Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void setPrice(double price) {
        if (price < 0) {
            IO.println("Invalid price");
        } else {
            this.price = price;
        }
    }

    public String getBrand() {
        return brand;
    }

    public int getRamSize() {
        return ramSize;
    }

    public double getPrice() {
        return price;
    }
}

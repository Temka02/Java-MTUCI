package LR2;

public abstract class Gadget {
    
    private String brand;
    private double price;
    private String color;

    private static int gadgetCount = 0;

    public Gadget() {
        this.brand = "No brand";
        this.price = 0.0;
        this.color = "Black";
        gadgetCount++;
    }

    public Gadget(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        gadgetCount++;
    }

    public abstract void deviceInfo();

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getGadgetCount() {
        return gadgetCount;
    }

    public void availableСolors() {
        System.out.println("No colors yet");
    }
}

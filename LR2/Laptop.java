package LR2;

public class Laptop extends Gadget {
    
    private int ram;
    private int storage;

    public Laptop() {
        super();
        this.ram = 8;
        this.storage = 256;
    }

    public Laptop(String brand, double price, String color, int ram, int storage) {
        super(brand, price, color);
        this.ram = ram;
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public void deviceInfo() {
        System.out.println("Laptop - Brand: " + getBrand() + ", Price: " + getPrice() + ", Color: " + getColor() + ", RAM: " + ram + "GB, Storage: " + storage + "GB");
    }

    @Override
    public void availableСolors() {
        System.out.println("Available laptop colors: black, silver");
    }
}

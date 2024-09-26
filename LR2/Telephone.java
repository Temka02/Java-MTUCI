package LR2;

public class Telephone extends Gadget {
    
    private String CPU;
    private double screenDiagonal;

    public Telephone() {
        super();
        this.CPU = "Not specified";
        this.screenDiagonal = 5.1;
    }

    public Telephone(String brand, double price, String color, String CPU, double screenDiagonal) {
        super(brand, price, color);
        this.CPU = CPU;
        this.screenDiagonal = screenDiagonal;
    }

    public String getCPU() {
        return CPU;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    @Override
    public void deviceInfo() {
        System.out.println("Telephone - Brand: " + getBrand() + ", Price: " + getPrice() + ", Color: " + getColor() + ", CPU: " + getCPU() + ", Screen diagonal: " + getScreenDiagonal() + " inch");
    }

    @Override
    public void availableСolors() {
        System.out.println("Available telephone colors: black, silver, blue, white");
    }
}

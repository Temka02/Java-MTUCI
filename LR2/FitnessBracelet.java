package LR2;


public class FitnessBracelet extends Watch {

    private int batteryСapacity;
    private boolean GPS;

    public FitnessBracelet() {
        super();
        this.batteryСapacity = 200;
        this.GPS = false;
    }

    public FitnessBracelet(String brand, double price, String color, int releaseYear, boolean isSmart, int batteryСapacity, boolean GPS) {
        super(brand, price, color, releaseYear, isSmart);
        this.batteryСapacity = batteryСapacity;
        this.GPS = GPS;
    }

    public int getBatteryСapacity() {
        return batteryСapacity;
    }

    public boolean getGPS() {
        return GPS;
    }

    public void setBatteryСapacity(int batteryСapacity) {
        this.batteryСapacity = batteryСapacity;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    @Override
    public void deviceInfo() {
        System.out.println("Fitness Bracelet - Brand: " + getBrand() + ", Price: " + getPrice() + ", Color: " + getColor() + ", Release year: " + getReleaseYear() + ", Battery Сapacity: "+ getBatteryСapacity() + ", GPS: " + getSmart());
    }

    @Override
    public void availableСolors() {
        System.out.println("Available watch colors: black, white, green");
    }
}
 
package LR2;

public class Watch extends Gadget {

    private String releaseYear;
    private boolean isSmart;

    public Watch() {
        super();
        this.releaseYear = "Not specified";
        this.isSmart = false;
    }

    public Watch(String brand, double price, String color, String releaseYear, boolean isSmart) {
        super(brand, price, color); 
        this.releaseYear = releaseYear;
        this.isSmart = isSmart;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public boolean getSmart() {
        return isSmart;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    @Override
    public void deviceInfo() {
        System.out.println("Watch - Brand: " + getBrand() + ", Price: " + getPrice() + ", Color: " + getColor() + ", Release year: " + getReleaseYear() + ", Smart: " + getSmart());
    }

    @Override
    public void availableСolors() {
        System.out.println("Available watch colors: black, white");
    }
}

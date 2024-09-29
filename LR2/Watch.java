package LR2;


public class Watch extends Gadget {

    private int releaseYear;
    private boolean isSmart;

    public Watch() {
        super();
        this.releaseYear = 2000;
        this.isSmart = false;
    }

    public Watch(String brand, double price, String color, int releaseYear, boolean isSmart) {
        super(brand, price, color); 
        this.releaseYear = releaseYear;
        this.isSmart = isSmart;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean getSmart() {
        return isSmart;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    public String ifSmart(){
        if (this.isSmart) {
            return "Has a fitness tracker";
        }
        else{
            return "No fitness tracker";
        }
    }

    public String isOld(){
        if (this.releaseYear < 2023){
            return "This is an old watch";
        }
        else{
            return "This is a new watch";
        }
    }


    @Override
    public void deviceInfo() {
        System.out.println("Watch - Brand: " + getBrand() + ", Price: " + getPrice() + ", Color: " + getColor() + ", Release year: " + getReleaseYear() + ", Smart: " + getSmart() + ", " + isOld() + ", " + ifSmart());
    }

    @Override
    public void availableСolors() {
        System.out.println("Available watch colors: black, white");
    }
}

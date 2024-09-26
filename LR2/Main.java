package LR2;

public class Main {
    public static void main(String[] args) {

        Watch watch = new Watch("Apple", 299.99, "White", "2023", true);
        Telephone phone = new Telephone("Samsung", 999.99, "Blue", "Qualcomm Snapdragon 8 Gen 3", 6.8);
        Laptop laptop = new Laptop("Dell", 1200.00, "Black", 16, 512);

        watch.deviceInfo();
        phone.deviceInfo();
        laptop.deviceInfo();

        watch.availableСolors();
        phone.availableСolors();
        laptop.availableСolors();

        System.out.println("Total gadgets created: " + Gadget.getGadgetCount());
    }
}

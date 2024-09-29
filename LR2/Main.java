package LR2;

public class Main {
    public static void main(String[] args) {

        Watch watch = new Watch("Apple", 299.99, "White", 2023, true);
        Telephone phone = new Telephone("Samsung", 999.99, "Blue", "Qualcomm Snapdragon 8 Gen 3", 6.8);
        Laptop laptop = new Laptop("MSI", 1200.00, "Black", 16, 512);
        FitnessBracelet fitnessBracelet = new FitnessBracelet("Xiaomi", 49.99, "Green", 2024, true, 450, true);

        watch.deviceInfo();
        phone.deviceInfo();
        laptop.deviceInfo();
        fitnessBracelet.deviceInfo();

        watch.availableСolors();
        phone.availableСolors();
        laptop.availableСolors();
        fitnessBracelet.availableСolors();

        System.out.println("Total gadgets created: " + Gadget.getGadgetCount());
    }
}

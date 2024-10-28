package LR3;

public class Product {
    private String name; 
    private double price; 
    private int quantity;   

    public Product() {
        this.name = "No name";
        this.price = 0.0;
        this.quantity = 0;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "'" + name + "', цена = " + price + " рублей, количество на складе = " + quantity + " шт";
    }
}
package LR3;

import java.util.HashMap;

public class Store {
    private HashMap<String, Product> products;

    public Store() {
        products = new HashMap<>();
    }

    public void addProduct(String barcode, Product product) {
        products.put(barcode, product);
    }

    public Product getProduct(String barcode) {
        return products.get(barcode);
    }

    public void removeProduct(String barcode) {
        products.remove(barcode); 
    }

    public int getProductCount() {
        return products.size();
    }
}

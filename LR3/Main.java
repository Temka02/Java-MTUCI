package LR3;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        store.addProduct("1234567890123", new Product("Яблоко", 10, 100));
        store.addProduct("9876543210987", new Product("Банан", 19, 150));
        store.addProduct("1112223334445", new Product("Апельсин", 7.9, 200));

        String barcodeToSearch = "1234567890123";
        Product product = store.getProduct(barcodeToSearch);
        if (product != null) {
            System.out.println("Найден продукт: " + product);
        } else {
            System.out.println("Продукт с штрихкодом " + barcodeToSearch + " не найден.");
        }
        System.out.println("Количество продуктов на складе: " + store.getProductCount());

        String barcodeToRemove = "9876543210987";
        store.removeProduct(barcodeToRemove);
        System.out.println("Продукт с штрихкодом " + barcodeToRemove + " удален.");

        System.out.println("Количество продуктов на складе: " + store.getProductCount());
    }
}

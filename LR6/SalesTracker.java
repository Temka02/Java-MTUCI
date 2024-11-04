package LR6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SalesTracker {
    private Map<String, Integer> sales = new HashMap<>();
    private double totalRevenue = 0;

    public void addSale(String product, int quantity, double price) {
        sales.put(product, sales.getOrDefault(product, 0) + quantity);
        totalRevenue += quantity * price;
    }

    public void printSales() {
        for (Map.Entry<String, Integer> entry : sales.entrySet()){
        System.out.println(entry.getKey() + ": " + entry.getValue() + " штук");
        }
        System.out.printf("Общая сумма продаж: %.2f\n", totalRevenue);
    }

    public String getMostPopularProduct() {
        String mostPopular = null;
        int maxSales = 0;
        
        for (Map.Entry<String, Integer> entry : sales.entrySet()) {
            if (entry.getValue() > maxSales) {
                maxSales = entry.getValue();
                mostPopular = entry.getKey();
            }
        }
        
        return mostPopular != null ? mostPopular : "Нет проданных товаров";
    }

    public static void main(String[] args) {
        SalesTracker tracker = new SalesTracker();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.print("Введите команду (add, print, popular, exit): ");
            command = scanner.nextLine().toLowerCase();
            if (command.equals("exit")) break;

            if (command.equals("add")) {
                System.out.print("Товар: ");
                String product = scanner.nextLine();
                System.out.print("Количество: ");
                int quantity = Integer.parseInt(scanner.nextLine());
                System.out.print("Цена: ");
                double price = Double.parseDouble(scanner.nextLine());
                tracker.addSale(product, quantity, price);
                System.out.println("Товар добавлен.");
            } else if (command.equals("print")) {
                tracker.printSales();
            } else if (command.equals("popular")) {
                System.out.println("Наиболее популярный товар: " + tracker.getMostPopularProduct());
            } else {
                System.out.println("Неизвестная команда.");
            }
        }

        scanner.close();
    }
}

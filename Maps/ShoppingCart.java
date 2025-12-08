import java.util.*;
import java.util.stream.Collectors;

public class Q17_ShoppingCart {
    public static void main(String[] args) {
        // LinkedHashMap preserves insertion order
        LinkedHashMap<String, Double> prices = new LinkedHashMap<>();
        Map<String, Integer> qty = new HashMap<>();

        // Add products in order
        addItem(prices, qty, "Laptop", 45000.0, 1);
        addItem(prices, qty, "Mouse", 500.0, 2);
        addItem(prices, qty, "Keyboard", 1200.0, 1);
        addItem(prices, qty, "Headset", 800.0, 1);

        // Display products in order
        System.out.println("Cart (in order of addition):");
        for(String p : prices.keySet()) {
            System.out.println(p + " x" + qty.getOrDefault(p,0) + " -> " + prices.get(p));
        }

        // Calculate total
        double total = 0.0;
        for(String p : prices.keySet()) {
            total += prices.get(p) * qty.getOrDefault(p,0);
        }
        System.out.println("\nTotal before discount: " + total);

        // Apply 10% discount if total > 5000
        if(total > 5000) {
            total = total * 0.9;
            System.out.println("Applied 10% discount.");
        }
        System.out.println("Total after discount: " + total);

        // Remove an item (simulate quantity zero)
        removeItem(prices, qty, "Mouse");
        System.out.println("\nAfter removing Mouse:");
        for(String p : prices.keySet()) {
            System.out.println(p + " x" + qty.getOrDefault(p,0) + " -> " + prices.get(p));
        }
    }

    static void addItem(LinkedHashMap<String, Double> prices, Map<String,Integer> qty, String name, double price, int q) {
        prices.putIfAbsent(name, price);
        qty.put(name, qty.getOrDefault(name,0) + q);
    }

    static void removeItem(LinkedHashMap<String, Double> prices, Map<String,Integer> qty, String name) {
        qty.remove(name);
        // Optionally remove price if you want to remove completely
        prices.remove(name);
    }
}

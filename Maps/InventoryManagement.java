import java.util.*;

public class Q7_InventoryManagement {
    public static void main(String[] args) {
        Map<String,Integer> stock = new HashMap<>();

        // 1. Add new products
        stock.put("Soap", 50);
        stock.put("Shampoo", 20);
        stock.put("Toothpaste", 0);
        stock.put("Notebook", 10);

        // Customer buys
        buy(stock, "Shampoo", 5);
        buy(stock, "Notebook", 10); // goes to zero
        buy(stock, "Chocolates", 2); // not stocked

        // New shipment arrives
        restock(stock, "Toothpaste", 30);
        restock(stock, "Chocolates", 15); // new product

        // Query
        query(stock, "Soap");
        query(stock, "Pen");

        // Print out of stock
        System.out.println("\nOut of stock products:");
        for(Map.Entry<String,Integer> e : stock.entrySet()) {
            if(e.getValue() == 0) System.out.println(e.getKey());
        }
    }

    static void buy(Map<String,Integer> stock, String product, int qty) {
        System.out.println("\nCustomer buys " + qty + " of " + product);
        if(!stock.containsKey(product)) {
            System.out.println(product + " is not stocked.");
            return;
        }
        int cur = stock.get(product);
        cur -= qty;
        if(cur <= 0) {
            stock.put(product, 0);
            System.out.println(product + " is now out of stock.");
        } else {
            stock.put(product, cur);
            System.out.println("Remaining " + product + ": " + cur);
        }
    }

    static void restock(Map<String,Integer> stock, String product, int qty) {
        System.out.println("\nRestocking " + qty + " of " + product);
        stock.put(product, stock.getOrDefault(product, 0) + qty);
    }

    static void query(Map<String,Integer> stock, String product) {
        System.out.println("\nQuery " + product);
        if(!stock.containsKey(product)) System.out.println(product + " not stocked.");
        else System.out.println(product + " -> " + stock.get(product));
    }
}

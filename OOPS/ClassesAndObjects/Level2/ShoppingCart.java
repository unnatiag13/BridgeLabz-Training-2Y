package OOPS.ClassesAndObjects.Level2;

import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalCost() {
        return price * quantity;
    }
}

class ShoppingCartSystem {
    ArrayList<CartItem> cart = new ArrayList<>();

    void addItem(CartItem item) {
        cart.add(item);
        System.out.println(item.itemName + " added to cart.");
    }

    void removeItem(String itemName) {
        cart.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
        System.out.println(itemName + " removed from cart.");
    }

    void displayTotalCost() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.getTotalCost();
        }
        System.out.println("Total Cart Value: " + total);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        ShoppingCartSystem cart = new ShoppingCartSystem();
        cart.addItem(new CartItem("Laptop", 50000, 1));
        cart.addItem(new CartItem("Mouse", 1500, 2));
        cart.displayTotalCost();
        cart.removeItem("Mouse");
        cart.displayTotalCost();
    }
}


package OOPS.PolymorphismAndEncapsulation;

interface Discountable {
    void applyDiscount(double percent);
    double getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setPrice(double price) { this.price = price; }

    abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(itemName + " - " + quantity + " pcs at " + price);
    }
}

class VegItem extends FoodItem implements Discountable {
    private double discount = 0;

    VegItem(String name, double price, int quantity) { super(name, price, quantity); }

    @Override
    double calculateTotalPrice() { return getPrice() * getQuantity() * (1 - discount/100); }

    @Override
    public void applyDiscount(double percent) { this.discount = percent; }

    @Override
    public double getDiscountDetails() { return discount; }
}

class NonVegItem extends FoodItem {
    NonVegItem(String name, double price, int quantity) { super(name, price, quantity); }

    @Override
    double calculateTotalPrice() { return getPrice() * getQuantity() * 1.1; } // extra charge
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] items = {
            new VegItem("Paneer Butter Masala", 200, 2),
            new NonVegItem("Chicken Curry", 250, 1)
        };

        for (FoodItem f : items) {
            f.getItemDetails();
            System.out.println("Total Price: " + f.calculateTotalPrice());
        }
    }
}

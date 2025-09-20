package OOPS.PolymorphismAndEncapsulation;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    Product(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {
    Electronics(int id, String name, double price) { super(id, name, price); }

    @Override
    double calculateDiscount() { return getPrice() * 0.1; }

    @Override
    public double calculateTax() { return getPrice() * 0.18; }

    @Override
    public String getTaxDetails() { return "18% GST on Electronics"; }
}

class Clothing extends Product implements Taxable {
    Clothing(int id, String name, double price) { super(id, name, price); }

    @Override
    double calculateDiscount() { return getPrice() * 0.2; }

    @Override
    public double calculateTax() { return getPrice() * 0.12; }

    @Override
    public String getTaxDetails() { return "12% GST on Clothing"; }
}

class Groceries extends Product {
    Groceries(int id, String name, double price) { super(id, name, price); }

    @Override
    double calculateDiscount() { return getPrice() * 0.05; }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics(1, "Laptop", 50000),
            new Clothing(2, "Shirt", 1500),
            new Groceries(3, "Rice", 1000)
        };

        for (Product p : products) {
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - p.calculateDiscount();
            System.out.println(p.getName() + " final price: " + finalPrice);
        }
    }
}

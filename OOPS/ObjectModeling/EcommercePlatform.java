package OOPS.ObjectModeling;

class Product {
    String name;
    double price;
    Product(String name, double price) { this.name = name; this.price = price; }
}

class Order {
    int id;
    Product[] products;
    int count;

    Order(int id, int size) {
        this.id = id;
        products = new Product[size];
        count = 0;
    }

    void addProduct(Product p) {
        if (count < products.length) products[count++] = p;
    }
}

class Customer {
    String name;
    Order[] orders;
    int count;

    Customer(String name, int size) {
        this.name = name;
        orders = new Order[size];
        count = 0;
    }

    void placeOrder(Order o) {
        if (count < orders.length) orders[count++] = o;
    }
}

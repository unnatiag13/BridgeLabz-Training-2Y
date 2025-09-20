package OOPS.ClassesAndObjects.Level1;

class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class ItemInventory {
    public static void main(String[] args) {
        Item item1 = new Item(101, "Laptop", 55000);
        item1.displayItem();
        System.out.println("Total Cost (2 units): " + item1.calculateTotalCost(2));
    }
}


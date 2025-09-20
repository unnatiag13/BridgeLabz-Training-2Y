package OOPS.PolymorphismAndEncapsulation;

interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;

    Book(String id, String title, String author) { super(id, title, author); }

    @Override
    int getLoanDuration() { return 14; }

    @Override
    public void reserveItem(String borrower) { if (available) available = false; }

    @Override
    public boolean checkAvailability() { return available; }
}

class Magazine extends LibraryItem {
    Magazine(String id, String title, String author) { super(id, title, author); }

    @Override
    int getLoanDuration() { return 7; }
}

class DVD extends LibraryItem {
    DVD(String id, String title, String author) { super(id, title, author); }

    @Override
    int getLoanDuration() { return 3; }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("B001","Java Basics","Alice"),
            new Magazine("M001","Tech Monthly","Bob"),
            new DVD("D001","Inception","Nolan")
        };

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
        }
    }
}

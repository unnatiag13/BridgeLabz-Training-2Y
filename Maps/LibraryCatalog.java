import java.util.*;

public class Q9_LibraryCatalog {
    public static void main(String[] args) {
        Map<String,String> catalog = new HashMap<>();
        catalog.put("978-1234567890","Java Basics");
        catalog.put("978-0987654321","Data Structures");
        catalog.put("978-1111111111","Algorithms");

        // Add book
        catalog.put("978-2222222222", "Operating Systems");

        // Search by ISBN
        searchByISBN(catalog, "978-1234567890");
        searchByISBN(catalog, "978-0000000000");

        // Remove a book
        catalog.remove("978-1111111111");

        // Print all ISBNs + titles sorted by ISBN
        System.out.println("\nCatalog sorted by ISBN:");
        catalog.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));

        // Search by title
        searchByTitle(catalog, "data structures");
    }

    static void searchByISBN(Map<String,String> catalog, String isbn) {
        System.out.println("\nSearch ISBN: " + isbn);
        if(catalog.containsKey(isbn)) System.out.println("Title: " + catalog.get(isbn));
        else System.out.println("Book not found");
    }

    static void searchByTitle(Map<String,String> catalog, String titleQuery) {
        System.out.println("\nSearch by title (case-insensitive): " + titleQuery);
        boolean found = false;
        for(Map.Entry<String,String> e : catalog.entrySet()) {
            if(e.getValue().toLowerCase().contains(titleQuery.toLowerCase())) {
                System.out.println(e.getKey() + " -> " + e.getValue());
                found = true;
            }
        }
        if(!found) System.out.println("No books match the title.");
    }
}

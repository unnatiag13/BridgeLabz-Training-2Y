package OOPS.OOPFeatures;

class Book {
    private static String libraryName = "Central Library";
    private String title;
    private String author;
    private final String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Library: " + libraryName + ", Title: " + title +
                               ", Author: " + author + ", ISBN: " + isbn);
        }
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}


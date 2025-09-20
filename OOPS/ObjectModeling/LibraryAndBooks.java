package OOPS.ObjectModeling;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book: " + title + " by " + author);
    }
}

class Library {
    String name;
    Book[] books;
    int count;

    Library(String name, int size) {
        this.name = name;
        books = new Book[size];
        count = 0;
    }

    void addBook(Book b) {
        if (count < books.length) books[count++] = b;
    }

    void showBooks() {
        System.out.println("Library: " + name);
        for (int i = 0; i < count; i++) books[i].display();
    }
}

package OOPS.AccessModifiers;

class EBook extends Book {
    double fileSize;

    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    void display() {
        System.out.println(ISBN + " - " + title + " - " + fileSize + "MB");
    }
}


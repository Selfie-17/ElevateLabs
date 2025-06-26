public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        // Add books
        lib.addBook(new Book("Java Basics", "Author A", 1));
        lib.addBook(new Book("Data Structures", "Author B", 2));

        // Display books
        lib.displayBooks();

        // Issue a book
        lib.issueBook(1);

        // Try issuing again
        lib.issueBook(1);

        // Return book
        lib.returnBook(1);

        // Display updated status
        lib.displayBooks();
    }
}

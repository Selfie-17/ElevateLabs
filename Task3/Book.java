public class Book {
    private String title;
    private String author;
    private int id;
    private boolean isIssued;

    public Book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.isIssued = false;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getId() { return id; }
    public boolean isIssued() { return isIssued; }

    // Issue the book
    public void issue() {
        isIssued = true;
    }

    // Return the book
    public void returnBook() {
        isIssued = false;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + title + " by " + author + (isIssued ? " (Issued)" : " (Available)");
    }
}

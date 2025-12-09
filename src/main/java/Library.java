import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String ISBN) {
        books.removeIf(book -> book.getISBN().equals(ISBN));
    }

    public Book[] searchBook(String title) {
        ArrayList<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                results.add(book);
            }
        }
        return results.toArray(new Book[0]);
    }

    public Book[] displayBooks() {
        return books.toArray(new Book[0]);
    }
}

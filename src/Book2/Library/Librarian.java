package Hackathon.Library;

import java.util.ArrayList;
import java.util.List;

public class Librarian {
    private String name;
    private String employeeId;
    private List<Book> books; // Reference to the library's book collection  List<Book> list = new ArrayList<Book>();

    public Librarian(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void checkOutBook(Book book, Patron patron) {
        if (books.contains(book) && book.isAvailable()) {
            patron.borrowBook(book);
        }
    }

    public void checkInBook(Book book, Patron patron) {
        patron.returnBook(book);
    }

    // Getters and setters...

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

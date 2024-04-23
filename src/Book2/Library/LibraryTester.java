package Hackathon.Library;

public class LibraryTester{
    public static void main(String[] args) {


        Book book1 = new Book("The Body", "Bill Bryson", "011785612");
        Book book2 = new Book("A History of Reading", "Alberto Manguel", "0121111");


        Patron patron = new Patron("Elizabeth Rossom", "001");


        Librarian librarian = new Librarian("Albin Taylor", "lib-200");
        librarian.addBook(book1);
        librarian.addBook(book2);


        librarian.checkOutBook(book1, patron);


        librarian.checkInBook(book1, patron);


    }
}

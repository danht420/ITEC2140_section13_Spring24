package Book;

/**
 * Book
 * data: title, author,  year
 * this program is to prepare of the Library system.
 * Spring 2024
 */
public class Book {
    //data, field, attribute

    private String title;
    private String author;
    private int year;

    //constructors - 1 point
    //create a constructor taking all three data: title, author, year as parameters.

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }


    //getters
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

    //setters
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setYear(int year){
        this.year = year;
    }




    //toString
    @Override
    public String toString(){

        return String.format("Book Title: %s\nAuthor: %s\nPublication Year: %d\n\n", title,author,year);
    }


}

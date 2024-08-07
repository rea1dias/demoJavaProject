package OOP;

class Book {

    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void setTitle(String booktitle) {
        title = booktitle;
    }
    public String getTitle() {
        return title;
    }

    public void setAuthor(String bookauthor) {
        author = bookauthor;
    }
    public String getAuthor() {
        return author;
    }

    public void setYear(int bookyear) {
        year = bookyear;
    }
    public int getYear() {
        return year;
    }

    public void displayInfo() {
        System.out.println();
    }

}

public class Task4 {

    public static void main(String[] args) {


    }
}
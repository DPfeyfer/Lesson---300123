package pro.sky.java.course1;

public class Book {
    private String bookName;
    private Author authorName;
    private int yearBook;

    public Book() {

    }

    public Book(String bookName, Author authorName, int yearBook) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.yearBook = yearBook;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public int getYearBook() {
        return this.yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(Author authorName) {
        this.authorName = authorName;
    }
}

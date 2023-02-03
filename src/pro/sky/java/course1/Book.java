package pro.sky.java.course1;

public class Book {
    private String bookName;
    private String authorName;
    private int yearBook;

    public Book(String bookName, String authorName, int yearBook) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.yearBook = yearBook;
    }

    public String getBookName() {
        return this.bookName;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public int getYearBook() {
        return this.yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
}

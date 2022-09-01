package chapterNine.bookHierachy;

public class Book {
    public String title;
    public String yearOfPublication;
    public String author;

    public Book(String title, String yearOfPublication, String author) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public void setTitle(String title) {
        this.title=title;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication=yearOfPublication;
    }

    public void setAuthor(String author)

    {
        this.author=author;
    }

    public String getTitle() {
        return title;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }
}

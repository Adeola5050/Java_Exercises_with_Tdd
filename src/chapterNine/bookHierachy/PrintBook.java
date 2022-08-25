package chapterNine.bookHierachy;

public class PrintBook extends Book {

    private String ISBN;
    private String publisher;

    public PrintBook(String title, String yearOfPublication, String author) {
        super(title, yearOfPublication, author);
    }

    @Override
    public String toString(){
        return String.format("%s %s %s",title,yearOfPublication,author);
    }
}

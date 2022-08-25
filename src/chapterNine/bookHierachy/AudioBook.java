package chapterNine.bookHierachy;

public class AudioBook extends Book {

    private String bookSize;
    private int playLength;
    private String playBackArtist;


    public AudioBook(String title, String yearOfPublication, String author) {
        super(title, yearOfPublication, author);
    }

    @Override
    public String toString(){
        return String.format("%s %s%n yearOfPublication: %s",getTitle(),getYearOfPublication(),getAuthor());
    }

}

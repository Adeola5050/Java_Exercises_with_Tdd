package chapterNine;

import chapterNine.bookHierachy.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book book;

    @BeforeEach
    void setUp() {
        book= new Book("Dietel","1997","John Doe");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatBookExist(){
        assertNotNull(book);
    }

    @Test
    void testThatOfTheBookPublished(){
        book.setTitle("Java Programming");
        book.setYearOfPublication("1995");
        book.setAuthor("Mike Ross");
        assertSame("Java Programming",book.getTitle());
        assertSame("1995", book.getYearOfPublication());
        assertSame("Mike Ross", book.getAuthor());
    }
}
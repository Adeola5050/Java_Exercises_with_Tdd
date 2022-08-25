package chapterFour;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorTest {
    Comparator comparator;

    @BeforeEach
    void setUp() {

        comparator= new Comparator();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatComparatorExist(){

        assertNotNull(comparator);
    }
    @Test
    void testThatComparatorCanBeCreated(){
        comparator.setFirstInteger();
        comparator.setSecondInteger();
        assertEquals(0,comparator.getFirstInteger());
        assertEquals(0,comparator.getSecondInteger());
    }
    @Test
    void testThatCompareInteger(){
        comparator.setFirstInteger(6);
        comparator.setSecondInteger(5);
        int largest=comparator.getLargestInteger();
        assertEquals(6,comparator.getFirstInteger());
        assertEquals(5,comparator.getSecondInteger());
        assertEquals(1,largest);

    }
}
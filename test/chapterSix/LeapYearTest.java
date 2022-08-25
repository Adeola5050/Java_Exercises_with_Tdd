package chapterSix;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    LeapYear leapYear;

    @BeforeEach
    void setUp() {
        leapYear=new LeapYear();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatLeapYearExist(){
        assertNotNull(leapYear);
    }

    @Test
    void testThatLeapYearCanBeCreated(){
        leapYear.setYear();
        assertSame(0,leapYear.getYear());
    }

    @Test
    void testThatLeapYearCanBeCalculated(){
        leapYear.setYear(2020);
        leapYear.getYear(2020);
        int aLeapYear= leapYear.calculateLeapYear();
        assertEquals(2020,aLeapYear);


    }
}
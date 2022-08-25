package chapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {

    Clock clock;


    @BeforeEach
    void setUp() {
        clock = new Clock(4,35,50);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatClockExist(){
        assertNotNull(clock);
    }
    @Test
    void testThatClockCanBeCreated(){
        clock.setHour(11);
        clock.setMinute(35);
        clock.setSecond(30);
      assertEquals(11 ,clock.getHour());
        assertEquals(35 ,clock.getMinute());
        assertEquals(30 ,clock.getSecond());

    }

    @Test
    void testThatTimeCanBeDisplay(){
        clock.setHour(03);
        clock.setMinute(35);
        clock.setSecond(30);
String displayTime= clock.timeDisplay();
assertSame("",displayTime);


    }

    @Test
    void testThatDisplayTimeFormat(){
        clock.setHour(03);
        clock.setMinute(35);
        clock.setSecond(30);
        String displayTime= clock.timeDisplayFormat(" : : ");
        assertSame(" : : ",displayTime);


    }
}
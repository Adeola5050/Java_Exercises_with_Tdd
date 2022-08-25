package chapterFive;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ExtremeTest {

    Extreme extreme;

    @BeforeEach
    void setUp() {
        extreme= new Extreme();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatExtremeNumbersExist(){
        assertNotNull(extreme);
    }

    @Test
    void  testThatFindMinimumOfNumbers(){
        extreme.setNumber(30);
        extreme.setMinimum(10);
        int minimum= extreme.calculateMinimum();
        assertEquals(30,extreme.getNumber());
        assertEquals(3,minimum);

    }

    @Test
    void  testThatFindMaximumOfNumbers(){
        extreme.setNumber(30);
        extreme.setMaximum(3);
        int maximum= extreme.calculateMaximum();
        assertEquals(30,extreme.getNumber());
        assertEquals(10,maximum);

    }

}
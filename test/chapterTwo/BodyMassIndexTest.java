package chapterTwo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassIndexTest {

    BodyMassIndex bodyMassIndex;

    @BeforeEach
    void setUp() {
        bodyMassIndex = new BodyMassIndex();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatBodyMassIndexCanBeCreated(){
        assertNotNull(bodyMassIndex);
    }

    @Test
    void testThatWeightCanBeCalculated(){
        bodyMassIndex.setWeight(20);
     int weight= bodyMassIndex.calculateWeight();
        assertEquals(20,weight);

    }

    @Test
    void testThatHeightCanBeCalculated(){
        bodyMassIndex.setHeight(5);
        int height= bodyMassIndex.calculateHeight();
        assertEquals(5,height);
    }

    @Test
    void testThatBodyMassIndexCanBeCalculated(){
        bodyMassIndex.setWeight(50);
        bodyMassIndex.setHeight(2);
        int bMI= bodyMassIndex.calculateBodyMassIndex();
        assertEquals(12,bMI);

        }
    }



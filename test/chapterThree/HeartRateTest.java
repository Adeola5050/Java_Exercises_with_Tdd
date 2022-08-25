package chapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

class HeartRateTest {
    HeartRate heartRate;

    @BeforeEach
    void setUp() {
        heartRate= new HeartRate("","","");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatHeartRateCalculatorExist(){

        assertNotNull(heartRate);
    }

    @Test
    void testThatHeartRateCalculateCanBeCreated(){
        heartRate.setFirstName("");
        heartRate.setLastName("");
        heartRate.setDateOfBirth("");
        assertSame("" ,heartRate.getFirstName());
        assertSame( "",heartRate.getLastName());
        assertSame( "",heartRate.getDateOfBirth());
    }
}
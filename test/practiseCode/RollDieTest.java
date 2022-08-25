package practiseCode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static org.junit.jupiter.api.Assertions.*;

class RollDieTest {

    RollDie die;
    SecureRandom randomNumbers;

    @BeforeEach
    void setUp() {
        die = new RollDie();
        randomNumbers=new SecureRandom();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatRollDieExist(){

        assertNotNull(die);
    }

    @Test
    void testThatRollADieGetNumberBetweenOneAndSix(){
        die.setRoll(6);
        die.getRoll();
int rollTime=die.displayRollTime();
assertEquals(6,rollTime);

    }

    @Test
    void testThatRollDieSixtyMillionsTimes(){
        die.setFrequency(7);
        die.getFrequency();
        die.setRoll(6);
        int rollFrequency= die.calculateFrequency();
        assertEquals(60_000_000,rollFrequency);
    }
}
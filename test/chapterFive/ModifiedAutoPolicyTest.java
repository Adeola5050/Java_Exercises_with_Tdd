package chapterFive;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InaccessibleObjectException;
import java.util.prefs.InvalidPreferencesFormatException;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedAutoPolicyTest {

    ModifiedAutoPolicy modifiedAutoPolicy;

    @BeforeEach
    void setUp() {

        modifiedAutoPolicy= new ModifiedAutoPolicy();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatModifiedAutoPolicy(){

        assertNotNull(modifiedAutoPolicy);
    }
    @Test
    void testThatModifiedAutoPolicyCanBeCreated(){
        modifiedAutoPolicy.setState("");
        modifiedAutoPolicy.getState();
        assertSame("",modifiedAutoPolicy.getState());
    }

    @Test
    void testThatValidateStateCode(){
        modifiedAutoPolicy.setState("");
        modifiedAutoPolicy.setStateCode("NY");
        assertSame("NY",modifiedAutoPolicy.getStateCode());

    }

    @Test
    void testThatIfCodeIsCorrect(){
        modifiedAutoPolicy.setState("");
        modifiedAutoPolicy.setStateCode("");
        modifiedAutoPolicy.correctCode();
        assertSame("",modifiedAutoPolicy.correctCode());
    }
}
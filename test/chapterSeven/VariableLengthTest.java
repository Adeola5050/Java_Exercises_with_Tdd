package chapterSeven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariableLengthTest {

    VariableLength variableLength;

    @BeforeEach
    void setUp() {
        variableLength= new VariableLength();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatVariableLengthArgumentExist(){
        assertNotNull(variableLength);
    }

    @Test
    void testThatCalculatesAverageOfVariableLength(){
        variableLength.setArgumentList(50);
        variableLength.setAverage(5);
        int average= variableLength.calculateAverage();
        assertEquals(50,variableLength.getArgumentList());
        assertEquals(5,variableLength.getAverage());
        assertEquals(10,average);

    }
}
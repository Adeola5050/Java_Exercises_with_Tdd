package chapterTwo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PyramidOfGizaTest {

    PyramidOfGiza pyramidOfGiza;

    @BeforeEach
    void setUp() {
        pyramidOfGiza= new PyramidOfGiza();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatPyramidOfGizaExists(){
        assertNotNull(pyramidOfGiza);

    }

    @Test
    void testThatPyramidOfGizaCanBeCreated(){
        pyramidOfGiza.setNumbersOfStones(1);
        pyramidOfGiza.setWeightOfStEachStone(1);
        pyramidOfGiza.setNumbersOfYears(3);
        int pyramid= pyramidOfGiza.pyramidBuilt();
        assertEquals(0,pyramid);


    }

    @Test
    void testThatPyramidCanBeCalculated(){
        pyramidOfGiza.setNumbersOfStones(50);
        pyramidOfGiza.setWeightOfStEachStone(2);
        pyramidOfGiza.setNumbersOfYears(3);
        int pyramidBuilt= pyramidOfGiza.calculatePyramidBuilt();
        assertEquals(300,pyramidBuilt);


    }
    @Test
    void testThatPyramidAverageCanBeCalculated(){
        pyramidOfGiza.setNumbersOfStones(50);
        pyramidOfGiza.setWeightOfStEachStone(2);
        pyramidOfGiza.setNumbersOfYears(3);
        int pyramidBuilt= pyramidOfGiza.calculateAveragePyramidBuilt();
        assertEquals(100,pyramidBuilt);


    }

}
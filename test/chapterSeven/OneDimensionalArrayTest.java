package chapterSeven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneDimensionalArrayTest {

    OneDimensionalArray oneDimensionalArray;

    @BeforeEach
    void setUp() {
        oneDimensionalArray= new OneDimensionalArray();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatOneDimensionalArrayExist(){
        assertNotNull(oneDimensionalArray);
    }

    @Test
    void testThatArrayElementCanBeSet(){
        oneDimensionalArray.setElement();
        assertEquals(20,oneDimensionalArray.getElement());
    }

    @Test
    void testThatMultiplyEachElementElementsOfIntegerByTwo(){
        oneDimensionalArray.setElement();
        int multipliedBonus= oneDimensionalArray.calculateMultipliedElements();
        assertEquals(40,multipliedBonus);
    }
}
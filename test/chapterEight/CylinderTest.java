package chapterEight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    Cylinder cylinder;

    @BeforeEach
    void setUp() {
        cylinder= new Cylinder();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatCylinderExist(){
        assertNotNull(cylinder);
    }
    @Test
    void testThatSetAndGet(){
        cylinder.setRadius(2);
        cylinder.setHeight(2);
        assertEquals(2.00,cylinder.getRadius());
        assertEquals(2,cylinder.getHeight());
    }

    @Test
    void testThatCalculatesTheCylinder(){
        cylinder.setRadius(2);
        cylinder.setHeight(2);
        double volume= cylinder.calculateVolume();
        assertEquals(25.136,volume);
    }

    @Test
    void testThatVerifyThatRadiusAndHeightIsPositive(){
        assertThrows(ArithmeticException.class, ()->cylinder.setRadius(-1));
        assertThrows(ArithmeticException.class,()->cylinder.setHeight(-1));

    }
}
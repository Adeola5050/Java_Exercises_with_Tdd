package chapterTwo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleComputationTest {

    CircleComputation circleComputation;
    @BeforeEach
    void setUp() {
        circleComputation = new CircleComputation();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatCircleClassExist(){
        assertNotNull(circleComputation);
    }

    @Test
    void testThatAreaOfCircleCanBeCalculated(){
        circleComputation.setRadius(2);
        double area = circleComputation.calculateArea();
        assertEquals(12.568, area);
    }

    @Test
    void testThatWhenRadiusIsNegative_ThrowsException(){
        assertThrows(ArithmeticException.class, ()-> circleComputation.setRadius(-1));
    }

    @Test
    void testThatDiameterOfCircleCanBeCalculated(){
        circleComputation.setRadius(3);
        double diameter = circleComputation.calculateDiameter();
        assertEquals(6.0, diameter);
    }

    @Test
    void testThatCircumferenceOfCircleCanBeCalculated(){
        circleComputation.setRadius(4);
        double circumference=circleComputation.calculateCircumference();
        assertEquals(25.136, circumference);
    }
}
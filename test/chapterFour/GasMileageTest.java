package chapterFour;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasMileageTest {

    GasMileage gasMileage;

    @BeforeEach
    void setUp() {
        gasMileage= new GasMileage(2, 2, 3);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatGasMileageExist(){

        assertNotNull(gasMileage);
    }

    @Test
    void testThatGasMileageCanBeCreated(){
        gasMileage.setMile(10);
        gasMileage.setGallon(3);
        assertEquals(10,gasMileage.getMile());
        assertEquals(3,gasMileage.getGallon());
    }
    @Test
    void testThatCalculateEachTrip(){
        gasMileage.setMile(15);
        gasMileage.setGallon(5);
        gasMileage.calculateTrip();
     assertEquals(3,gasMileage.calculateTrip());

    }

    @Test
    void testThatCalculateTheAverageTrip(){
        gasMileage.setMile(30);
        gasMileage.setGallon(3);
        gasMileage.calculateAverage();
         double noOfTrip= gasMileage.calculateAverage();

         assertEquals(2.50,noOfTrip);



    }
}
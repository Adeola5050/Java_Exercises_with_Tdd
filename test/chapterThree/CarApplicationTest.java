package chapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarApplicationTest {

    CarApplication carApplication;


    @BeforeEach
    void setUp() {
        carApplication = new CarApplication();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatCarExist(){
        assertNotNull(carApplication);
    }

    @Test
    void testThatCarCanBeCreated(){
        carApplication.setCar("Toyota");
        carApplication.getCar();
        assertSame("", carApplication.getCar());
    }
@Test
    void testThatCarHasPrice(){
        carApplication.setCar("");
        carApplication.getCar();
        carApplication.setPrice(0);
        assertEquals(0,carApplication.getPrice());

}
 @Test
    void testThatCarPriceCanBeDisplay(){
        carApplication.setCar("");
        carApplication.getCar();
        carApplication.setPrice(5000);
        carApplication.carPriceCanBeDisplay();
        assertEquals(5000,carApplication.getPrice());
        assertEquals(5000,carApplication.carPriceCanBeDisplay());
 }

 @Test
    void testThatFivePercentCanBeApplied(){
        carApplication.setCar("Toyota");
        carApplication.setPrice(50000);
        carApplication.setDiscount(5);
   int priceDiscount= carApplication.calculateDiscount();
        assertEquals(5,carApplication.getDiscount());
        assertEquals(2500,priceDiscount);
 }

    @Test
    void testThatSevenPercentCanBeApplied(){
        carApplication.setCar("Toyota");
        carApplication.setPrice(50000);
        carApplication.setDiscount(7);
        int priceDiscount= carApplication.calculateDiscountTwo();
//        assertEquals(5,carApplication.getDiscount());
        assertEquals(3500,priceDiscount);
    }

    @Test
    void testThatCarPriceCanBeDisplayAgain(){
        carApplication.setCar("Toyota");
        carApplication.setCarName("");
        carApplication.getCarName("");
        String carName= carApplication.displayCarName();
        assertSame("", carName);


    }

}
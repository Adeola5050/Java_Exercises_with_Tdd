package chapterSix;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingChargeTest {
    ParkingCharge parkingCharge;

    @BeforeEach
    void setUp() {
        parkingCharge= new ParkingCharge();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatParkingChargeExist()
    {
        assertNotNull(parkingCharge);
    }

    @Test
    void testThatParkingChargeChartCanBeCreated(){
        parkingCharge.setParkingChargeFee();
        assertEquals(0,parkingCharge.getParkingChargeFee());

    }

 @Test
    void testThatCalculateMinimumFeeForThreeHours(){
        parkingCharge.setParkingChargeFee(2.00);
        double minimumFee= parkingCharge.calculateMinimumFee();
        assertEquals(2.00,parkingCharge.getParkingChargeFee());
        assertEquals(2.00,minimumFee);
 }
 @Test
    void testThatCalculateAdditionalChargesPerHour(){
        parkingCharge.setParkingChargeFee(2.00);
        parkingCharge.setAdditionalFee(0.50);
        double additionalCharges = parkingCharge.calculateAdditionalCharge();
        assertEquals(2.00,parkingCharge.getParkingChargeFee());
        assertEquals(0.50,parkingCharge.getAdditionalFee());
        assertEquals(2.50,additionalCharges);
 }
    @Test
    void testThatCalculateAdditionalChargesForTwentyFourHours(){
        parkingCharge.setParkingChargeFee(2.00);
        parkingCharge.setAdditionalFee(10.00);
        double additionalCharges = parkingCharge.calculateAdditionalCharge();
        assertEquals(2.00,parkingCharge.getParkingChargeFee());
        assertEquals(10.00,parkingCharge.getAdditionalFee());
        assertEquals(12.00,additionalCharges);
    }

}
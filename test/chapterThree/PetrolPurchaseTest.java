package chapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetrolPurchaseTest {

    PetrolPurchase petrolPurchase;

    @BeforeEach
    void setUp() {
        petrolPurchase = new PetrolPurchase();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatPetrolPurchaseExist() {
        assertNotNull(petrolPurchase);
    }

    @Test
    void testThatPetrolPurchaseChartCanBeCreated() {
        petrolPurchase.setLiter(0);
        petrolPurchase.setPrice(0.00);
        petrolPurchase.setQuantity(0);
        int liter = petrolPurchase.getLiter(0);
        double price = petrolPurchase.getPrice(0.00);
        assertEquals(0, liter);
        assertEquals(0.00, price);

    }

    @Test
    void testThatAmountCanBeCalculated() {
        petrolPurchase.setLiter(3);
        petrolPurchase.setPrice (12.00);
        petrolPurchase.setQuantity(3);
        double amountPurchased= petrolPurchase.calculateAmountPurchased();
        assertEquals(108.00,amountPurchased);



    }
    @Test
    void testThatGetPurchasedAmount(){
        petrolPurchase.setLiter(1);
        petrolPurchase.setPrice(15.00);
        petrolPurchase.setQuantity(5);
        petrolPurchase.setPurchaseAmount(75.00);
        petrolPurchase.getPurchaseAmount();
//        assertEquals(75.00,getPurchaseAmount());

    }
}
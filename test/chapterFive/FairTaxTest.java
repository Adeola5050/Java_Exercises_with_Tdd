package chapterFive;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FairTaxTest {

    FairTax fairTax;

    @BeforeEach
    void setUp() {
        fairTax=new FairTax();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatFairTaxExist(){
      fairTax.setExpense();
      fairTax.taxRate();
      assertEquals(0,fairTax.getExpense());
      assertEquals(0,fairTax.getTaxRate());
    }

    @Test
            void testThatFairTaxCanBeCreated(){
        fairTax.setExpense(500);
        fairTax.setTaxRate(20);
        assertEquals(500,fairTax.getExpense());
        assertEquals(20,fairTax.getTaxRate());


    }

   @Test
    void testThatFairTaxCanBeCalculated(){
        fairTax.setExpense(4000);
        fairTax.setTaxRate(23);
        int tax= fairTax.calculateTax();
        assertEquals(920,tax);
   }
   @Test
    void testThatCalculateAccurateTax(){
        fairTax.setExpense(15000);
        fairTax.setTaxRate(30);
        int accurateTax=fairTax.calculateAccurateTax();
        assertEquals(4500,accurateTax);
   }



}
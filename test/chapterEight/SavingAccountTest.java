package chapterEight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingAccountTest {

    SavingAccount account;


    @BeforeEach
    void setUp()
    {
        account= new SavingAccount();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatSavingAccountExist(){
        assertNotNull(account);
    }
    @Test
    void testThatCalculateMonthlyInterestRate(){
        account.setSavingBalance(1000.00);
        account.setAnnualInterest(40.00);
        double interest= account.calculateMonthlyInterest();
        assertEquals(1000.00,account.getSavingBalance());
        assertEquals(40.00,account.getAnnualInterest());
        assertEquals(3333.3333333333335,interest);
    }
// 4% interest rate of 2000.00
    @Test
    void testThatCalculateSaverOneFourPercent(){
        account.setSavingBalance(2000.00);
        account.setAnnualInterest(80.00);
    double saver1= account.calculateMonthlyInterest();
    assertEquals(2000.00,account.getSavingBalance());
    assertEquals(80.00,account.getAnnualInterest());
    assertEquals(13333.333333333334,saver1);

    }


    // 5% interest rate of 2000.00
    @Test
    void testThatCalculateSaverOneFivePercent(){
        account.setSavingBalance(2000.00);
        account.setAnnualInterest(100.00);
        double saver1= account.calculateMonthlyInterest();
        assertEquals(2000.00,account.getSavingBalance());
        assertEquals(100.00,account.getAnnualInterest());
        assertEquals(16666.666666666668,saver1);

    }

    @Test
    void testThatCalculateSaverTwoFourPercent(){
        account.setSavingBalance(3000.00);
        account.setAnnualInterest(120.00);
        double saver2= account.calculateMonthlyInterest();
        assertEquals(3000.00,account.getSavingBalance());
        assertEquals(120.00,account.getAnnualInterest());
        assertEquals(30000.0,saver2);

    }


    // 5% interest rate of 2000.00
    @Test
    void testThatCalculateSaverTwoFivePercent(){
        account.setSavingBalance(3000.00);
        account.setAnnualInterest(150.00);
        double saver2= account.calculateMonthlyInterest();
        assertEquals(3000.00,account.getSavingBalance());
        assertEquals(150.00,account.getAnnualInterest());
        assertEquals(37500.0,saver2);

    }
}

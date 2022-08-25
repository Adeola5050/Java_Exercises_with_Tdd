package chapterFour;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Palindrome palindrome;

    @BeforeEach
    void setUp() {

        palindrome= new Palindrome();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatPalindromeExist(){
        assertNotNull(palindrome);
    }

    @Test
    void testThatPalindromeCanBeCreated(){
        palindrome.setFirstNum();
        palindrome.setSecondNum();
        palindrome.setThirdNum();
        palindrome.setFourthNum();
        assertEquals(0,palindrome.getFirstNum());
        assertEquals(0,palindrome.getSecondNum());
        assertEquals(0,palindrome.getThirdNum());
        assertEquals(0,palindrome.getFourthNum());
    }

    @Test
    void testThatIsAPalindrome(){
        palindrome.setFirstNum(1);
        palindrome.setSecondNum(1);
        palindrome.setThirdNum(1);
        palindrome.setFourthNum(1);
        int isAPalindrome= palindrome.displayPalindrome();
        assertEquals(1,palindrome.getFirstNum());
        assertEquals(1,palindrome.getSecondNum());
        assertEquals(1,palindrome.getThirdNum());
        assertEquals(1,palindrome.getFourthNum());
        assertEquals(1111,isAPalindrome);
    }
    @Test
    void testThatIsNotAPalindrome(){
        palindrome.setFirstNum(1);
        palindrome.setSecondNum(2);
        palindrome.setThirdNum(3);
        palindrome.setFourthNum(4);
        palindrome.setNumber(1234);
        int isNotPalindrome= palindrome.displayNotPalindrome();
        assertEquals(1,palindrome.getFirstNum());
        assertEquals(2,palindrome.getSecondNum());
        assertEquals(3,palindrome.getThirdNum());
        assertEquals(4,palindrome.getFourthNum());
        assertEquals(1234,isNotPalindrome);


    }
    @Test
    void testThatIfNotAPalindrome_ThrowException(){
        assertThrows(ArithmeticException.class, ()->palindrome.setNumber(-1234));

    }
}
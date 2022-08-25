package chapterSeven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoDimensionalArrayTest {


    TwoDimensionalArray twoDimensionalArray;
    @BeforeEach
    void setUp() {
        twoDimensionalArray= new TwoDimensionalArray();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatTwoDimensionalArrayExist(){
        assertNotNull(twoDimensionalArray);

    }

    @Test
    void testThatTableCanBeCreated(){
       twoDimensionalArray.setTable();
       assertEquals(0, twoDimensionalArray.getTable());
    }

    @Test
    void testThatCheckForArrayInTable(){
        twoDimensionalArray.setTable(5,6);
        twoDimensionalArray.setCol(6);
        twoDimensionalArray.setRow(5);
        int row= twoDimensionalArray.getRow();
        int col= twoDimensionalArray.getCol();
        int table= twoDimensionalArray.getTable(5,6);
        assertEquals(5,row);
        assertEquals(6,col);
        assertEquals(0,table);

    }
}
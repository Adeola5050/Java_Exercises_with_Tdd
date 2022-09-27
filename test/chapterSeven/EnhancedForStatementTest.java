package chapterSeven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnhancedForStatementTest {

    EnhancedForStatement statement;

    @BeforeEach
    void setUp() {
        statement= new EnhancedForStatement();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatEnhancedForStatementExist(){
        assertNotNull(statement);
    }
    @Test
    void testThatInitializedTheNumbers(){
        statement.setNumber();
        assertEquals(0,statement.getNumber());
    }
}
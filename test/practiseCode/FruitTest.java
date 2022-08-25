package practiseCode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitTest {

    Fruit fruit;


    @BeforeEach
    void setUp() {
        fruit= new Fruit();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatFruitExist(){
        assertNotNull(fruit);

    }

    @Test
    void testThatFruitCanBeCreated(){
        fruit.setElement();
        fruit.getElement();
        assertSame("",fruit.getElement());
    }
}
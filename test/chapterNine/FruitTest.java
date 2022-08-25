package chapterNine;

import chapterNine.fruits.Fruit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitTest {

    Fruit fruit;

    @BeforeEach
    void setUp() {
        fruit= new Fruit("circle", "Red",30);
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatFruitExist(){
        assertNotNull(fruit);
    }

    @Test
    void testThatDisplayTheFruitAttribute(){
        fruit.setShape("Oval");
        fruit.setColor("Purple");
        fruit.setCalories(25);
        assertSame("Oval",fruit.getShape());
        assertSame("Purple",fruit.getColor());
        assertEquals(25,fruit.getCalories());
    }
}
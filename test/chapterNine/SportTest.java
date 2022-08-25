package chapterNine;

import chapterNine.sportsHeirachy.Sport;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportTest {

    Sport sport;

    @BeforeEach
    void setUp() {
        sport = new Sport();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatSportExist(){
        assertNotNull(sport);
    }

}
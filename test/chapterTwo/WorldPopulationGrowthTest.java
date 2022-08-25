package chapterTwo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorldPopulationGrowthTest {
    WorldPopulationGrowth worldPopulationGrowth;

    @BeforeEach
    void setUp() {
        worldPopulationGrowth= new WorldPopulationGrowth();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatWorldPopulationGrowthExist(){
        assertNotNull(worldPopulationGrowth);

    }

    @Test
    void thatWorldPopulationGrowthCanBeCreated(){
        worldPopulationGrowth.setPopulation(1000);
        int wordPopulation= worldPopulationGrowth.calculateWorldPopulationGrowth();
        assertEquals(1000,wordPopulation);
    }

    @Test
    void thatWorldPopulationGrowthRateForOneYearCanBeCalculated(){
        worldPopulationGrowth.setPopulation(10000);
        worldPopulationGrowth.setGrowthRate(2);
        worldPopulationGrowth.setNumbersOfYear(1);
        int growthRate= worldPopulationGrowth.calculateWorldPopulationGrowthRate();
        assertEquals(20000,growthRate);
    }
    @Test
    void thatWorldPopulationGrowthRateForTwoYearsCanBeCalculated() {
        worldPopulationGrowth.setPopulation(20000);
        worldPopulationGrowth.setGrowthRate(2);
        worldPopulationGrowth.setNumbersOfYear(2);
        int worldPopulation = worldPopulationGrowth.calculateWorldPopulationGrowthRates();
        assertEquals(80000, worldPopulation);

    }
    @Test
    void thatWorldPopulationGrowthRateForThreeYearsCanBeCalculated() {
        worldPopulationGrowth.setPopulation(20000);
        worldPopulationGrowth.setGrowthRate(2);
        worldPopulationGrowth.setNumbersOfYear(3);
        int worldPopulation = worldPopulationGrowth.calculateWorldPopulationGrowthRates();
        assertEquals(120000, worldPopulation);

    }
    @Test
    void thatWorldPopulationGrowthRateForFourYearsCanBeCalculated() {
        worldPopulationGrowth.setPopulation(20000);
        worldPopulationGrowth.setGrowthRate(2);
        worldPopulationGrowth.setNumbersOfYear(4);
        int worldPopulation = worldPopulationGrowth.calculateWorldPopulationGrowthRates();
        assertEquals(160000, worldPopulation);

    }
    @Test
    void thatWorldPopulationGrowthRateForFiveYearsCanBeCalculated() {
        worldPopulationGrowth.setPopulation(20000);
        worldPopulationGrowth.setGrowthRate(2);
        worldPopulationGrowth.setNumbersOfYear(5);
        int worldPopulation = worldPopulationGrowth.calculateWorldPopulationGrowthRates();
        assertEquals(200000, worldPopulation);

    }


}
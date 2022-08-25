package chapterSix;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionTest {
    TemperatureConversion temperatureConversion;

    @BeforeEach
    void setUp() {
        temperatureConversion= new TemperatureConversion();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatTemperatureConversionExist(){
        assertNotNull(temperatureConversion);
    }

    @Test
    void testThatTemperatureConversionCanBeCreated(){
        temperatureConversion.setKelvin();
        temperatureConversion.setCelsius();
        assertEquals(0,temperatureConversion.getKelvin());
        assertEquals(0,temperatureConversion.getCelsius());
    }

    @Test
    void testThatTemperatureInKelvinCanBeConvertedToCelsius(){
        temperatureConversion.setKelvin();
        temperatureConversion.setCelsius(100);
        int conversion= temperatureConversion.calculateKelvin();
        assertEquals(100,temperatureConversion.getCelsius());
        assertEquals(373,conversion);
    }
    @Test
    void testThatTemperatureInCelsiusCanBeConvertedToKelvin(){
        temperatureConversion.setKelvin(373);
        temperatureConversion.setCelsius();
        int conversionK=temperatureConversion.calculateCelsius();
        assertEquals(373,temperatureConversion.getKelvin());
        assertEquals(100,conversionK);
    }

}
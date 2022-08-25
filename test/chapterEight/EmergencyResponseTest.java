package chapterEight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmergencyResponseTest {

    EmergencyResponse response;
    @BeforeEach
    void setUp() {
        response= new EmergencyResponse();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatCreateCallerInformation(){
        response.setFirstName("Daniel");
        response.setLastName("Johnson");
        response.setLocation("Nigeria");
        response.setPhoneNumber("+2348034561");
        response.setTime("12:30");
        assertEquals("Daniel",response.getFirstName());
        assertEquals("Johnson",response.getLastName());
        assertEquals("Nigeria",response.getLocation());
        assertEquals("+2348034561",response.getPhoneNumber());
        assertEquals("12:30", response.getTime());
    }


    @Test
    void testThatEmergencyResponseExist(){
        assertNotNull(response);
    }

    @Test
    void testThatRespondToEmergency(){
        response.setReport("Robbery");
        response.setCallerInformation();
        assertTrue(true, response.getReport());
        assertTrue(true,response.getCallerInformation());
    }

    @Test
    void testThatDescribeNatureOfEmergency(){
        response.setReport("robbery");
        response.getReport();
        String emergency= response.reportedEmergency();
        assertSame ("",response.getCallerInformation(),emergency);

    }
}
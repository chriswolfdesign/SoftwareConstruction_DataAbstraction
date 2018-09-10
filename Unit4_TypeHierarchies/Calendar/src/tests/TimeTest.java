package tests;

import model.Time;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TimeTest {

    Time morningTime, eveningTime;

    @Before
    public void setup() {
        morningTime = new Time(8, 30, true);
        eveningTime = new Time(10, 45, false);
    }

    @Test
    public void testGetAMorPM() {
        assertEquals("AM", morningTime.getAMorPM());
        assertEquals("PM", eveningTime.getAMorPM());
    }

    @Test
    public void testGetFormattedTime() {
        assertEquals("8:30 AM", morningTime.getFormattedTime());
        assertEquals("10:45 PM", eveningTime.getFormattedTime());
    }
}

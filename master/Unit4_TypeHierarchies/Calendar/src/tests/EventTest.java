package tests;

import model.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EventTest {
    Event e;
    Reminder remind;

    @Before
    public void setup() {
        Date d = new Date(Month.JANUARY, 1, 1990);
        Time t = new Time(12, 30, false);
        remind = new Reminder(d, t, "Some event", true);
        remind.setNote("You have an event coming up!");
        e = new Event(d, t, "Some event", true);
    }

    @Test
    public void testGetReminder() {
        assertEquals(e.getReminder(), null);
    }

    @Test
    public void testSetReminder() {
        e.setReminder(remind);
        assertEquals(remind, e.getReminder());
    }
}

package tests;

import model.Date;
import model.Month;
import model.Reminder;
import model.Time;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReminderTest {
    Reminder remind;

    @Before
    public void setup() {
        Date d = new Date(Month.JANUARY, 1, 1990);
        Time t = new Time(10, 30, true);
        remind = new Reminder(d, t, "Don't forget dentist appointment.", true);
    }

    @Test
    public void testGetNote() {
        assertEquals(remind.getNote(), "No note");
    }

    @Test
    public void testSetNote() {
        remind.setNote("Don't forget your dentist appointment!");
        assertEquals(remind.getNote(), "Don't forget your dentist appointment!");
    }
}

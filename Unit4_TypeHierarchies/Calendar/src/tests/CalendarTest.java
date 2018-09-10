package tests;

import model.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalendarTest {
    Calendar cal;
    Date d;
    Time t;
    Meeting m;

    @Before
    public void setup() {
        d = new Date(Month.NOVEMBER, 16, 1990);
        cal = new Calendar(d, "chriswolfdesign@gmail.com");
    }

    @Test
    public void testGetDate() {
        d = new Date(Month.NOVEMBER, 16, 1990);
        assertEquals(cal.getDate().getFormattedDate(), d.getFormattedDate());
    }

    @Test public void testSetDate() {
        d = new Date(Month.FEBRUARY, 14, 2004);
        cal.setDate(d);
        assertEquals(cal.getDate().getFormattedDate(), d.getFormattedDate());
    }

    @Test
    public void testGetEmail() {
        assertEquals(cal.getEmail(), "chriswolfdesign@gmail.com");
    }

    @Test
    public void testSetEmail() {
        cal.setEmail("cwolf.sl@lee.k12.nc.us");
        assertEquals(cal.getEmail(), "cwolf.sl@lee.k12.nc.us");
    }

    @Test
    public void testNoUpcomingEvents() {
        testThatEventsAreEmpty();
    }

    @Test
    public void testAddEntryIntoEmptyEventList() {
        testThatEventsAreEmpty();
        addFirstMeeting();
        testThatThereIsOnlyOneMeeting();
    }

    @Test
    public void testAddEntryIntoNonEmptyEventList() {
        addFirstMeeting();
        testThatThereIsOnlyOneMeeting();
        addSecondMeeting();
        testThatThereAreTwoItemsInEventList();
    }

    @Test
    public void testRemoveEntryOnlyItemInList() {
        addFirstMeeting();
        addSecondMeeting();
        testThatThereAreTwoItemsInEventList();
        removeSecondMeeting();
        createFirstMeeting();
        testThatThereIsOnlyOneMeeting();
    }

    // HELPERS
    private void testThatEventsAreEmpty() {
        assertEquals(cal.getUpcomingEvents().size(), 0);
    }
    private void createFirstMeeting() {
        t = new Time(10, 30, true);
        m = new Meeting(d, t, "Meeting", true);
    }
    private void createSecondMeeting() {
        d = new Date(Month.MARCH, 14, 2018);
        t = new Time(12, 45, false);
        m = new Meeting(d, t, "Second Meeting", false);
    }
    private void addSecondMeeting() {
        createSecondMeeting();
        cal.addEntry(m);
    }
    private void addFirstMeeting() {
        createFirstMeeting();
        cal.addEntry(m);
    }
    private void testThatThereIsOnlyOneMeeting() {
        assertEquals(cal.getUpcomingEvents().size(), 1);
        assertTrue(cal.contains("Meeting"));
    }
    private void testThatThereAreTwoItemsInEventList() {
        assertEquals(cal.getUpcomingEvents().size(), 2);
        assertTrue(cal.contains("Second Meeting"));
    }
    private void removeSecondMeeting() {
        cal.removeEntry("Second Meeting");
    }
}

package tests;

import model.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MeetingTest {
    Meeting m;
    Reminder remind;

    @Before
    public void setup() {
        Date d = new Date(Month.JANUARY, 1, 1990);
        Time t = new Time(12, 30, false);
        m = new Meeting(d, t, "Faculty meeting", false);
    }

    @Test
    public void testEmptyEmailList() {
        testThatEmailListIsEmpty();
    }

    @Test
    public void testAddEmailToEmptyList() {
        testThatEmailListIsEmpty();
        addSingleEmailToList();
        testEmailListHasOnlyOne();
    }

    @Test
    public void testAddEmailToNonEmptyList() {
        addSingleEmailToList();
        testEmailListHasOnlyOne();
        addSecondEmailToList();
        testThatEmailListHasTwoEmails();
    }

    @Test
    public void testRemoveEmailIfEmailIsOnlyOneInList() {
        addSingleEmailToList();
        testEmailListHasOnlyOne();
        removeStandardEmailFromList();
        testThatEmailListIsEmpty();
    }

    @Test
    public void testRemoveEmailIfEmailIsNotOnlyOneInList() {
        addSingleEmailToList();
        addSecondEmailToList();
        testThatEmailListHasTwoEmails();
        removeStandardEmailFromList();
        testThatNonStandardEmailIsOnlyOneInList();
    }

    // HELPERS
    public void testThatEmailListIsEmpty() {
        assertEquals(m.getEmailList().size(), 0);
    }
    public void addSingleEmailToList() {
        m.addEmail("chriswolfdesign@gmail.com");
    }
    public void removeStandardEmailFromList() {
        m.removeEmail("chriswolfdesign@gmail.com");
    }
    public void testEmailListHasOnlyOne() {
        assertEquals(m.getEmailList().size(), 1);
        assertTrue(m.getEmailList().contains("chriswolfdesign@gmail.com"));
    }
    private void addSecondEmailToList() {
        m.addEmail("cwolf.sl@lee.k12.nc.us");
    }
    private void testThatEmailListHasTwoEmails() {
        assertEquals(m.getEmailList().size(), 2);
        assertTrue(m.getEmailList().contains("chriswolfdesign@gmail.com"));
        assertTrue(m.getEmailList().contains("cwolf.sl@lee.k12.nc.us"));
    }
    private void testThatNonStandardEmailIsOnlyOneInList() {
        assertEquals(m.getEmailList().size(), 1);
        assertTrue(m.getEmailList().contains("cwolf.sl@lee.k12.nc.us"));
    }
}

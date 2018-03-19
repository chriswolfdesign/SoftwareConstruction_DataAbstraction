package tests;

import model.Date;
import model.Month;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DateTest {

    Date janDate, febDate, marDate, aprDate, mayDate, junDate, julDate, augDate, sepDate, octDate, novDate, decDate;

    @Before
    public void setup() {
        janDate = new Date(Month.JANUARY, 1, 1990);
        febDate = new Date(Month.FEBRUARY, 2, 1991);
        marDate = new Date(Month.MARCH, 3, 1992);
        aprDate = new Date(Month.APRIL, 4, 1993);
        mayDate = new Date(Month.MAY, 5, 1994);
        junDate = new Date(Month.JUNE, 6, 1995);
        julDate = new Date(Month.JULY, 7, 1996);
        augDate = new Date(Month.AUGUST, 8, 1997);
        sepDate = new Date(Month.SEPTEMBER, 9, 1998);
        octDate = new Date(Month.OCTOBER, 10, 1999);
        novDate = new Date(Month.NOVEMBER, 11, 2000);
        decDate = new Date(Month.DECEMBER, 12, 2001);
    }

    @Test
    public void testGetFormattedMonth() {
        assertEquals("January", janDate.getFormattedMonth());
        assertEquals("February", febDate.getFormattedMonth());
        assertEquals("March", marDate.getFormattedMonth());
        assertEquals("April", aprDate.getFormattedMonth());
        assertEquals("May", mayDate.getFormattedMonth());
        assertEquals("June", junDate.getFormattedMonth());
        assertEquals("July", julDate.getFormattedMonth());
        assertEquals("August", augDate.getFormattedMonth());
        assertEquals("September", sepDate.getFormattedMonth());
        assertEquals("October", octDate.getFormattedMonth());
        assertEquals("November", novDate.getFormattedMonth());
        assertEquals("December", decDate.getFormattedMonth());
    }

    @Test
    public void testGetFormattedDay() {
        assertEquals("1st", janDate.getFormattedDay());
        assertEquals("2nd", febDate.getFormattedDay());
        assertEquals("3rd", marDate.getFormattedDay());
        assertEquals("4th", aprDate.getFormattedDay());
        assertEquals("5th", mayDate.getFormattedDay());
        assertEquals("6th", junDate.getFormattedDay());
        assertEquals("7th", julDate.getFormattedDay());
        assertEquals("8th", augDate.getFormattedDay());
        assertEquals("9th", sepDate.getFormattedDay());
        assertEquals("10th", octDate.getFormattedDay());
        assertEquals("11th", novDate.getFormattedDay());
        assertEquals("12th", decDate.getFormattedDay());
    }

    @Test
    public void testGetFormattedDate() {
        assertEquals("January 1st, 1990", janDate.getFormattedDate());
        assertEquals("February 2nd, 1991", febDate.getFormattedDate());
        assertEquals("March 3rd, 1992", marDate.getFormattedDate());
        assertEquals("April 4th, 1993", aprDate.getFormattedDate());
        assertEquals("May 5th, 1994", mayDate.getFormattedDate());
        assertEquals("June 6th, 1995", junDate.getFormattedDate());
        assertEquals("July 7th, 1996", julDate.getFormattedDate());
        assertEquals("August 8th, 1997", augDate.getFormattedDate());
        assertEquals("September 9th, 1998", sepDate.getFormattedDate());
        assertEquals("October 10th, 1999", octDate.getFormattedDate());
        assertEquals("November 11th, 2000", novDate.getFormattedDate());
        assertEquals("December 12th, 2001", decDate.getFormattedDate());
    }
}

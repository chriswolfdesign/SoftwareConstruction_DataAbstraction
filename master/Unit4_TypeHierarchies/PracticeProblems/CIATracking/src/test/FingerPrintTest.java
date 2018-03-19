package test;

import model.FingerPrint;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FingerPrintTest {
    Person criminal;
    FingerPrint print;

    @Before
    public void setup() {
        criminal = new Person("Dirty Dan");
        print = new FingerPrint("Bikini Bottom", criminal);
    }

    @Test
    public void testGetLocation() {
        assertEquals("Bikini Bottom", print.getLocation());
    }

    @Test
    public void testGetTrace() {
        assertEquals(criminal, print.getTrace());
    }
}

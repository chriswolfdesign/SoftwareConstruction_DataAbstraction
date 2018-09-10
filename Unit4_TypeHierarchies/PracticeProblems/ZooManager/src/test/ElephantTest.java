package test;

import model.Elephant;
import model.Zookeeper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElephantTest {
    Zookeeper z;
    Elephant e;

    @Before
    public void setup() {
        z = new Zookeeper("Chris", 27);
        e = new Elephant("Dumbo", "Australia", 5, z, 2500);
    }

    @Test
    public void testGetters() {
        assertEquals("Dumbo", e.getName());
        assertEquals("Australia", e.getCountry());
        assertEquals(5, e.getAge());
        assertEquals(z, e.getCareTaker());
        assertEquals(2500, e.getWeight(), 0);
    }
}

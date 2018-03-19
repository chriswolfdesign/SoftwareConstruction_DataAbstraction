package test;

import model.Horse;
import model.Zookeeper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HorseTest {
    Zookeeper z;
    Horse h;

    @Before
    public void setup() {
        z = new Zookeeper("Chris", 27);
        h = new Horse("Epona", "Hyrule", 7, z, 800, 6);
    }

    @Test
    public void testGetters() {
        assertEquals("Epona", h.getName());
        assertEquals("Hyrule", h.getCountry());
        assertEquals(7, h.getAge());
        assertEquals(z, h.getCareTaker());
        assertEquals(800, h.getWeight(), 0);
        assertEquals(6, h.getTopSpeed(), 0);
    }

}

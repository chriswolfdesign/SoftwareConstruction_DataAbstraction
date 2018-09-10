package test;

import model.Snake;
import model.Zookeeper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SnakeTest {
    Zookeeper z;
    Snake s;

    @Before
    public void setup() {
        z = new Zookeeper("Chris", 27);
        s = new Snake("Nagini", 14, z, 120, 6, true);
    }

    @Test
    public void testGetters() {
        assertEquals("Nagini", s.getName());
        assertEquals(14, s.getAge());
        assertEquals(z, s.getCareTaker());
        assertEquals(120, s.getWeight(), 0);
        assertEquals(6, s.getLength(), 0);
        assertTrue(s.isVenom());
    }
}

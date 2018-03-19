package test;

import model.Whale;
import model.Zookeeper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WhaleTest {
    Zookeeper z;
    Whale w;

    @Before
    public void setup() {
        z = new Zookeeper("Chris", 27);
        w = new Whale("Jabu Jabu", 21, z, 3000, true, 1500);
    }

    @Test
    public void testGetters() {
        assertEquals("Jabu Jabu", w.getName());
        assertEquals(21, w.getAge());
        assertEquals(z, w.getCareTaker());
        assertEquals(3000, w.getWeight(), 0);
        assertTrue(w.isWaterType());
        assertEquals(1500, w.getMaxDiveDepth(), 0);
    }
}

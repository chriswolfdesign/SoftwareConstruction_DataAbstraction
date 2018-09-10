package test;

import model.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ZookeeperTest {
    Elephant e;
    Horse h;
    Snake s;
    Whale w;
    Zookeeper z;

    @Before
    public void setup() {
        z = new Zookeeper("Chris", 27);
        e = new Elephant("Dumbo", "Australia", 5, z, 2500);
        h = new Horse("Epona", "Hyrule", 7, z, 800, 6);
        s = new Snake("Nagini", 14, z, 120, 6, true);
        w = new Whale("Jabu Jabu", 21, z, 3000, true, 1500);
    }

    @Test
    public void testGetters() {
        assertEquals("Chris", z.getName());
        assertEquals(27, z.getAge());
        testOnlyDefaultAnimalsAreInList();
        assertEquals(null, z.getFavourite());
    }

    @Test
    public void testSetters() {
        assertEquals(null, z.getFavourite());
        z.setFavourite(s);
        assertEquals(s, z.getFavourite());
    }

    @Test
    public void testAddToList() {
        testOnlyDefaultAnimalsAreInList();
        Animal snek = new Snake("snek", 5, z, 10, 5, false);
        assertEquals(5, z.getAnimalList().size());
    }

    @Test
    public void testRemoveFromList() {
        testOnlyDefaultAnimalsAreInList();
        assertTrue(z.getAnimalList().contains(s));
        z.removeFromList(s);
        assertEquals(3, z.getAnimalList().size());
        assertFalse(z.getAnimalList().contains(s));

    }

    // HELPERS
    private void testOnlyDefaultAnimalsAreInList() {
        assertEquals(4, z.getAnimalList().size());
    }
}

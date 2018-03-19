package test;

import model.Carrot;
import model.Lettuce;
import model.Tomato;
import model.VegType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VegetableTest {
    Lettuce l;
    Tomato t;
    Carrot c;

    @Before
    public void setup() {
        l = new Lettuce();
        t = new Tomato();
        c = new Carrot();
    }

    @Test
    public void testGetName() {
        assertEquals("Lettuce", l.getName());
        assertEquals("Tomato", t.getName());
        assertEquals("Carrot", c.getName());
    }

    @Test
    public void testGetInstructions() {
        assertEquals("Plant seeds in rows 12-15 inches across.", l.getInstructions());
        assertEquals("Place rock near plant.", t.getInstructions());
        assertEquals("Plant seeds in rows 3-4 inches apart", c.getInstructions());
    }

    @Test
    public void testSetInstructions() {
        l.setInstructions("I is lettuce.");
        t.setInstructions("I is tomato.");
        c.setInstructions("I is carrot.");
        assertEquals("I is lettuce.", l.getInstructions());
        assertEquals("I is tomato.", t.getInstructions());
        assertEquals("I is carrot.", c.getInstructions());
    }

    @Test
    public void testGetType() {
        assertEquals(VegType.LEAF, l.getType());
        assertEquals(VegType.ROOT, t.getType());
        assertEquals(VegType.SEED, c.getType());
    }
}

package test;

import model.Call;
import model.CellPhone;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CellPhoneTest {
    CellPhone phone;
    Person criminal;
    Call call1, call2;

    @Before
    public void setup() {
        criminal = new Person("Dirty Dan");
        phone = new CellPhone("Bikini Bottom", criminal);
        call1 = new Call("Bikini Bottom", phone);
//        call2 = new Call("Rock Bottom", phone);
    }

    @Test
    public void testGetLocation() {
        assertEquals("Bikini Bottom", phone.getLocation());
    }

    @Test
    public void testGetCalls() {
        assertEquals(1, phone.getCalls().size());
        assertTrue(phone.getCalls().contains(call1));
    }

    @Test
    public void testGetTrace() {
        assertEquals(phone, phone.getTrace());
    }

    @Test
    public void testAddCall() {
        assertEquals(phone.getCalls().size(), 1);
        assertTrue(phone.getCalls().contains(call1));
        call2 = new Call("Rock Bottom", phone);
        assertEquals(phone.getCalls().size(), 2);
        assertTrue(phone.getCalls().contains(call2));
    }
}

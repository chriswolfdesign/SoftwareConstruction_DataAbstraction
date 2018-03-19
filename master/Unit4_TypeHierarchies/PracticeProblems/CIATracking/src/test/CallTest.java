package test;

import model.Call;
import model.CellPhone;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CallTest {
    Person criminal;
    CellPhone phone;
    Call call;

    @Before
    public void setup() {
        criminal = new Person("Dirty Dan");
        phone = new CellPhone("Bikini Bottom", criminal);
        call = new Call("Bikini Bottom", phone);
    }

    @Test
    public void testGetLocation() {
        assertEquals("Bikini Bottom", call.getLocation());
    }

    @Test
    public void testGetTrace() {
        assertEquals(phone, call.getTrace());
    }
}

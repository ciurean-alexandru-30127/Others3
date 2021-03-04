package isp.lab5.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChangePinTest {
    @Test
    public void TestConstructor() {
        ChangePin changePin = new ChangePin("1234", "5555");
        changePin.setOldPin("1234");
        changePin.setNewPin("1010");
        assertEquals("The old pin should be 1234", "1234", changePin.getOldPin());
        assertEquals("The new pin should be 1010", "1234", changePin.getOldPin());

    }
}

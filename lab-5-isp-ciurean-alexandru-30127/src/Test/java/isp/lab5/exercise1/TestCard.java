package isp.lab5.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCard {
    @Test
    public void TestCard() {
        Card card = new Card("1100", "5050");
        card.setCardid("1001");
        card.setPin("1234");
        assertEquals("The cardid should be 1001", "1001", card.getCardid());
        assertEquals("The pin should be 1234", "1234", card.getPin());
    }
}

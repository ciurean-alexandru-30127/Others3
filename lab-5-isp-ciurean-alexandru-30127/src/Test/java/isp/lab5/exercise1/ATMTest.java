package isp.lab5.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ATMTest {
    @Test
    public void TestInsertCard() {
        //when
        ATM atm = new ATM();

        Card card = new Card("9999", "1234");


        //then
        assertEquals("Insert your card", true, atm.insertCard(card, "1234"));


    }

    @Test
    public void TestRemoveCard() {
        //when
        ATM atm = new ATM();

        Card card = new Card("9999", "1234");

        atm.removeCard();

        assertEquals("Take your card", null, atm.getCard().getPin());
    }

}
package isp.lab5.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    @Test
    public void TestConstructor() {
        //when
        Card card = new Card("112233", "5050");
        Account account = new Account("Alex", 14, card);

        account.setBalance(55);
        account.setOwner("Adrian");
        account.setCard(card);

        //then
        assertEquals("The balance should be '55'", 55, account.getBalance(), 0);
        assertEquals("The owner should be 'Adrian'", "Adrian", account.getOwner());
        assertEquals(card, account.getCard());

    }
}
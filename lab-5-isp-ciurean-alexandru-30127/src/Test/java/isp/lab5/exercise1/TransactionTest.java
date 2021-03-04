package isp.lab5.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransactionTest {
    @Test
    public void TestConstructor() {
        Card card = new Card("7777", "5050");
        Account account = new Account("Alex", 12, card);
        account.setBalance(55);
        account.setOwner("Adrian");
        account.setCard(card);
        //then
        assertEquals("The balance should be '55'", 55, account.getBalance(), 0);
        assertEquals("The owner should be 'Adrian'", "Adrian", account.getOwner());
        assertEquals(card, account.getCard());
        Transaction transaction = new Transaction(account) {
            @Override
            public String execute() {
                return null;
            }

        };
        {
        }
    }

    ;
}

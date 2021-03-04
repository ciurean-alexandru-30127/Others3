package isp.lab5.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BankTest {
    @Test
    public void TestGetAccounts() {
        Card card = new Card("9999", "1234");

        Account accounts[] = new Account[3];

        accounts[0] = new Account("Alex", 12, card);
        accounts[1] = new Account("Adrian", 28, card);
        accounts[2] = new Account("Cristiano", 42, card);

        Bank bank = new Bank(accounts);

        bank.setAccounts(accounts);

        assertArrayEquals(accounts, bank.getAccounts());

    }

    @Test
    public void TestGetAccountByCardId() {
        Card card = new Card("9999", "1234");

        Account accounts[] = new Account[3];

        accounts[0] = new Account("Alex", 12, card);
        accounts[1] = new Account("Adrian", 28, card);
        accounts[2] = new Account("Cristiano", 42, card);

        Bank bank = new Bank(accounts);

        bank.getAccountByCardid("9999");

        assertEquals("The account should be:'Account{" +
                "owner='Alex', balance=12.0, card=Card{" +
                "cardId='9999', pin='1234'}}'", "Account{" +
                "owner='Adrian', balance=28.0, card=Card{" +
                "cardId='9999', pin='1234'}" +
                "}", bank.getAccountByCardid("9999").toString());

    }

    @Test
    public void TestExecuteTransaction() {

        Transaction transaction = new Transaction() {
            @Override
            public String execute() {
                return null;
            }
        };
        Card card = new Card("9999", "1234");

        Account accounts[] = new Account[3];

        accounts[0] = new Account("Alex", 12, card);
        accounts[1] = new Account("Adrian", 28, card);
        accounts[2] = new Account("Cristiano", 42, card);

        Bank bank = new Bank(accounts);

        assertEquals("The transaction should be: 'null' ", null, bank.executeTransaction(transaction));
    }
}
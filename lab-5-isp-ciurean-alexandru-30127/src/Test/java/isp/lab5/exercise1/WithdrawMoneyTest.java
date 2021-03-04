package isp.lab5.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WithdrawMoneyTest {
    @Test
    public void TestExecute() {
        //when
        Card card = new Card("9999", "1234");

        Account account = new Account("Alex", 29, card);

        WithdrawMoney withdrawMoney = new WithdrawMoney(account, 344);

        //then
        assertEquals("The display should be: 'Not enough founds'", "Not enough founds", withdrawMoney.execute());
    }

}
package isp.lab5.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckMoneyTest {
    @Test
    public void TestExecute() {
        //when
        Card card = new Card("7777", "1234");

        Account account = new Account("Adrian", 29, card);

        CheckMoney checkMoney = new CheckMoney(account);


        //then
        assertEquals("The balance should be:'29.0'", "29.0", checkMoney.execute());
    }
}
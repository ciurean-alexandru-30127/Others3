package isp.lab5.exercise1;

public class ATM {
    private ChangePin oldPin;
    private ChangePin newPin;
    private double amount;
    private Card card;
    private Bank bank;

    public void changePin(ChangePin oldPin, ChangePin newPin) {
        this.oldPin = oldPin;
        this.newPin = newPin;
    }

    public Card getCard() {
        return card;
    }

    public void withdraw(double amount) {
        this.amount = amount;

    }


    public boolean insertCard(Card card, String pin) {
        if (card.getPin().equals(pin))
            return true;

        else {
            return false;
        }
    }

    public void removeCard() {
        card = null;

    }

    public static String userMenu() {
        return "Option 1: Change Pin" + "\n" + "Option 2: Withdraw" +
                "\n" + "Option 3:Check Money" + "\n" + "Option 4:Remove Card";
    }

    public void checkMoney() {
        if (card != null && bank != null) {
            System.out.println(this.bank.executeTransaction(new CheckMoney(this.bank.getAccountByCardid(this.card.getCardid()))));
        } else {
            System.out.println("Please check that the bank is not null and you have inserted a card in Atm");
        }
    }

    public void withdrawMoney(double amount) {
        if (card != null && bank != null) {
            System.out.println(this.bank.executeTransaction(new WithdrawMoney(this.bank.getAccountByCardid(this.card.getCardid()), amount)));
        } else {
            System.out.println("Please check that the bank is not null and you have inserted a card in Atm");
        }
    }


}
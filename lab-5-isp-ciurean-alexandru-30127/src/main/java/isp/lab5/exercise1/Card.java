package isp.lab5.exercise1;

public class Card {
    public String cardid;
    public String pin;

    public Card(String cardid, String pin) {
        this.cardid = cardid;
        this.pin = pin;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getCardid() {
        return cardid;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardid='" + cardid + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}

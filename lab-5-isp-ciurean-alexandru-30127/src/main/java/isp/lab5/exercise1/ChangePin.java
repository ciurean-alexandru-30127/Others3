package isp.lab5.exercise1;

public class ChangePin {
    private String oldPin;
    private String newPin;

    public ChangePin(String oldPin, String newPin) {
        this.oldPin = oldPin;
        this.newPin = newPin;
    }

    public ChangePin() {

    }

    public String getOldPin() {
        return oldPin;
    }

    public void setOldPin(String oldPin) {
        this.oldPin = oldPin;
    }

    public String getNewPin() {
        return newPin;
    }

    public void setNewPin(String newPin) {
        this.newPin = newPin;
    }
}

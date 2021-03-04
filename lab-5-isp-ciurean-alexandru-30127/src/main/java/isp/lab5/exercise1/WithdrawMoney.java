package isp.lab5.exercise1;

public class WithdrawMoney extends Transaction {
    private double amount;

    public WithdrawMoney(Account account, double amount) {
        super(account);
        this.amount = amount;
    }

    @Override
    public String execute() {
        if (this.account.getBalance() > this.amount) {
            this.account.setBalance(this.account.getBalance() - this.amount);
            return "withdraw succesfully";
        } else {
            return "Not enough founds";
        }
    }

}

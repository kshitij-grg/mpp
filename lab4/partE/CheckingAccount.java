package partE;

public class CheckingAccount extends Account {
    private double balance, monthlyFee;
    private String acctId;

    public CheckingAccount(String acctId, double fee, double startBalance) {
        balance = startBalance;
        monthlyFee = fee;
        this.acctId = acctId;
    }

    @Override
    public String getAccountID() {
        return acctId;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double computeUpdatedBalance() {
        return balance - monthlyFee;
    }
}

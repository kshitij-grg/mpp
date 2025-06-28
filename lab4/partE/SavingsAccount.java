package partE;

public class SavingsAccount extends Account {
    private double balance, interestRate;
    private String acctId;

    public SavingsAccount(String acctId, double interestRate, double startBalance) {
        balance = startBalance;
        this.interestRate = interestRate;
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
        return balance + (interestRate * balance);
    }
}

package partE;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Account> accounts;

    public Employee(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public double computeUpdateBalanceSum() {
        double total = 0;
        for (Account account : accounts) {
            total += account.computeUpdatedBalance();
        }
        return total;
    }
}

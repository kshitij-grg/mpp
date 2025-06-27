package probC;


public final class Paycheck {
    private final double grossPay, fica, state, local, medicare, socialSecurity;

    public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
    }

    public void print() {
        System.out.println(this.toString());
    }

    public double getNetPay() {
        return grossPay - (fica + state + local + medicare + socialSecurity);
    }


    @Override
    public String toString() {
        return "Paycheck{" +
                "grossPay=" + grossPay +
                ", fica=" + fica +
                ", state=" + state +
                ", local=" + local +
                ", medicare=" + medicare +
                ", socialSecurity=" + socialSecurity +
                '}';
    }
}

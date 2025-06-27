package probC;

import java.time.LocalDate;

public abstract class Employee {
    public String empId;

    public void print() {
        System.out.println("Printing Employee Pay:");
    }

    public Paycheck calcCompensation(int month, int year) {
        double grossPay = calcGrossPay(month, year);
        double fica = getDeduction(23, grossPay);
        double state = getDeduction(5, grossPay);
        double local = getDeduction(1, grossPay);
        double medicare = getDeduction(3, grossPay);
        double socialSecurity = getDeduction(7.5, grossPay);

        return new Paycheck(grossPay, fica, state, local, medicare, socialSecurity);
    }

    public Employee(String empId) {
        this.empId = empId;
    }

    public double getDeduction(double value, double grossPay) {
        return (double) value / 100 * grossPay;
    }

    abstract public double calcGrossPay(int month, int year);
}

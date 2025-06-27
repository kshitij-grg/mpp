package probC.ext;

import probC.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Hourly hrEmp = new Hourly("E01", 50, 40);
        Salaried slryEmp = new Salaried("E02", 12000);
        Comissioned comEmp = new Comissioned("E03", 2, 6000);

        comEmp.addOrder(new Order("O1", LocalDate.of(2025, 6, 5), 5000));
        comEmp.addOrder(new Order("O2", LocalDate.of(2025, 6, 15), 7000));

        Employee[] employees = new Employee[]{
                hrEmp, slryEmp, comEmp
        };

        int month = 6;
        int year = 2025;

        for (Employee emp : employees) {
            Paycheck paycheck = emp.calcCompensation(month, year);
            emp.print();
            paycheck.print();
            System.out.println("Net Pay: " + paycheck.getNetPay());
            System.out.println();
        }

    }
}

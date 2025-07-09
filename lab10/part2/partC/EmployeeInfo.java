package part2.partC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeInfo {
    static enum SortMethod {BYNAME, BYSALARY}

    ;

    public void sort(List<Employee> emps, SortMethod method) {
        emps.sort((e1, e2) ->
        {
            if (method == SortMethod.BYNAME) {
                int nameComparator = e1.name.compareTo(e2.name);
                if (nameComparator != 0) {
                    return nameComparator;
                }
                return Integer.compare(e1.salary, e2.salary);
            } else {
                return Integer.compare(e1.salary, e2.salary);
            }
        });
    }

    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Joe", 100000));
        emps.add(new Employee("Tim", 50000));
        emps.add(new Employee("Andy", 60000));
        EmployeeInfo ei = new EmployeeInfo();
        ei.sort(emps, SortMethod.BYNAME);
        System.out.println(emps);
        //same instance
        ei.sort(emps, SortMethod.BYSALARY);
        System.out.println(emps);
    }
}

package part2.partA;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int nameComparator = e1.name.compareTo(e2.name);
        if (nameComparator != 0) {
            return nameComparator;
        }
        return Integer.compare(e1.salary, e2.salary);
    }
}

package partB.part11.partA;


import partB.part11.partB.LambdaLibrary;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));

        System.out.println(
                emps.stream()
                        .filter(employee -> employee.getSalary() > 100000)
                        .filter(employee -> employee.getLastName().compareToIgnoreCase("N") >= 0)
                        .map(employee -> employee.getFirstName() + " " + employee.getLastName())
                        .sorted()
                        .collect(Collectors.joining(", "))
        );

        String fullName = LambdaLibrary.FULL_NAME.apply(emps);
        System.out.println(fullName);
    }


}

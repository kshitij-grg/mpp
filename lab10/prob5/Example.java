package prob5;


import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Example {
    // A. (Employee e) -> e.getName()
    Function<Employee, String> name1 = (Employee e) -> e.getName();
    Function<Employee, String> name2 = Employee::getName;

    // B. (Employee e,String s) -> e.setName(s)
    BiConsumer<Employee, String> name3 = (Employee e, String s) -> e.setName(s);
    BiConsumer<Employee, String> name4 = Employee::setName;

    // C. (String s1,String s2) -> s1.compareTo(s2)
    BiFunction<String, String, Integer> string1 = (String s1, String s2) -> s1.compareTo(s2);
    BiFunction<String, String, Integer> string2 = String::compareTo;

    // D. (Integer x,Integer y) -> Math.pow(x,y)
    BiFunction<Integer, Integer, Double> integer1 = (Integer x, Integer y) -> Math.pow(x, y);
    BiFunction<Integer, Integer, Double> integer2 = Math::pow;

    // E. (Apple a) -> a.getWeight()
    Function<Apple, Double> apple1 = (Apple a) -> a.getWeight();
    Function<Apple, Double> apple2 = Apple::getWeight;

    // F. (String x) -> Integer.parseInt(x);
    Function<String, Integer> string3 = (String x) -> Integer.parseInt(x);
    Function<String, Integer> string4 = Integer::parseInt;

    // G. EmployeeNameComparator comp = new EmployeeNameComparator();
    //    (Employee e1, Employee e2) -> comp.compare(e1,e2)
    EmployeeNameComparator comp = new EmployeeNameComparator();
    BiFunction<Employee, Employee, Integer> compareEmp1 = (e1, e2) -> comp.compare(e1, e2);
    BiFunction<Employee, Employee, Integer> compareEmp2 = comp::compare;


    public static void main(String[] args) {
        new Example().evaluator();
    }

    public void evaluator() {
        Employee emp = new Employee("Alice");
        Apple apple = new Apple(1.5);

        System.out.println(name2.apply(emp));

        name4.accept(emp, "Bob");

        System.out.println(name2.apply(emp));

        System.out.println(string2.apply("hello", "world"));

        System.out.println(integer2.apply(2, 3));

        System.out.println(apple2.apply(apple));

        System.out.println(string4.apply("123"));

        Employee e1 = new Employee("Alice");
        Employee e2 = new Employee("Bob");
        System.out.println(compareEmp2.apply(e1, e2));
    }
}

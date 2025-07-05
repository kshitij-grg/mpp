**Explanation for Part B:**

The method `removeDuplicates(List<Employee> employees)` tries to remove the duplicates from the list. Inside this method, another method `inList(Employee e, List<Employee> emps)` is used which is further using the equals method from the `Employee` class.

The method `equals(Employee e)` is not overriding the `equals(Object obj)` from the `Object` class. As a result, Java just uses the default implementation of `equals(Object obj)` from the Object class which checks for reference equality not logical equality.

This is the reason the duplicates are not being removed properly and hence it returns false.
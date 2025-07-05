**Explanation for Part C:**

In the part C too, the method `removeDuplicates(List<Employee> employees)` is trying to remove the duplicates. And in this method, hashmap is begin used to track the seen employees. While the `equals(Object obj)` is overridden perfectly, the method `hashCode()` is not being overridden here.

So here too, JAVA goes back to `Object.hashCode()` which is based on memory address and that's why HashMap does not know that two logically equal Employee objects should be treated the same.
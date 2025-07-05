**Explanation for Part D:**

The `removeDuplicates(List<Employee> employees)` method uses a HashMap to track seen Employee objects. The code marks existing Employees as visited by setting the `visited` field to true. However, the Employee class includes `visited` in both `equals(Object ob)` and `hashCode()`.

This is incorrect because the problem defines duplicates based only on `name` and `salary`. Including `visited` in equals/hashCode means two logically identical Employees (same name and salary) may be considered different if their `visited` flags differ.

That is the reason this code is returning false.
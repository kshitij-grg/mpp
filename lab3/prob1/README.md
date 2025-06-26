1.
Person p1 = new PersonWithJob("Joe", 30000);
Person p2 = new Person("Joe");

Here we have the object of two different classes Person and PersonWithJob which are both referencing to Person class.
In PersonWithJob class, we are overriding the equals method and checking both name and salary whereas in Person class,
we are only checking the name variable in equals method.

So, when we do "p1.equals(p2)", the object of Person class gets checked with the object of PersonWithJob class, and
based on the equals method in PersonWithJob it tries to equal both the name and salary but "p2" only has name not 
salary and hence it returns false.

On the other hand, when we do "p2.equals(p1)", the object of PersonWithJob class gets checked with the object of Person
class and based on the "equals" method in Person class, it tires to equal only the name which in our case is same, so
it returns true.
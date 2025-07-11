(a)

```java
    public static void partA() {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints;
        double dbl = sum(nums);
        nums.add(3.14);
    }
```
Here, the code will give compile error in the last line.
`nums` is defined as `List<? extends Number>` which means that it is an
unknown subtype of Number. It basically means that it does not it exact
subtype so we cannot add anything onto it, but we can read it from here.

(b)
```java
    public static void partB(){
        List<Object> objs = new ArrayList<>();
        objs.add(1);
        objs.add("two");                                                                                                                     
        List<? super Integer> ints = objs;
        ints.add(3);
        double dbl = sum(ints);
    }
```

Here, the code will throw error in the last line.
it is passing the `ints` variable in `sum` method which accepts the argument
of type `Collection<? extends Number>` that means it is expecting a collection
of something which extends `Number`. But the `ints` variable is declared
as `<? super Integer>` which means it is not guaranteed to be `<? extends Number>`.
Hence, the code gives error.

a. First fragment:\
`List<Integer> ints = new ArrayList<>();`\
`ints.add(1);`\
`ints.add(2);`\
`List<Number> nums = ints;`\
`nums.add(3.14);`

Here, the error occurs on the fourth line. Although Integer is a subclass of Number but the `List<Integer>` is not 
a subtype of `List<Number>`. So allowing this line would break the type safety, which is why the error
occurs at the fourth line.

b. Second fragment:\
`List<Integer> ints = new ArrayList<>();`\
`ints.add(1);`\
`ints.add(2);`\
`List<? extends Number> nums = ints;`\
`nums.add(3.14);`

Here, the error occurs on the last line. `? extends Number` means some unknown 
type subtype of Number class, it means that that type can be of any type so it
does not know which type can we add into it, so it does not let us add anything
onto it. It will be fine for reading from the list but not for the adding purpose.
package prob4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Example {
    public static double sum(Collection<? extends Number> nums) {
        double s = 0.0;
        for(Number num : nums) s += num.doubleValue();
        return s;
    }

//    public static void partA() {
//        List<Integer> ints = new ArrayList<>();
//        ints.add(1);
//        ints.add(2);
//        List<? extends Number> nums = ints;
//        double dbl = sum(nums);
//        nums.add(3.14);
//    }

//    public static void partB(){
//        List<Object> objs = new ArrayList<>();
//        objs.add(1);
//        objs.add("two");
//        List<? super Integer> ints = objs;
//        ints.add(3);
//        double dbl = sum(ints);
//    }
}

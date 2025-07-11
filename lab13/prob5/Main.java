package prob5;

import java.util.List;

public class Main {
    public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
        if (list == null || list.size() < 2) {
            throw new IllegalArgumentException("Must have at least two elements");
        }
        T smallest = null;
        T secondSmallest = null;

        for (T t : list) {
            if (smallest == null || t.compareTo(smallest) < 0) {
                secondSmallest = smallest;
                smallest = t;
            } else if (!t.equals(smallest) && (secondSmallest == null || t.compareTo(secondSmallest) < 0)) {
                secondSmallest = t;
            }
        }

        if(secondSmallest == null){
            throw new IllegalArgumentException("No such element!");
        }
        return secondSmallest;
    }
}

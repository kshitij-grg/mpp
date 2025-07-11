package partB.part10.partC;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> myIntStream = Stream.of(1, 2, 3, 4, 5, 6);
        IntSummaryStatistics statistics = myIntStream.mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("Min: " + statistics.getMin() + " and " + "Max: " + statistics.getMax());
    }
}

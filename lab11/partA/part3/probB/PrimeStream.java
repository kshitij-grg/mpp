package partA.part3.probB;

import partA.part3.probA.Main;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class PrimeStream {
    private Supplier<Integer> getPrimes() {

        return new Supplier<Integer>() {
            int current = 1;

            @Override
            public Integer get() {
                current = new Main().nextPrime(current);
                return current;
            }
        };
    }

    public void printFirstNPrimes(long n) {
        Stream.generate(getPrimes()).limit(n).forEach(System.out::println);
    }
}

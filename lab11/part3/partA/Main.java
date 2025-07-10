package part3.partA;

import java.util.stream.Stream;

public class Main {
    Stream<Integer> primes = Stream.iterate(2, this::nextPrime);

    public int nextPrime(int after) {
        int candidate = after + 1;
        while (!isPrime(candidate)) {
            candidate++;
        }
        return candidate;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

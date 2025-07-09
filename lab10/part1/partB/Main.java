package part1.partB;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    static class InnerClassExample implements Supplier<Double> {
        @Override
        public Double get() {
            return Math.random();
        }
    }

    public static void main(String[] args) {
        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());

        InnerClassExample innerClassExample = new InnerClassExample();
        System.out.println(innerClassExample.get());
    }
}

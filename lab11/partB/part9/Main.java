package partB.part9;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        printSquares(5);
    }

    public static void printSquares(int num) {
        IntStream
                .iterate(1, operand -> operand + 1)
                .limit(num)
                .forEach(value -> System.out.println(value * value));
    }
}

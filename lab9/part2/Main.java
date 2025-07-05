package part2;

public class Main {
    public static void main(String[] args) {

        Expr multiplication = new Multiplication(
                new Addition(new Constants(2), new Constants(3)),
                new Constants(4)
        );

        int result = ExpressionEvaluator.eval(multiplication);

        System.out.println("Result: " + result);
    }
}

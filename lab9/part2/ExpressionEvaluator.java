package part2;

public class ExpressionEvaluator {
    public static int eval(Expr expr) {
        return switch (expr) {
            case Constants c -> c.value();
            case Addition(Expr left, Expr right) -> eval(left) + eval(right);
            case Multiplication(Expr left, Expr right) -> eval(left) * eval(right);
            default -> throw new IllegalStateException("Unexpected value: " + expr);
        };
    }
}

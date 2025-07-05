package part2;

public sealed interface Expr permits Constants, Addition, Multiplication {
}
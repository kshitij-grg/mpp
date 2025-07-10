package part2;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new CannotFly();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        super.display();
    }
}

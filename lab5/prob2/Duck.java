package prob2;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void quack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("swimming");
    }

    public void display() {
        System.out.println("displaying");
    }

    public void fly() {
        flyBehavior.fly();
    }
}

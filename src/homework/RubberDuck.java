package homework;

public class RubberDuck implements Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        // these properties are inherited from Duck
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;

    }

    public final void display() {
        System.out.println("I'm a Rubber Duck");
    }

    public final FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public final void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public final QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public final void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public final void performQuack() {
        quackBehavior.quack();
    }

    public final void performFly() {
        flyBehavior.fly();
    }

}

package homework;

public interface Duck {

    public abstract void setFlyBehavior(FlyBehavior fb);

    public abstract void setQuackBehavior(QuackBehavior qb);

    public abstract void display();

    public abstract void performQuack();

    public abstract void performFly();

}

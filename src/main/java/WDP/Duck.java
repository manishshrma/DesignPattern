package WDP;

public abstract class Duck {
    FlyingBehaviour flyingBehaviour;
    QuackBehaviour quackBehaviour;

    public void swim() {
        System.out.println("All duck flat even decoy!");

    }

    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    public FlyingBehaviour getFlyingBehaviour() {
        return this.flyingBehaviour;
    }

    public void performFly() {
        this.flyingBehaviour.fly();

    }

    public abstract void display();
    // fly and quack are those behaviour that vary. so we seperated them from those that remain same
}

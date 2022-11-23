package WDP;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MalardDuck();
        // here give what type of flying we want
       duck.setFlyingBehaviour(new FlyWithWings());
       duck.performFly();
    }
}

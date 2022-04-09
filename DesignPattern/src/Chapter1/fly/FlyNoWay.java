package Chapter1.fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("날수있는 오리당");
    }
}

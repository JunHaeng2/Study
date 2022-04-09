package Chapter1.fly;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("날수없는 오리당");
    }
}

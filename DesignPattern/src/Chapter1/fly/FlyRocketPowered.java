package Chapter1.fly;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("로켓처럼 날라가는 오리다");
    }
}

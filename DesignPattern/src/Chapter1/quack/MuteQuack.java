package Chapter1.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("못울어");
    }
}

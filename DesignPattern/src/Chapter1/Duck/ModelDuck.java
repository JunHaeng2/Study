package Chapter1.Duck;

import Chapter1.fly.FlyNoWay;
import Chapter1.quack.Quack;
import Chapter1.quack.QuackBehavior;

public class ModelDuck extends Duck{
    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("나는 모형 오리에요");
    }
}

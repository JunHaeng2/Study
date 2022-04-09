package Chapter1;

import Chapter1.Duck.Duck;
import Chapter1.Duck.ModelDuck;
import Chapter1.fly.FlyRocketPowered;

/**
 *  Chapter 1 전략패턴 구성
 *  이해한 바로..
 *  상속관계로서 해결하는게 아니라(상속으로 여러 오리를 만들다보면 엄청나게 많은 오리가
 *  생기게 되면 수정할게 너무나도 많아진다, 중복되는경우도 많고)
 *  캡슐화와 구성(A와 B의 관계)를 활용하는걸 전략패턴이라고 한다.. !
 *  대충 어떤식으로 구성되는지는 이해되긴함..
 */


public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new ModelDuck();
        mallard.performFly();
        mallard.performQuack();

        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.performFly();

        mallard.display();
    }
}

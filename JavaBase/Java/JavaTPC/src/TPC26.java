/*
다형성 -> 상위 클래스에서 하위 클래스에다가 동일한 메세지를 보냈을때
각 자식 클래스마다 서로 다르게 동작되는것을 객체지향의 원리라고 한다.
중요함 ! 

다형성을 위해서는 override라는 개념이 선제적으로 되어있어야함.
downcasting을 통해서 하위 클래스의 메소드(상위클래스에 없는)를 접근
할수있다.

다형성 활용
1. 다형성 인수 : 부모타입으로 받으면 됨 / 다양한 파라메터를 한번에
2. 다형성 배열 : 서로 다른 객체를 한번에 담을수있음

*/
import kr.tpc.*;

public class TPC26 {
    public static void main(String[] args) {
        // 1. 다형성 인수
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);

    }  // upcasting
    private static void display(Animal a) {
        a.eat();

        if (a instanceof Cat) {
            ((Cat)a).night(); // downcasting
        }
    }
}

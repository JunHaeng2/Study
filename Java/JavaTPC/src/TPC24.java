/*
상속관계에서 객체생성 방법

부모 클래스를 이용해서 객체를 만드는 간접적인 방법
자식 클래스를 이용해서 객체를 만다는 직접적인 방법

상속은 interface 기반의 프로그래밍을 할 수 있다.

ex Animal d = new Dog();
하위 클래스의 동작 방식을 모를때, 간접이용하는 방식임
이런 방식이 더 선호되고 많이 사용됨

정적 바인딩 / 동적 바인딩 

*/

import kr.tpc.Dog;
import kr.tpc.Cat;
import kr.tpc.Animal;

public class TPC24 {
    public static void main(String[] args) {
        
        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();

        Animal ani = new Dog(); // upcasting
        ani.eat(); 

        ani = new Cat();
        ani.eat();

        // 특정 자식의 타입으로 type 형을 변환시켜서 사용하는거임
        ((Cat)ani).night(); // downcasting

        // 다형성 -> 상위 클래스가 하위 클래스에게 동일한 메세지를 보냄
        // 하위 클래스가 동작을 하는데, 서로 다르게 동작되는 원리를
        // 다형성이라고 말한다..! 뒤에서 이해하셈
        
    }    
}

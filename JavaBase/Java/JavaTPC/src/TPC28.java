/*
추상클래스 : 다형성을 보장하기위해서 생겨난 클래스 
-> 매서드의 구현부가 없는거.. 메서드의 원형만 남게되는걸 말함
-> 왜냐하면 자식클래스에서 어쩌피 메서드를 각각 활용하여 사용할것이기에
-> 추상메서드도 갖지만 구현메서드, 즉 바디가 있는 메서드도 충분히
올수있음. 

추상메서드에 딸린 자식 메서드의 경우는 반드시 재정의가 필요하다.
-> 재정의를 하지 않으면 이 자식 클래스도 결국 추상화가 될수밖에
없다는 소리임.. ! 

public abstract class Animal() { 
    public abstract void eat(); 
}

*/
import kr.poly.*;

public class TPC28 {
    public static void main(String[] args) {
        Animal ani1 = new Dog();
        ani1.eat(); // 동적바인딩
        ani1.move();
        // 추상클래스 에서 
        // 부모가 하위 클래스의 동작방식을 모른다 하더라도
        // 재정의만 되어있으면 그 하위클래스를 사용할수있는거
        
        Animal ani2 = new Cat();
        ani2.eat();
        ani2.move();
        ((Cat)ani2).night(); // 다운캐스팅
    }
}

/*
override -> 상속관계에서 상속받은 하위 클래스가 상위 클래스의 동작을 
수정하는것 , 재정의

override -> 부모의 메소드가 무시
메모리에 부모와 자식 메서드가 공존하지만 결국 자식 메서드가 실행된다.

upcasting ! 
Animal d = new Dog();
d.eat();

동적 바인딩 : 호출된 메서드가 실행시점에서 결정되는 바인딩
-> 프로그램의 속도가 떨어지는 원인이 되지만 이점이 많기에 사용됨

오버로딩 -> 정적 바인딩
오버라이딩 -> 동적 바인딩 

*/
import kr.tpc.*;

public class TPC23 {
    public static void main(String[] args) {
        
        // Animal 부모클래스를 사용하지 않음
        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.night();

        // Animal 부모클래스를 사용해야 상속의 이점을 활용하는것
        // upcasting(자동형변환)이 가능하기에
        Animal d1 = new Dog();
        Animal c1 = new Cat();

        System.out.println("");
        d1.eat(); // Animal 타입임에도 불구하고 자식 클래스로 갈수있는
        // 오버라이딩..! 
        c1.eat();

        // 다운캐스팅(강제 형변환) 
        // Animal을 cat으로 강제 형변환 시캬주어서 night를 쓸수
        // 있게 만들어주는거임
        ((Cat)c1).night();


    }
}

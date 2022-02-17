/*
Object Castin(객체 형 변환)
- 상속관계에 있는 클래스들 간의 형(Data type)을 바꾸는것

upcasting : 자동형변환 자식클래스 -> 부모클래스
downcasting : 강제형변환 부모클래스 -> 자식클래스
(다운캐스팅은 업캐스팅이 전제되어있는 상태에서 사용하는거임)

*/
import kr.tpc.*;

public class TPC25 {
    public static void main(String[] args) {
        
        // upcasting 
        Animal ani = new Cat();
        // Object ani1 = new Cat();
        ani.eat(); // 컴파일 시점 -> Animal
                   // 실행 시점 --> eat 
        
        ((Cat)ani).night(); // 다운캐스팅 

        ani = new Dog();
        ani.eat();

        // 다형성 
        // 상위클래스가 하위클래스에게 동일한 메세지로 
        // 서로 다르게 동작시키는 객체지향 원리이다.

        // 부모클래스의 Object를 활용하는경우가 많기에.. 

        // 이런식으로 조상클래스도 부모클래스의 역할을하는거임
        Object o = new Dog();
        ((Dog)o).eat();

    }
}

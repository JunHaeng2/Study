import kr.tpc.Cat;
import kr.tpc.Dog;

/*
상속 : 수직적 구조
부모가 가지고 있는 상태정보, 메소드 등을 자식 class에서 활용가능
코드의 중복을 없앨수 있고 확장을 쉽게 할수있음.

상속 키워드 : extends 
super class <-> sub class 

상속 관계에 있을때 객체 생성을 어떻게 해야하는지에 대해서 ! memory적으로 이해

모든 클래스의 root 클래스, 즉 최상위 클래스는 object다.
그렇기에 extends object를 갖고 있는거임 / 아무리 상속이 없다하더라도

super(); 생성자 안에 들어갔던 

*/
import kr.tpc.*;

public class TPC22 {
    public static void main(String[] args) {
        // Dog, cat --> Animal

        // Dog d = new Dog();
        // d.eat();

        // Cat c = new Cat();
        // c.eat();
        // c.night(); 

        // Dog.java(X), Dog.class(o)
        // Animal <-- Dog.class, Cat.class

        // Dog dd = new Dog();
        // dd.eat();

        Animal ani = new Dog();
        ani.eat();
        
    }
}

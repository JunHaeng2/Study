package kr.poly;

public class Dog extends Animal{
    // 이름, 나이, 종 : 상태정보

    // 재정의(override)
    // 부모가 추상클래스이면 자식에서는 무조건 재정의가 필요한거임

    @Override
    public void eat() {
        System.out.println("개처럼 먹는다");
    }
}

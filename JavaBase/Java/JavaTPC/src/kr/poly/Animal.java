package kr.poly;

public abstract class Animal { // 추상클래스(불완전한 객체)
    // Animal ani = new Animal(); --> (X)
    // 스스로 객체는 못만들겠지만, 부모로서의 역할은 수행할수 있음
    // 다형성을 보장하는 역할로만 사용되는거임 

    public abstract void eat(); // 추상메서드(불완전한 메서드)

    public void move() { 
        // 구현메서드, 추상클래에서 구현메서드를 넣을수 있다.
        // 이 경우에는 자식 클래스에서 재정의 할 필요 없음.
        System.out.println("무리를 지어서 이동한다.");
    }
}

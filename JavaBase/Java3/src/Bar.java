public interface Bar extends Foo5 {

    // Bar를 구현하는 클래스들이 이걸 다시 재정의 해야한다.
    abstract void printNameUpperCase();
}

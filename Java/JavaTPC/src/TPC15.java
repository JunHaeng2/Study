import kr.tpc.inflearn;

/*
생성자 메서드가 private가 되어있으면 접근을 하지 못하기에 객체를 생성할수없음
new를 하지않고도 객체로 만들려면 모든 클래스의 멤버를 static으로 하면됨.
static은 객체를 생성하지 않고도 메모리 area에 자동으로 올라가기 때문에 

인스턴스 메서드 -> 객체 생성 후 접근가능 static x
클래스 메서드 -> 객체 생성 전에도 접근가능 static o

클래스를 사용하는 시점에서 static 멤버는 먼저 자동으로 메모리에 로딩이 된다.
그 이후 호출이 된다.

*/
 
public class TPC15 {
    public static void main(String[] args) {
         
        inflearn inf = new inflearn();
        inf.tpc();
        // inf.java();

        // static 메소드는 이렇게 접근하면됨
        // 객체생성하지 않고 클래스 이름으로 바로 접근하는 방식으로
        inflearn.java();

        // Java API 생성자 private
        System.out.println("출략");
        // Math.min(a, b);
        Math.max(10, 20);
    }
}

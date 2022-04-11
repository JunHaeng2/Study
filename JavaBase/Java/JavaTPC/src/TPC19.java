import kr.tpc.overLoad;

/*
메서드 오버로딩 : 같은 이름의 메소드를 여러 개 가지면서
매개변수의 유형과 개수를 다르도록 하는 기술
-> 메서드의 signature가 다르게 하면 된다.

정적바인딩 : 컴파일 시점에서 호출될 메서드가 이미 결정되어있는 바인딩
-> 속도랑은 관계없다
-> 오버로딩은 정적바인딩 되어있다.

*/

public class TPC19 {
    public static void main(String[] args) {
        // 1+1 = ? 23.4 + 10 = ? 17.5 + 35.4 = ?
        
        overLoad a = new overLoad();

        a.hap(10, 20);
        a.hap(20.1f, 30);
        a.hap(20, 30.1f);
        a.hap(33.2f, 38.5f);
    }
}


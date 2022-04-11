package ch6;

public class TestClass2 {
    int iv;
    static int cv;

    void instanceMethod() {
        System.out.println(iv);
        System.out.println(cv);
    }

    static void instanceMethod2() {

        // 이렇게 static 메소드에서는 인스턴스 변수를 호출할수 없다.
        // static 메소드가 main에 올라왔을때에 인스턴스 변수는 올라오지 않았을수도 있기에
        // 컴파일 상에서 막아버리는거임
        // 그레서 객체를 생성한 이후에야 static 메소드에서도 인스턴스 변수를 사용할수있게된다.
//        System.out.println(iv);
        System.out.println(cv);
    }
}

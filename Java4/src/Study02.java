/*

메모리 영역
-> 메소드 영역(공유하는 자원, 클래스 수준의 자원)
-> 힙 영역(객체를 저장)
-> 스택 영역(쓰레드 마다 런타임 스택이란걸 만듬, 스택 프레임을 쌓음)
-> PC 레지스터 : 쓰레드 마다 현재 실행할 스택 프레임을 가르킴

GC -> 더이상 참조되지 않는 객체를 정리하는 역할.

 */

public class Study02 {

    static String myName;

    static {
        myName = "keesun";
    }

    private String foo = "bar";

    public static void main(String[] args) {
        Thread.currentThread();

        Study02 s = new Study02();
        System.out.println(Study02.class.getSuperclass());
    }

}

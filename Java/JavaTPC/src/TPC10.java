/*
JVM은 4가지 정도의 메모리를 이용해서 프로그램을 동작시킨다.
method, stack, heap Area, literal pool 

JVM이 실행클래스를 실행하는 절차
1. 해당클래스를 현재 디렉토리에서 찾는다.
2. 클래스 내부에 있는 static 키워드가 있는 메서드를 메모리로 로딩
 static -> 이 키워드가 붙어있어야 처음 실행될때 메모리로 로딩됨
 method Area - static zone에 메소드들이 byte code로 
 올라온다는 소리
3. main method()가 호출되면 호출정보가 stack area로 올라감
4. main 부분의 함수가 호출되어 return 될떄까지 stack area에
있다가 return 되면 사라짐 -> 다시 제어권이 main
5. 이후 main의 코드들이 다 끝나면 stack area엔 아무것도 
남아있지 않은 상태로.. ! 

stack(LIFO) : 말그대로 스택 자료구조임 !! 
static => 고정된 위치에 자동으로 로딩 시켜주는 예약어!

*/

public class TPC10 {
    public static void main(String[] args) {
        int a = 30;
        int b = 50;
        int v = add(a, b);
        System.out.println(v);    
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

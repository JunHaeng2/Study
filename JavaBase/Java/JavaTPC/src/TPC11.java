/*
static이 없는 함수가 있는 경우는
1. stack Area에 main 함수 부분이 진행된다.
2. 메소드에 static이 없는 경우에는 

이런식으로 객체를 생성해야함 ! 
TPC08 tpc = new TPC11(); 
int v = tpc.add(a, b); 

3. 이렇게 객체를 만들게 되면 heap Area에 올라온다 (non-static 
zone 에 있는 메소드의 경우 heap Area에 주소가 pointer로 올라온다)

'.' 이라는것은 객체의 주소를 참조하여 그 안에 있는 메소드를 활용한다
정도로 이해하면되는건가? 


*/

public class TPC11 {
    public static void main(String[] args) {
        int a = 56;
        int b = 40;

        TPC11 tpc = new TPC11(); // 객체 생성, heap area
        int v = tpc.sum(a, b);

        System.out.println(v);
    }

    public int sum(int a, int b) {
        int v = a + b;
        return v;
        
    }
}

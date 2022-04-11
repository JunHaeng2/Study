import kr.inflearn.IntArray;

/*
배열처럼 동작하는 클래스 만들기(IntArray)
 
*/

public class TPC40 {
    public static void main(String[] args) {
        IntArray arr = new IntArray(3);
        
        arr.add(10);
        arr.add(20);
        arr.add(30);

        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));
        System.out.println(arr.size());
    }
}

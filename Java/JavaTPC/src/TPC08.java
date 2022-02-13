/*
변수 : 데이터를 한 개(한개의 형태) 저장 가능함
메서드 : 동작을 한 후에 데이터를 한 개만 만들어 낸다. 기능/동작
-> 메서드에서 리턴 하는 값을 메서드 이름에 저장(메서드 이름이 변수 역할을 한다.)

접근제어자 리턴부분 메서드이름 (매개변수 리스트) {

}

*/

public class TPC08 {
    public static void main(String[] args) {
    // 메서드 -> 동작(method), 기능(function)
    // 정수 2개를 더하여 총합을 리턴하는 메서드를 정의하시오.
        int a, b;
        a = 10;
        b = 20;
        System.out.println(sum(a, b));

        int[] arr = makeArr();
        int hap = 0;
        for (int i = 0; i < arr.length; i++) {
            hap += arr[i];
        }
        System.out.println(hap);
    }
    
    public static int sum(int val1, int val2) {
        return val1 + val2;
    }

    public static int[] makeArr() {
        int x = 10;
        int y = 20;
        int z = 30;

        int[] arr = new int[3];

        arr[0] = x;
        arr[1] = y;
        arr[2] = z;

        return arr; 
    }
}

/*
배열 : 변수를 연속적으로 만드는 방법
int[] a = new int[3];
자바에서는 배열도 객체로 생각한다. 
a.length = 3 
'.' -> a가 참조하고있는 건 ~ 

배열의 장단점
1. 많은 수의 변수를 만들기 용이
2. 기억공간 접근이 쉽다(반복문 사용 가능)
3. 데이터 이동 쉬움(데이터를 하나의 형태로 담아서 이동 가능)
4. 서로 다른 데이터 타입(이질적인 구조, 객체)를 저장할수는 없다. -> class로 저장
-> 동일한 타입의 데이터를 여러 개 저장하기 위한 연속적인 메모리 구조 

*/

public class TPC06 {
    public static void main(String[] args) {
        // 4. 데이터를 이동하라(변수 vs 배열)
        int a, b, c;
        a = 10;
        b = 20;
        c = 30;
        // a+b+c = ? 메서드 처리 -> hap() 
        hap(a, b, c);
        
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        hap1(arr);
    }
    
    public static void hap(int val1, int val2, int val3) {
        int sum = val1+val2+val3;
        System.out.println(sum);
    }

    public static void hap1(int[] arr) {
        // 반복문 활용 - for, while 
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}

/*
call by value : 값을 전달
call by reference : 주소값을 전달

*/


public class TPC09 {
    public static void main(String[] args) {
        int a = 20;
        float b = 56.f;

        float v = sum(a, b);
        System.out.println(v);

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arrSum(arr));

    }
    public static float sum(int a, float b) {
        return a + b; 
    }

    public static int arrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}

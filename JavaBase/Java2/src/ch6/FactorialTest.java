package ch6;

public class FactorialTest {
    public static void main(String[] args) {
        int result = factorial(4);

        System.out.println(result);

    }

    // static이 있으면 객체를 생성하지 않고도 호출할수있다는 사실을 잊지 말아야함.. !
    // 재귀함수의 경우에는 for문보다 효율이 떨어지기 때문에 논리적인 간결성이 아니면 사용하지말기
    static int factorial(int n) {
        int result = 0;

        if (n == 1) {
            result = 1;
        }
        else {
            result = n * factorial(n - 1);
        }
        return result;
    }
}

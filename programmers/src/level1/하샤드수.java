package level1;

public class 하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;
        int tmp = x;

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            if (x == 0) break;
            arr[i] = x % 10;
            x = x / 10;
        }

        int a = 0;
        for (int i : arr) {
            a += i;
        }

        System.out.println(a);

        if (tmp % a != 0) answer = false;
        return answer;
    }

    public static void main(String[] args) {
        하샤드수 s = new 하샤드수();
        System.out.println(s.solution(11));
    }
}

package level1;

import java.util.Scanner;

public class 콜라츠추측 {

    public int solution(int num) {
        int cnt = 0;

        while (true) {
            if (cnt == 500) {
                return -1;
            }
            if (num == 1) {
                return cnt;
            }

            if (num % 2 == 0) {
                num = num % 2;
            } else if (num % 2 != 0) {
                num = num * 3 + 1;
            }

            cnt++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        콜라츠추측 s = new 콜라츠추측();
        System.out.println(s.solution(n));
    }
}

package practice.P_chapter3;

import java.util.Scanner;

public class P3_5 {

    // 못풀었음

    public static int solution(int n) {
        int answer = 0;

        if (n % 2 != 0) {
            answer += 1;
        }

        for (int i = 3; i < Math.sqrt(n) + 1; i++) {
            if ((n % 3) == 0) {
                answer += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }
}

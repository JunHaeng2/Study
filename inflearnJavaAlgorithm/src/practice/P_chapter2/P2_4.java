package practice.P_chapter2;

import java.util.Scanner;

public class P2_4 {

    public static String solution(int n) {
        String answer = "1 1";

        int a = 1;
        int b = 1;
        int c;

        for (int i = 2; i < n; i++) {
            c = a + b;
            answer += " ";
            answer += String.valueOf(c);
            a = b;
            b = c;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }
}

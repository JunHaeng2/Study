package practice.P_chapter10;

import java.util.Scanner;

public class P10_2 {
    static int[] dp;

    public static int solution(int n) {
        for (int i=3; i<n+1; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n+1];
        dp[1] = 2;
        dp[2] = 3;

        System.out.println(solution(n));
    }
}

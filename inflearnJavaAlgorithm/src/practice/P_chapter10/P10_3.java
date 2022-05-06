package practice.P_chapter10;

import java.util.Scanner;

public class P10_3 {
    static int[] dp;

    public static int solution(int n, int[] arr) {
        int answer = 0;
        dp = new int[n];
        for (int i=0; i<n; i++) {
            dp[i] = 1;
            for (int j=0; j<i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            answer = Math.max(answer, dp[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, arr));
    }
}

package programmers.level2;

public class p2xn타일링 {
    static class Solution {
        public int solution(int n) {
            long[] dp = new long[n+1];
            dp[1] = 1;
            dp[2] = 2;
            for (int i = 3; i < n+1; i++) {
                dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
            }
            return (int) dp[n];
        }

        public static void main(String[] args) {
            Solution t = new Solution();
            System.out.println(t.solution(4));
        }
    }
}

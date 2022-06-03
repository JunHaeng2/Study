package programmers.level2;

public class 가장큰정사각형찾기2 {
    class Solution {
        public int solution(int [][]board) {
            int answer = 0;
            int n = board.length;
            int m = board[0].length;
            int[][] dp = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    dp[i+1][j+1] = board[i][j];
                }
            }

            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    if (dp[i][j] == 1) {
                        dp[i][j] = Math.min(Math.min(dp[i-1][j-1],
                                dp[i-1][j]), dp[i][j-1]) + 1;

                        if (answer < dp[i][j]) answer = dp[i][j];
                    }
                }
            }

            return answer * answer;
        }
    }
}

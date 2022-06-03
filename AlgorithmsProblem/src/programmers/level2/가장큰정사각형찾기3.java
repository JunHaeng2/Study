package programmers.level2;

public class 가장큰정사각형찾기3 {
    class Solution {
        public int solution(int [][]board) {
            int answer = 0;
            int n = board.length;
            int m = board[0].length;
            if (n < 2 || m < 2) {
                return board[0][0];
            }

            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    if (board[i][j] == 1) {
                        board[i][j] = Math.min(Math.min(
                                board[i-1][j], board[i-1][j-1]),
                                board[i][j-1]
                        ) + 1;
                    }

                    if (answer < board[i][j]) answer = board[i][j];
                }
            }

            return answer * answer;
        }
    }
}

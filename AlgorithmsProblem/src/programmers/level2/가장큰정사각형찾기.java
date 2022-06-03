package programmers.level2;

public class 가장큰정사각형찾기 {
    class Solution {
        public int solution(int [][]board) {
            int answer = 0;
            int row = board.length;
            int col = board[0].length;
            int[][] map = new int[row][col];

            for (int i = 1; i < row; i++) {
                for (int j = 1; j < col; j++) {
                    if (board[i][j] == 1) {
                        map[i][j] = Math.min(Math.min(map[i][j-1],
                                map[i-1][j-1]), map[i-1][j]) + 1;
                        answer = Math.max(answer, map[i][j]);
                    }
                }
            }
            return answer * answer;
        }
    }
}

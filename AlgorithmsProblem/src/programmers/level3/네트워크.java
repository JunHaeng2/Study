package programmers.level3;

public class 네트워크 {
    class Solution {
        public int solution(int n, int[][] computers) {
            int answer = 0;
            boolean[] check = new boolean[computers.length];
            for (int i = 0; i < computers.length; i++) {
                if (!check[i]) {
                    dfs(computers, i, check);
                    answer++;
                }
            }
            return answer;
        }

        private void dfs(int[][] computers, int i, boolean[] check) {
            check[i] = true;

            for (int j = 0; j < computers.length; j++) {
                if (j != i && computers[i][j] == 1 && check[j] == false) {
                    dfs(computers, j, check);
                }
            }
        }
    }
}

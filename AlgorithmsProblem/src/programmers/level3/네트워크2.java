package programmers.level3;

public class 네트워크2 {
    class Solution {
        public int solution(int n, int[][] computers) {
            int answer = 0;
            boolean[] visited = new boolean[computers.length];

            for (int i = 0; i < computers.length; i++) {
                if (!visited[i]) {
                    dfs(computers, visited, i);
                    answer++;
                }
            }

            return answer;
        }

        private void dfs(int[][] computers, boolean[] visited, int i) {
            visited[i] = true;
            for (int j = 0; j < computers.length; j++) {
                if (i != j && computers[i][j] == 1 && visited[j] == false) {
                    dfs(computers, visited, j);
                }
            }
        }
    }
}

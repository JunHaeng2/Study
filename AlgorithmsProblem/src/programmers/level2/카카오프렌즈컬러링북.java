package programmers.level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class 카카오프렌즈컬러링북 {
    static class Solution {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        public int[] solution(int m, int n, int[][] picture) {
            int numberOfArea = 0;
            int maxSizeOfOneArea = 0;
            int[][] visited = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (visited[i][j] == 0 && picture[i][j] != 0) {
                        visited[i][j] = 1;
                        numberOfArea++;
                        maxSizeOfOneArea = Math.max(maxSizeOfOneArea,
                                bfs(visited, picture, i, j, m, n));
                    }
                }
            }

            int[] answer = new int[2];
            answer[0] = numberOfArea;
            answer[1] = maxSizeOfOneArea;

            System.out.println(answer[0]);
            System.out.println(answer[1]);
            return answer;
        }

        private int bfs(int[][] visited, int picture[][], int i, int j, int m, int n) {
            int ans = 1;
            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[]{i, j});

            while (!q.isEmpty()) {
                int[] tmp = q.poll();
                for (int k = 0; k < 4; k++) {
                    int nx = tmp[0] + dx[k];
                    int ny = tmp[1] + dy[k];

                    if (nx < 0 || ny < 0 || nx >= m || ny >= n
                    || visited[nx][ny] == 1 || picture[nx][ny] != picture[i][j]) continue;

                    visited[nx][ny] = 1;
                    q.offer(new int[]{nx, ny});
                    ans++;
                }
            }

            return ans;
        }

        public static void main(String[] args) {
            Solution s = new Solution();
            s.solution(6, 4, new int[][]{
                    {1,1,1,0}, {1,2,2,0}, {1,0,0,1}, {0,0,0,1}, {0,0,0,3},
                    {0,0,0,3}
            });
        }
    }
}

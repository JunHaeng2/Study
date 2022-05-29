package D0528;

import java.util.*;

public class P200 {
    class Solution {
        public int numIslands(char[][] grid) {

            int m = grid.length;
            int n = grid[0].length;

            boolean[][] visited = new boolean[m][n];
            Queue<int[]> q = new LinkedList<>();
            int island = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '1' && !visited[i][j]) {
                        q.offer(new int[]{i, j});
                        visited[i][j] = true;
                        bfs(m, n, grid, q, visited);
                        island++;
                    }
                }
            }

            return island;
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1 ,1};
        private void bfs(int m, int n, char[][] grid, Queue<int[]> q, boolean[][] visited) {

            while (!q.isEmpty()) {
                int[] tmp = q.poll();
                for (int i = 0; i < 4; i++) {
                    int nx = tmp[0] + dx[i];
                    int ny = tmp[1] + dy[i];

                    if (nx >= 0 && ny >= 0 && nx < m && ny < n
                            && !visited[nx][ny] && grid[nx][ny] == '1') {
                        q.offer(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
    }
}

package D0528;

import java.util.*;

public class P695 {
    class Solution {
        public int maxAreaOfIsland(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;

            Queue<int[]> q = new LinkedList<>();
            int island = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) island =
                            Math.max(island, bfs(i, j, m, n, q, grid));
                }
            }

            return island;
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        private int bfs(int i, int j, int m, int n, Queue<int[]> q, int[][] grid) {
            q.offer(new int[]{i, j});
            grid[i][j] = 0;
            int island = 0;

            while (!q.isEmpty()) {
                int[] tmp = q.poll();
                ++island;

                for (int k = 0; k < 4; k++) {
                    int nx = tmp[0] + dx[k];
                    int ny = tmp[1] + dy[k];

                    if (nx >= 0 && ny >= 0 && nx < m && ny < n && grid[nx][ny] == 1) {
                        grid[nx][ny] = 0;
                        q.offer(new int[]{nx, ny});
                    }
                }
            }

            return island;
        }
    }
}

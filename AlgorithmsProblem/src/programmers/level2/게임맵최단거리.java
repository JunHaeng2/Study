package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리 {
    static class Solution {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        Queue<int[]> q = new LinkedList<>();

        public int solution(int[][] maps) {
            int answer = 0;
            int n = maps.length;
            int m = maps[0].length;
            bfs(maps, n, m);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(maps[i][j] + " ");
                }
                System.out.println();
            }

            if (maps[n-1][m-1] <= 1) return -1;
            return maps[n-1][m-1];
        }

        private void bfs(int[][] maps, int n, int m) {
            q.offer(new int[]{0, 0});

            while(!q.isEmpty()) {
                int[] tmp = q.poll();
                for (int i = 0; i < 4; i++) {
                    int nx = dx[i] + tmp[0];
                    int ny = dy[i] + tmp[1];

                    if (nx < 0 || ny < 0 ||
                            nx >= n || ny >= m || maps[nx][ny] == 0) continue;

                    maps[nx][ny] = maps[tmp[0]][tmp[1]] + 1;
                    q.offer(new int[]{nx, ny});
                }
            }
        }

        public static void main(String[] args) {
            Solution t = new Solution();
            t.solution(new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}});
        }
    }
}

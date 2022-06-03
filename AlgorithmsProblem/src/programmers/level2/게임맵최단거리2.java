package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리2 {
    class Solution {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        public int solution(int[][] maps) {
            int answer = 0;
            int[][] visited = new int[maps.length][maps[0].length];

            bfs(maps, visited);
            answer = visited[maps.length-1][maps[0].length-1];
            if (answer == 0) return -1;

            return answer;
        }

        private void bfs(int[][] maps, int[][] visited) {
            int x = 0;
            int y = 0;
            visited[x][y] = 1;
            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[]{x, y});

            while (!q.isEmpty()) {
                int[] current = q.poll();
                int cx = current[0];
                int cy = current[1];

                for (int i = 0; i < 4; i++) {
                    int nx = cx + dx[i];
                    int ny = cy + dy[i];

                    if (nx < 0 || ny < 0 || nx >= maps.length
                            || ny >= maps[0].length || maps[nx][ny] == 0) {
                        continue;
                    }

                    if (visited[nx][ny] == 0 && maps[nx][ny] == 1) {
                        visited[nx][ny] = visited[cx][cy] + 1;
                        q.offer(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}

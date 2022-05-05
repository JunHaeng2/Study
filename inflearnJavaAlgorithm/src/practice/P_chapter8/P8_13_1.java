package practice.P_chapter8;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P8_13_1 {
    static int[][] map;
    static int[][] visited;
    static int n;

    // 각각 상, 하, 좌, 우, 좌상, 우상, 좌하, 우하
    static int[] dy = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dx = {0, 0, -1, 1, -1, 1, -1, 1};

    private static void BFS(int i, int j) {
        Queue<Map> q = new LinkedList<>();

        q.offer(new Map(i, j));
        visited[i][j] = 1;

        while(!q.isEmpty()) {
            Map now = q.poll();
            for (int k = 0; k < 8; k++) {
                int ny = now.y + dy[k];
                int nx = now.x + dx[k];

                if (ny < 0 || ny >= n || nx < 0 || ny >= n || visited[ny][nx] == 1|| map[ny][nx] == 0) continue;
                visited[ny][nx] = 1;
                q.offer(new Map(ny, nx));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        map = new int[n][n];
        visited = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int island = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == 1 || map[i][j] == 0) continue;
                BFS(i, j);
                island++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(visited[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(island);
    }
}

class Map {
    int x;
    int y;
    public Map(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

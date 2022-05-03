package practice.P_chapter8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Location {
    int row, col;
    public Location(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

public class P8_11 {
    static int[][] graph;
    static int[][] visited;
    static int answer;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void BFS(int x, int y) {
        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(x, y));

        while (!queue.isEmpty()) {
            Location location = queue.poll();
            int row = location.row;
            int col = location.col;

            for (int i = 0; i < 4; i++) {
                int nx = row + dx[i];
                int ny = col + dy[i];

                if (check(nx, ny)) {
                    queue.add(new Location(nx, ny));
                    visited[nx][ny] = visited[row][col] + 1;
                }
            }
        }
    }

    public static boolean check(int x, int y) {
        if (x >= 7 || y >= 7 || x < 0 || y < 0 ) return false;
        if (visited[x][y] != 0 || graph[x][y] == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        BFS(0, 0);
        System.out.println(answer);
    }
}
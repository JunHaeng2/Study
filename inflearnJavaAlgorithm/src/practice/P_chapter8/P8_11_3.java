package practice.P_chapter8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point2 {
    int x;
    int y;
    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class P8_11_3 {
    static int[][] board, dis;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void BFS(int x, int y) {
        Queue<Point2> q = new LinkedList<>();
        Point2 point2 = new Point2(x, y);
        q.offer(point2);

        board[x][y] = 1;
        while(!q.isEmpty()) {
            Point2 tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if (nx <= 7 && nx >= 1 && ny <= 7 && ny >= 1 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    q.offer(new Point2(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        BFS(1, 1);
        if (dis[7][7] == 0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }
}

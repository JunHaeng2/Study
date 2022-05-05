package practice.P_chapter8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Mapping1 {
    int x, y;
    Mapping1 (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class P8_13_3 {
    static int[][] arr;
    static int n;
    static int answer;

    // 각각 상, 하, 좌, 우, 좌상, 우상, 좌하, 우하
    static int[] dy = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dx = {0, 0, -1, 1, -1, 1, -1, 1};
    static Queue<Mapping1> queue = new LinkedList<>();

    public static void BFS(int x, int y, int[][] arr) {
        queue.add(new Mapping1(x, y));

        while (!queue.isEmpty()) {
            Mapping1 tmp = queue.poll();
            for (int k = 0; k < 8; k++) {
                int nx = dx[k] + tmp.x;
                int ny = dy[k] + tmp.y;

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] == 1) {
                    arr[nx][ny] = 0;
                    queue.add(new Mapping1(nx, ny));
                }
            }
         }
    }

    public static void solution(int[][] board) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    board[i][j] = 0;
                    BFS(i, j, board);
                    answer++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        solution(arr);
        System.out.println(answer);
    }
}

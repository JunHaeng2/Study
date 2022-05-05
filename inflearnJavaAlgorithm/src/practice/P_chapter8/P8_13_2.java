package practice.P_chapter8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Mapping {
    int x, y;
    Mapping (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class P8_13_2 {
    static int[][] arr;
    static int n;
    static int answer;

    // 각각 상, 하, 좌, 우, 좌상, 우상, 좌하, 우하
    static int[] dy = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dx = {0, 0, -1, 1, -1, 1, -1, 1};
    static Queue<Mapping> queue = new LinkedList<>();

    public static void BFS(int x, int y, int[][] board) {
        queue.add(new Mapping(x, y));
        while(!queue.isEmpty()) {
            Mapping pos = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nx = pos.x + dx[i];
                int ny = pos.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    queue.add(new Mapping(nx, ny));
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
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        solution(arr);
        System.out.println(answer);
    }
}


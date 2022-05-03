package practice.P_chapter8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Location2 {
    int row, col;
    public Location2(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

public class P8_11_1 {
    static int[][] arr;
    static int[][] isVisited;
    static int n, m;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int cnt;

    public static void bfs() {
        Queue<Location2> queue = new LinkedList<>();
        queue.offer(new Location2(1, 1));

        while(!queue.isEmpty()) {
            Location2 location2 = queue.poll();
            int row = location2.row;
            int col = location2.col;

            for (int i = 0; i < 4; i++) {
                int nRow = row + dx[i];
                int nCol = col + dy[i];

                if (checkedPoint(nRow, nCol)) {
                    queue.offer(new Location2(nRow, nCol));
                    isVisited[nRow][nCol] = isVisited[row][col] + 1;
                }
            }
        }
    }

    public static boolean checkedPoint(int row, int col) {
        if (row > 8 || row < 0 || col > 8 || col < 0) return false;
        if (arr[row][col] == 1) return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        arr = new int[8][8];
        isVisited = new int[8][8];

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        bfs();
        System.out.println(arr[7][7]);
    }
}

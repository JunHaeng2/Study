import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon1260_1 {
    static int n, m, start;
    static int[][] arr;
    static boolean[] check;

    public static void dfs(int i) {
        check[i] = true;
        System.out.print(i + " ");

        for (int j = 1; j <= n; j++) {
            if (arr[i][j] == 1 && !check[j] ) {
                dfs(j);
            }
        }
    }

    public static void bfs(int i) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        check[i] = true;
        System.out.print(i + " ");

        while(!q.isEmpty()) {
            int row = q.poll();

            for (int j = 1; j <= n; j++) {
                if (arr[row][j] == 1 && !check[j]) {
                    q.offer(j);
                    check[j] = true;
                    System.out.print(j + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();

        arr = new int[n+1][n+1];
        check = new boolean[n+1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = arr[b][a] = 1;
        }

        dfs(start);
        System.out.println();
        check = new boolean[n+1];
        bfs(start);
    }
}

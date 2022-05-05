import java.util.Scanner;

public class BaekJoon1260 {
    static int[][] arr;
    static boolean[] check;
    static int n, m;
    static int start;

    public static void dfs(int i) {
        check[i] = true;
        System.out.print(i + " ");

        for(int j = 1; j <= n; j++) {
            if(arr[i][j] == 1 && !check[j]) {
                dfs(j);
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
    }
}

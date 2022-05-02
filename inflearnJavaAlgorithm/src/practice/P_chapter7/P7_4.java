package practice.P_chapter7;

public class P7_4 {
    //    public static int DFS(int n) {
//        if (n == 1) return 1;
//        else if (n == 2) return 1;
//        else return DFS(n - 2) + DFS(n - 1);
//    }
    static int[] fibo;

    public static int DFS(int n) {
        // 메모이제이션 활용!
        if (fibo[n] > 0) return fibo[n];

        if (n == 1) return fibo[n] = 1;
        else if(n == 2) return fibo[n] = 1;
        else return fibo[n] = DFS(n - 2) + DFS(n - 1);
    }

    public static void main(String[] args) {
        int n = 45;
        fibo = new int[n + 1];
        DFS(n);

        for (int i = 1; i <= n; i++) System.out.println(fibo[i] + " ");
    }
}


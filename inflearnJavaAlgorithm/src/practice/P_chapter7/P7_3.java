package practice.P_chapter7;

public class P7_3 {

    public static int DFS(int n) {
        if (n == 1) return 1;
        else {
            return n * DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        DFS(5);
    }
}

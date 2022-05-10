package practice.P_chapter7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class P7_3 {
    static Queue<Integer> q = new LinkedList<>();

    public static int DFS(int n) {
        if (n == 1) return 1;
        else {
            return n * DFS(n - 1);
        }
    }

    ArrayList<Integer> arr = new ArrayList<>(;)

    public static void main(String[] args) {
        DFS(5);
    }
}

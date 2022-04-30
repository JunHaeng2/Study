package practice.P_chapter5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P5_6 {

    public static int solution(int n, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i < n + 1; i++) {
            dq.add(i);
        }

        int cnt = 1;
        while (true) {
            if (dq.size() == 1) break;
            if (cnt == k) {
                cnt = 1;
                int x =dq.pollFirst();
            }

            dq.add(dq.pollFirst());
            cnt++;
        }

        // 1 2 3 4 5 6 7 8

        return dq.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(solution(n, k));
    }
}

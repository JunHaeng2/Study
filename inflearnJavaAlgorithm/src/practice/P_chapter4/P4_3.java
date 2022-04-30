package practice.P_chapter4;

import java.util.HashMap;
import java.util.Scanner;

public class P4_3 {

    public static String solution(int n, int k, int[] arr) {

        // 맞긴 했는데 시간초과 ㅠ

        String answer = "";
        int lt = 0;
        int rt = k - 1;
        int cnt = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        answer += String.valueOf(map.size()) + " ";

        // 0 1 2 3 4 5 6

        while (true) {
            map.put(arr[lt], map.getOrDefault(arr[lt], 0) - 1);
            if (map.get(arr[lt]) == 0) map.remove(arr[lt]);

            lt++;
            rt++;

            if (rt == n) break;

            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            if (map.get(arr[lt]) == 0) map.remove(arr[lt]);

            answer += String.valueOf(map.size()) + " ";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, k, arr));
    }
}

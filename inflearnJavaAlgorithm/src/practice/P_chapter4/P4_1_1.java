package practice.P_chapter4;

import java.util.HashMap;
import java.util.Scanner;

public class P4_1_1 {

    public static char solution(int n, String str) {
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<>();
        for (char key : str.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int maxValue = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if (map.get(key) > maxValue) {
                maxValue = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(solution(n, str));
    }
}

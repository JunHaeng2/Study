package practice.P_chapter4;

import java.util.HashMap;
import java.util.Scanner;

public class P4_2 {

    public static String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (Character key : str1.toCharArray()) {
            map1.put(key, map1.getOrDefault(key, 0) + 1);
        }

        for (Character key : str2.toCharArray()) {
            map2.put(key, map2.getOrDefault(key, 0) + 1);
        }

        for (Character key : map1.keySet()) {
            if (map1.get(key) != map2.get(key)) {
                return "NO";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(solution(str1, str2));
    }
}

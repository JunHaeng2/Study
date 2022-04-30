package practice.P_chapter4;

import java.util.HashMap;
import java.util.Scanner;

public class P4_4 {

    public static int solution(String str1, String str2) {
        int answer = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char key : str2.toCharArray()) {
            map2.put(key, map2.getOrDefault(key, 0) + 1);
        }

        int lt = 0;
        for (int rt = map2.size(); rt < map1.size(); rt++) {

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

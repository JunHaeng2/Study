package practice.P_chapter1;

import java.util.ArrayList;
import java.util.Scanner;

public class P1_4 {

    public static ArrayList<String> solution(int n, String[] arr) {
        ArrayList<String> answer = new ArrayList<>();

        for (String word : arr) {
            String ans = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                ans += word.charAt(i);
            }

            answer.add(ans);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        for (String x : solution(n, str)) {
            System.out.println(x);
        }
    }
}

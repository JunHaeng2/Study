package practice.P_chapter1;

import java.util.Scanner;

public class P1_11 {

    public static String solution(String str) {
        String answer = "";

        // 간단한데 매우 좋은 아이디어..!
        str = str + " ";

        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt += 1;
            } else {
                answer += str.charAt(i);
                if (cnt == 1) continue;
                else answer += String.valueOf(cnt);
                cnt = 1;
            }

            if (i == str.length() - 1) {

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }
}

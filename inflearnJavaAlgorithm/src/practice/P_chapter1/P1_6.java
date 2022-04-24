package practice.P_chapter1;

import java.util.Scanner;

public class P1_6 {

    public static String solution(String str) {
        String answer = "";

        for (char c : str.toCharArray()) {
            if (answer.contains(String.valueOf(c))) {
                continue;
            } else {
                answer += String.valueOf(c);
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

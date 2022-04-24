package practice.P_chapter1;

import java.util.Scanner;

public class P1_9 {

    public static Integer solution(String str) {
        String answer = "";

        for (char c : str.toCharArray()) {
            if ( ((int) c) >= 48 & ((int) c) <= 57 ) {
                answer += String.valueOf(c);
            }
        }

        return Integer.valueOf(answer);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }

}

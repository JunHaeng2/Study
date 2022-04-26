package practice.P_chapter1;

import java.util.Scanner;

public class P1_10 {

    public static String solution(String str1, String str2) {
        String answer = "";
        int m = 0;

        for (char c : str1.toCharArray()) {
            for (int i = 0; i < str1.length(); i++) {

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] strTwo = str.split(" ");

        System.out.println(solution(strTwo[0], strTwo[1]));
    }
}

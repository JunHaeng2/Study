package practice.P_chapter1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P1_2 {

    public static String solution(String s) {

        String[] ans = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int ASCIICODE = (int) s.charAt(i);

            if (ASCIICODE  >= 65 && ASCIICODE  <= 90 ) {
                ans[i] = String.valueOf(s.charAt(i)).toLowerCase();
            } else {
                ans[i] = String.valueOf(s.charAt(i)).toUpperCase();
            }
        }
        return Arrays
                .stream(ans)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(solution(s));
    }
}

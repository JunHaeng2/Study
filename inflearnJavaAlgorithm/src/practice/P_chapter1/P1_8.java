package practice.P_chapter1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class P1_8 {

    // 틀렸음

    public static String solution(String str) {

        ArrayList<String> arr = new ArrayList<>();
        String s = "";

        for (char c : str.toCharArray()) {
            if (Character.isAlphabetic(c)) s += c;
        }

        s = s.toLowerCase();

        // 쉽게 문자 거꾸로,.!
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equals(tmp)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }
}

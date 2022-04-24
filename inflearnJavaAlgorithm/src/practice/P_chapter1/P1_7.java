package practice.P_chapter1;

import java.util.ArrayList;
import java.util.Scanner;

public class P1_7 {

    public static String solution(String str) {
        str = str.toLowerCase();

        int n = str.length();
        int midLength = n / 2;

//        4 0 1 2 3
//        5 0 1 2 3 4

        if (n % 2 == 0) {
            for (int i = 0; i < midLength; i++) {
                if (str.charAt(i) != str.charAt(n - 1 - i)) {
                    return "NO";
                }
            }
        } else {
            for (int i = 0; i < midLength + 1; i++) {
                if (str.charAt(i) != str.charAt(n - 1 - i)) {
                    return "NO";
                }
            }
        }

        return "YES";

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }
}

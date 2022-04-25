package practice.P_chapter1;

import java.util.Scanner;

public class P1_1 {

    private static int problem(String word, String c) {
        int cnt = 0;

        for (int i = 0; i < word.length(); i++) {
            String ans = String.valueOf(word.charAt(i)).toLowerCase();

            if (c.toLowerCase().equals(ans)) {
                cnt += 1;
            }

            //

        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();
        String c = in.nextLine();

        System.out.println(problem(word, c));
    }
}
